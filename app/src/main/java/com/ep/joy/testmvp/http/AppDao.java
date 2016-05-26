package com.ep.joy.testmvp.http;

import com.ep.joy.testmvp.model.Bean;
import com.ep.joy.testmvp.model.TianGou;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.HashMap;
import java.util.Map;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description:
 */
public class AppDao {
    private static AppDao instance;

    public static synchronized AppDao getInstance() {
        if (instance == null) {
            instance = new AppDao();
        }
        return instance;
    }


    private AppDao() {
    }


    public Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        return map;
    }


    public void getbean(MyCallBack<Bean> callback) {
        RequestParams params = new RequestParams("http://gank.io/api/data/福利/30/1");
        x.http().get(params, callback);
    }

    public void getimg(MyCallBack<TianGou> callback) {
        RequestParams params = new RequestParams("http://www.tngou.net/tnfs/api/news?id=4");
        x.http().get(params, callback);
    }
}
