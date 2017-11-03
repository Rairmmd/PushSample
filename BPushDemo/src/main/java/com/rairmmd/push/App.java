package com.rairmmd.push;

import android.app.Application;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;

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
        PushManager.startWork(this, PushConstants.LOGIN_TYPE_API_KEY, "xxxx");
    }
}
