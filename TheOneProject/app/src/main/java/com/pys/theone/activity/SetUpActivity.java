package com.pys.theone.activity;

import android.os.Bundle;

import com.pys.theone.mvp.base.BaseActivity;
import com.pys.theone.mvp.model.SetUpModel;
import com.pys.theone.mvp.presenter.SetUpPresenter;
import com.pys.theone.mvp.view.SetUpView;

/**
 * Created by Administrator on 2018/12/10 0010.
 */

public class SetUpActivity extends BaseActivity {
    private SetUpView mView;
    private SetUpPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mView.obtainRootView());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void initPresenters() {
        mView = new SetUpView(this);
        mPresenter = new SetUpPresenter();
        mPresenter.setContext(this);
        mView.setPresenter(mPresenter);
        mPresenter.setViewAndModel(mView, new SetUpModel());
    }
}
