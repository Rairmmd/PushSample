package com.rair.push;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @author Rair
 * @date 2017/11/3
 * <p>
 * desc:
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);
    }
}
