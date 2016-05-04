package com.ep.joy.testmvp.presenter;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description:
 */
public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
