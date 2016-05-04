package com.ep.joy.testmvp.ui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ep.joy.testmvp.R;
import com.ep.joy.testmvp.model.Bean;
import com.ep.joy.testmvp.presenter.MainPresenter;
import com.ep.joy.testmvp.view.MainView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;


/*
      UI,只需要负责展示数据，并不关心数据的来源。
 */

public class MainActivity extends AppCompatActivity implements MainView {

    @ViewInject(R.id.btn)
    private Button mButton;

    @ViewInject(R.id.tv)
    private TextView mTextView;

    @ViewInject(R.id.bar)
    private ProgressBar mProgressBarl;

    private MainPresenter mMainPresenter;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);

        mButton.setVisibility(View.GONE);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText(mMainPresenter.updateUi());
            }
        });


        mMainPresenter = new MainPresenter(this);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mMainPresenter.loadDate();
                mButton.setVisibility(View.VISIBLE);
            }
        }, 2000);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
        mMainPresenter.detachView();
    }

    @Override
    public void showData(Bean bean) {
        mTextView.setText(bean.getResults().get(0).toString());
    }


    @Override
    public void showProgress() {
        mProgressBarl.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBarl.setVisibility(View.GONE);
    }

}
