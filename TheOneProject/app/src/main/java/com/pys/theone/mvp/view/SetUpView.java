package com.pys.theone.mvp.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

import com.pys.theone.R;
import com.pys.theone.activity.MainActivity;
import com.pys.theone.bean.UserOutBean;
import com.pys.theone.mvp.base.BaseView;
import com.pys.theone.mvp.contract.SetUpContract;
import com.pys.theone.mvp.presenter.SetUpPresenter;

/**
 * Created by Administrator on 2018/12/10 0010.
 */

public class SetUpView extends BaseView implements SetUpContract.View {
    private LayoutInflater mInflater;
    private View mView;
    private SetUpPresenter mPresenter;
    private Handler handler = new Handler() {
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            switch (msg.what) {
                case 0:
                    mContext.startActivity(new Intent(mContext, MainActivity.class));
                    ((Activity) mContext).finish();
                    break;
            }
        }
    };

    public void setPresenter(SetUpPresenter presenter) {
        mPresenter = presenter;
    }

    public SetUpView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public View obtainRootView() {
        mView = mInflater.inflate(R.layout.activity_setup, null);
        initView();
        initData();
        return mView;
    }
    private void initView() {
    }
    /**
     * 初始化数据
     */
    private void initData() {
        String pCustID = "pujkj";
        if (!TextUtils.isEmpty(pCustID)) {
            mPresenter.getInfo(pCustID);
        }
        delay();
    }

    private void delay() {
        Message msg = Message.obtain();
        msg.what = 0;
        handler.sendMessageDelayed(msg, 1500);
    }

    @Override
    public void getInfoSuccess(UserOutBean bean) {
        if (bean != null) {
        }
    }
}
