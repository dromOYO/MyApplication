package com.example.xiantong.myapplication;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Mr.Lee on 2017/8/8.
 */

public class MyApplication extends com.activeandroid.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
        ActiveAndroid.dispose();
    }
}
