package com.ep.joy.testmvp.presenter;

import com.ep.joy.testmvp.model.Bean;
import com.ep.joy.testmvp.model.TianGou;
import com.ep.joy.testmvp.model.imp.DoBean;
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

    public MainPresenter(MainView view) {
        attachView(view);
        doBean = new DoBean(this);
    }

    public void loadDate() {
        mMainView.showProgress();
        doBean.loaddate();
    }

    public void updateUi() {
        mMainView.showProgress();
        doBean.getGank();
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
    public void loadSuccess(TianGou beanBean) {
        mMainView.showData(beanBean);
        mMainView.hideProgress();
    }

    @Override
    public void loadSuccess(Bean beanBean) {
        mMainView.doOnclick(beanBean);
        mMainView.hideProgress();
    }

    @Override
    public void loadFailed() {
        mMainView.hideProgress();
    }
}
