package com.ep.joy.testmvp.presenter;

import com.ep.joy.testmvp.model.Bean;
import com.ep.joy.testmvp.model.DoBean;
import com.ep.joy.testmvp.view.MainView;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description: view和model的桥梁，它从model层得到数据后，返回给view层
 */
public class MainPresenter implements Presenter<MainView>, IMainPresenter {
    private DoBean doBean;
    private MainView mMainView;
    private Bean mBean;

    public MainPresenter(MainView view) {
        attachView(view);
        doBean = new DoBean(this);
    }

    public void loadDate() {
        mMainView.showProgress();
        doBean.loaddate();
    }

    public String updateUi() {

        return mBean.getResults().get(0).getWho();
    }


    @Override
    public void attachView(MainView view) {
        this.mMainView = view;
    }

    @Override
    public void detachView() {
        this.mMainView = null;
    }


    @Override
    public void loadSuccess(Bean beanBean) {
        this.mBean = beanBean;
        mMainView.showData(beanBean);
        mMainView.hideProgress();
    }

    @Override
    public void loadFailed() {
        mMainView.hideProgress();
    }
}
