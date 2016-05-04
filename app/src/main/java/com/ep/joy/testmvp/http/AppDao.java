package com.ep.joy.testmvp.http;

import com.ep.joy.testmvp.model.Bean;

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


    public void getbean(String url, MyCallBack<Bean> callback) {
        Map<String, String> map = createMap();
        RequestParams params = new RequestParams(url);
        x.http().get(params, callback);
    }
}
