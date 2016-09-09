package dys.bdindoormapdemo.api;

import dys.bdindoormapdemo.bean.ServiceFacilitiesBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by dys on 2016/9/8 0008.
 */
public interface ApiService {
    //获取服务设施
    @POST(NetConstants.GET_SERVICE_FACILITIES_BY_STATION_ID)
    @FormUrlEncoded
    Observable<ServiceFacilitiesBean> getServiceFacilitesByStationId(@Field("stationId") String stationId);

//    //获取服务设施
//    @POST(NetConstants.GET_SERVICE_FACILITIES_BY_STATION_ID)
//    Call<ServiceFacilitiesBean> getServiceFacilitesByStationId(@Query("stationId") String stationId);
}
