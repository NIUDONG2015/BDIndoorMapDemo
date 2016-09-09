package dys.bdindoormapdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.MapPoi;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.map.UiSettings;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dys.bdindoormapdemo.api.NetConstants;
import dys.bdindoormapdemo.api.RetrofitManager;
import dys.bdindoormapdemo.bean.FacilitiesByFloor;
import dys.bdindoormapdemo.bean.ServiceFacilitiesBean;
import dys.bdindoormapdemo.indoorview.BaseStripAdapter;
import dys.bdindoormapdemo.indoorview.StripListView;
import dys.bdindoormapdemo.overlayutil.OverlayManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 百度室内地图
 * 地理围栏、自定义路径
 */
public class MainActivity extends AppCompatActivity implements BaiduMap.OnBaseIndoorMapListener,
        BaiduMap.OnMapLoadedCallback {

    private MapView mMapView;
    private BaiduMap mBaiduMap;
    private RelativeLayout mLayout;
    private UiSettings mUiSettings;
    //楼层list
    private StripListView stripView;
    private BaseStripAdapter mFloorListAdapter;
    private MapBaseIndoorMapInfo mMapBaseIndoorMapInfo = null;
    private List<FacilitiesByFloor> mFacilitiesByFloors = new ArrayList<>();
    private InfoWindow mInfoWindow;
    private TextView tvPoint;

    BitmapDescriptor mBlueTexture = BitmapDescriptorFactory.fromAsset("icon_road_blue_arrow.png");
    BitmapDescriptor bd = BitmapDescriptorFactory.fromResource(R.drawable.icon_gcoding);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        configs();
        findViewById(R.id.btn_init_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawLine();
                getServiceFacilities();
            }
        });
    }

    private void initView() {
        Log.i("initview>>>>>>",".。。。。。。。。。。");
        mMapView = (MapView) findViewById(R.id.mapView);
        mLayout = (RelativeLayout) findViewById(R.id.viewStub);
        tvPoint = (TextView)findViewById(R.id.tv_point);
        stripView = new StripListView(this);
        mLayout.addView(stripView);
        mFloorListAdapter = new BaseStripAdapter(this);
        mBaiduMap = mMapView.getMap();
        mUiSettings = mBaiduMap.getUiSettings();
    }

    /**
     * 配置百度地图参数
     */
    private void configs() {
        //禁止旋转
//        mUiSettings.setRotateGesturesEnabled(false);
        //打开室内图
        mBaiduMap.setIndoorEnable(true);
        //设置室内图数据监听
        mBaiduMap.setOnBaseIndoorMapListener(this);
        //设置地图加载结束监听
        mBaiduMap.setOnMapLoadedCallback(this);
        //楼层list点击监听
        stripView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (mMapBaseIndoorMapInfo == null) {
                    return;
                }
                String floor = (String) mFloorListAdapter.getItem(i);
                mBaiduMap.switchBaseIndoorMapFloor(floor, mMapBaseIndoorMapInfo.getID());
                mFloorListAdapter.setSelectedPostion(i);
                mFloorListAdapter.notifyDataSetChanged();
                mBaiduMap.clear(); //先清空，再添加
                addMarker(floor);
            }
        });
        //设置标记点点击监听
        mBaiduMap.setOnMarkerClickListener(new BaiduMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
//                Toast.makeText(getApplicationContext(),marker.getTitle(),Toast.LENGTH_SHORT).show();
                Button button = new Button(getApplicationContext());
                button.setBackgroundResource(R.drawable.popup);
                button.setTextColor(Color.BLACK);
                button.setText(marker.getTitle());
                InfoWindow.OnInfoWindowClickListener listener = null;
                mInfoWindow = new InfoWindow(BitmapDescriptorFactory.fromView(button),marker.getPosition(),-40,listener);
                mBaiduMap.showInfoWindow(mInfoWindow);
                tvPoint.setText(String.format("经度:%f\n纬度:%f", marker.getPosition().longitude, marker.getPosition().latitude));
                return true;
            }
        });
        //地图点击监听
        mBaiduMap.setOnMapClickListener(new BaiduMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                tvPoint.setText(String.format("经度:%f\n纬度:%f", latLng.longitude, latLng.latitude));
            }

            @Override
            public boolean onMapPoiClick(MapPoi mapPoi) {
                return false;
            }
        });
        //设置地图状态变化监听
        mBaiduMap.setOnMapStatusChangeListener(new BaiduMap.OnMapStatusChangeListener() {
            @Override
            public void onMapStatusChangeStart(MapStatus mapStatus) {
                Log.d("zoom start>>>>>", "" + mapStatus.zoom);
                if (mapStatus.zoom <= 18f) {
//                    setMapStatusLimits();
                }
            }

            @Override
            public void onMapStatusChange(MapStatus mapStatus) {
                Log.i("zoom change>>>>>", "" + mapStatus.zoom);
            }

            @Override
            public void onMapStatusChangeFinish(MapStatus mapStatus) {
                Log.d("zoom finish>>>>>", "" + mapStatus.zoom);
                if (mapStatus.zoom <= 18f) {
//                    setMapStatusLimits();
                }
            }
        });
    }

    /**
     * 往地图上添加标记点
     * @param curFloor
     */
    public void addMarker(String curFloor) {
        curFloor = String.valueOf(curFloor.charAt(1));
        for (int i = 0; i < mFacilitiesByFloors.size(); i++) {
            if (mFacilitiesByFloors.get(i).getFloor().equals(curFloor)) {
                //构建MarkerOption，用于在地图上添加Marker
                MarkerOptions option = new MarkerOptions()
                        .position(mFacilitiesByFloors.get(i).getLatLng())
                        .title(mFacilitiesByFloors.get(i).getName())
                        .icon(bd);
                //在地图上添加Marker，并显示
                mBaiduMap.addOverlay(option);
            }
        }
    }

    /**
     * 初始化各楼层标记点数据
     */
    private void getServiceFacilities() {
        Gson gson = new Gson();
        ServiceFacilitiesBean serviceFacilitiesBean = gson.fromJson(NetConstants.testJson, ServiceFacilitiesBean.class);
        mFacilitiesByFloors.clear();
        for (int i = 0; i < serviceFacilitiesBean.getData().getFacilityServices().size(); i++) {
            for (int j = 0; j < serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().size(); j++) {
                for (int k = 0; k < serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().get(j).getSecondFacilityList().size(); k++) {
                    String name = serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().get(j).getSecondFacilityList().get(k).getName();
                    String lng = serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().get(j).getSecondFacilityList().get(k).getLongitude();
                    String lat = serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().get(j).getSecondFacilityList().get(k).getLatitude();
                    int floor = serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().get(j).getSecondFacilityList().get(k).getFloor();
                    String id = serviceFacilitiesBean.getData().getFacilityServices().get(i).getFirstFacilityList().get(j).getSecondFacilityList().get(k).getId();
                    mFacilitiesByFloors.add(new FacilitiesByFloor(name, new LatLng(Float.parseFloat(lat), Float.parseFloat(lng)), String.valueOf(floor)));
                    Log.i("serviceFacilities>>>>", name + ",lng&lat=" + lng + "," + lat + ",floor=" + floor+",id="+id);
                }
            }
        }
        Log.e("serviceFacilities", "-------------------------------------------------");

    }

    /**
     * 楼层信息加载回调
     * @param b
     * @param mapBaseIndoorMapInfo
     */
    @Override
    public void onBaseIndoorMapMode(boolean b, MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        if (b) {
            stripView.setVisibility(View.VISIBLE);
            if (mapBaseIndoorMapInfo == null) {
                return;
            }
            mapBaseIndoorMapInfo.getCurFloor();
            Log.i("floorList & curFloor", mapBaseIndoorMapInfo.getFloors().size() + ","
                    + mapBaseIndoorMapInfo.getCurFloor());
            mFloorListAdapter.setmFloorList(mapBaseIndoorMapInfo.getFloors());
            for (int i = 0; i < mapBaseIndoorMapInfo.getFloors().size(); i++) {
                if (mapBaseIndoorMapInfo.getCurFloor().equals(mapBaseIndoorMapInfo.getFloors().get(i))) {
                    mFloorListAdapter.setSelectedPostion(i);
                }
            }
            stripView.setStripAdapter(mFloorListAdapter);
        } else {
            stripView.setVisibility(View.GONE);
            Log.i("floorList>>","stripView gone");
        }
        mMapBaseIndoorMapInfo = mapBaseIndoorMapInfo;
        //加载完室内楼层数据后初始化室内的点集信息
        getServiceFacilities();
    }

    @Override
    public void onMapLoaded() {
        setMapStatusLimits();
    }

    /**
     * 设置地理围栏
     */
    private void setMapStatusLimits() {
//        郑州东站
//        34.7671480000,113.7891930000
//        34.7634110000,113.7818180000
//        北京西站
//        39.9022770000, 116.3291770000
//        39.8991430000, 116.3265000000
        mBaiduMap.setMapStatusLimits(new LatLngBounds.Builder()
                .include(new LatLng(34.7671480000, 113.7891930000))
                .include(new LatLng(34.7634110000, 113.7818180000))
                .build());
    }

    @Override
    protected void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        mMapView.onResume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        // 退出时销毁定位
//        mLocClient.stop();
        // 关闭定位图层
//        mBaiduMap.setMyLocationEnabled(false);
        mMapView.onDestroy();
        mMapView = null;
        super.onDestroy();
    }

    private void drawLine() {
        // 添加多纹理分段的折线绘制
        LatLng p111 = new LatLng(34.765446, 113.783401);
        LatLng p211 = new LatLng(34.765068, 113.783592);
        LatLng p311 = new LatLng(34.764675, 113.783424);
        LatLng p411 = new LatLng(34.764717, 113.783920);
        List<LatLng> points11 = new ArrayList<LatLng>();
        points11.add(p111);
        points11.add(p211);
        points11.add(p311);
        points11.add(p411);
        List<BitmapDescriptor> textureList = new ArrayList<BitmapDescriptor>();
        textureList.add(mBlueTexture);
        List<Integer> textureIndexs = new ArrayList<Integer>();
        textureIndexs.add(0);
        OverlayOptions ooPolyline11 = new PolylineOptions().width(16)
                .points(points11).dottedLine(true).customTextureList(textureList).textureIndex(textureIndexs);
        mBaiduMap.addOverlay(ooPolyline11);
    }

}
