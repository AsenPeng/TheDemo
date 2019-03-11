package com.pys.theone.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowManager;

import com.pys.theone.R;
import com.pys.theone.mvp.base.BaseActivity;
import com.pys.theone.mvp.model.MainModel;
import com.pys.theone.mvp.presenter.MainPresenter;
import com.pys.theone.mvp.view.MainView;


public class MainActivity extends BaseActivity {
    private MainView mView;
    private MainPresenter mPresenter;
    //退出时的时间
    private long mExitTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mView.obtainRootView());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); //透明状态栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);//透明导航栏
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    //对返回键进行监听
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void exit() {
        if ((System.currentTimeMillis() - mExitTime) > 2000) {
            mView.showToast("再按一次退出" + getResources().getString(R.string.app_name));
            mExitTime = System.currentTimeMillis();
        } else {
            MyApplication.getInstance().exit();
            System.exit(0);
        }
    }

    @Override
    protected void initPresenters() {
        mView = new MainView(this);
        mPresenter = new MainPresenter();
        mPresenter.setContext(this);
        mView.setPresenter(mPresenter);
        mPresenter.setViewAndModel(mView, new MainModel());
    }
}
