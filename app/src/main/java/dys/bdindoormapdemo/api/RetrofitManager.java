package dys.bdindoormapdemo.api;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dys on 2016/9/8 0008.
 */
public class RetrofitManager {
    private static RetrofitManager mRetrofitManager;
    private ApiService mService;

    private RetrofitManager(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetConstants.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mService = retrofit.create(ApiService.class);
    }

    public static RetrofitManager getInstance(){
        if (mRetrofitManager == null){
            synchronized (RetrofitManager.class){
                if (mRetrofitManager == null){
                    mRetrofitManager = new RetrofitManager();
                }
            }
        }
        return mRetrofitManager;
    }

    public ApiService getService(){
        return mService;
    }
}
