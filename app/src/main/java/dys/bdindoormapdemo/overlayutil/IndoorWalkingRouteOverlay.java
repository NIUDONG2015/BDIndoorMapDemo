package dys.bdindoormapdemo.overlayutil;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.map.Polyline;

import java.util.List;

/**
 * Created by dys on 2016/9/7 0007.
 */
public class IndoorWalkingRouteOverlay extends OverlayManager {
    /**
     * 通过一个BaiduMap 对象构造
     *
     * @param baiduMap
     */
    public IndoorWalkingRouteOverlay(BaiduMap baiduMap) {
        super(baiduMap);
    }

    @Override
    public List<OverlayOptions> getOverlayOptions() {
        return null;
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    @Override
    public boolean onPolylineClick(Polyline polyline) {
        return false;
    }
}
