package dys.bdindoormapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.UiSettings;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;

import dys.bdindoormapdemo.indoorview.BaseStripAdapter;
import dys.bdindoormapdemo.indoorview.StripListView;

/**
 * 百度室内地图
 * 地理围栏、自定义路径
 */
public class MainActivity extends AppCompatActivity implements BaiduMap.OnBaseIndoorMapListener, BaiduMap.OnMapLoadedCallback {

    private MapView mMapView;
    private BaiduMap mBaiduMap;
    private RelativeLayout mLayout;
    private UiSettings mUiSettings;
    //楼层list
    private StripListView stripView;
    private BaseStripAdapter mFloorListAdapter;
    private MapBaseIndoorMapInfo mMapBaseIndoorMapInfo = null;
    private boolean isFirstZoom = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //禁止旋转
        mUiSettings.setRotateGesturesEnabled(false);
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
            }
        });
        //设置地图状态变化监听
        mBaiduMap.setOnMapStatusChangeListener(new BaiduMap.OnMapStatusChangeListener() {
            @Override
            public void onMapStatusChangeStart(MapStatus mapStatus) {
                Log.d("zoom start>>>>>", "" + mapStatus.zoom);
                if (mapStatus.zoom <= 19f) {
                    setMapStatusLimits();
                }
            }

            @Override
            public void onMapStatusChange(MapStatus mapStatus) {
                Log.i("zoom change>>>>>", "" + mapStatus.zoom);
            }

            @Override
            public void onMapStatusChangeFinish(MapStatus mapStatus) {
                Log.d("zoom finish>>>>>", "" + mapStatus.zoom);
//                if (isFirstZoom){
//                    isFirstZoom = false;
//                    setMapStatusLimits();
//                    return;
//                }
                if (mapStatus.zoom <= 19.7f) {
                    setMapStatusLimits();
                }
            }
        });
    }

    private void initView() {
        mMapView = (MapView) findViewById(R.id.mapView);
        mLayout = (RelativeLayout) findViewById(R.id.viewStub);
        stripView = new StripListView(this);
        mLayout.addView(stripView);
        mFloorListAdapter = new BaseStripAdapter(this);
        mBaiduMap = mMapView.getMap();
        mUiSettings = mBaiduMap.getUiSettings();
    }

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
                if (mapBaseIndoorMapInfo.getCurFloor().equals(mapBaseIndoorMapInfo.getFloors().get(i))){
                    mFloorListAdapter.setSelectedPostion(i);
                }
            }
            stripView.setStripAdapter(mFloorListAdapter);
        } else {
            stripView.setVisibility(View.GONE);
        }
        mMapBaseIndoorMapInfo = mapBaseIndoorMapInfo;
    }

    @Override
    public void onMapLoaded() {
        setMapStatusLimits();
    }

    /**
     * 设置地理围栏
     */
    private void setMapStatusLimits() {
        mBaiduMap.setMapStatusLimits(new LatLngBounds.Builder()
                .include(new LatLng(39.9022770000, 116.3291770000))
                .include(new LatLng(39.8991430000, 116.3265000000))
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
}
