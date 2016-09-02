package dys.bdindoormapdemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by dys on 2016/9/2 0002.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
