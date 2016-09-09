package dys.bdindoormapdemo.bean;

import com.baidu.mapapi.model.LatLng;

/**
 * Created by dys on 2016/9/8 0008.
 */
public class FacilitiesByFloor {
    private String name;
    private LatLng mLatLng;
    private String floor;

    public FacilitiesByFloor(String name, LatLng latLng, String floor) {
        this.name = name;
        mLatLng = latLng;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LatLng getLatLng() {
        return mLatLng;
    }

    public void setLatLng(LatLng latLng) {
        mLatLng = latLng;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
