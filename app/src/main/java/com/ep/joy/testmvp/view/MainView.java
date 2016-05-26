package com.ep.joy.testmvp.view;

import com.ep.joy.testmvp.model.Bean;
import com.ep.joy.testmvp.model.TianGou;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description: 首页的UI接口，用于数据变化后，控件改变。
 */
public interface MainView {
    void showData(TianGou bean);

    void doOnclick(Bean bean);

    void showProgress();

    void hideProgress();


}
