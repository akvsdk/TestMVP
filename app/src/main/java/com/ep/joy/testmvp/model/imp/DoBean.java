package com.ep.joy.testmvp.model.imp;

import com.ep.joy.testmvp.http.AppDao;
import com.ep.joy.testmvp.http.MyCallBack;
import com.ep.joy.testmvp.model.Bean;
import com.ep.joy.testmvp.model.TianGou;
import com.ep.joy.testmvp.presenter.IMainPresenter;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description: 业务具体处理，包括负责存储、检索、操纵数据等
 */
public class DoBean {
    private IMainPresenter mMainPresenter;

    public DoBean(IMainPresenter iMainPresenter) {
        this.mMainPresenter = iMainPresenter;
    }

    public void loaddate() {
        AppDao.getInstance().getimg(new MyCallBack<TianGou>() {
            @Override
            public void onSuccess(TianGou result) {
                mMainPresenter.loadSuccess(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                super.onError(ex, isOnCallback);
                mMainPresenter.loadFailed();
            }
        });
    }

    public void getGank() {
        AppDao.getInstance().getbean(new MyCallBack<Bean>() {
            @Override
            public void onSuccess(Bean result) {
                mMainPresenter.loadSuccess(result);

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                super.onError(ex, isOnCallback);
                mMainPresenter.loadFailed();
            }
        });

    }
}
