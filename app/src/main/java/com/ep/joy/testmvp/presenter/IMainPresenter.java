package com.ep.joy.testmvp.presenter;

import com.ep.joy.testmvp.model.Bean;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description：链接model
 */
public interface IMainPresenter {

    void loadSuccess(Bean beanBean);

    void loadFailed();


}
