package com.ep.joy.testmvp;

import android.app.Application;

import org.xutils.x;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }
}
