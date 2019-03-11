package com.pys.theone.mvp.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.pys.theone.utils.MyLoadingDialog;


/**
 * Created by Administrator on 2016/11/28.
 */
public abstract class BaseView implements IBaseView {
    protected Context mContext;
    protected Activity mActivity;

    public BaseView(Context context) {
        mContext = context;
        mActivity=(Activity) context;
    }

    @Override
    public void showLoadingView() {
        MyLoadingDialog.showLoadingDialog(mContext);
    }

    @Override
    public void dismissLoadingView() {
        MyLoadingDialog.closeDialog();
    }

    @SuppressLint("WrongConstant")
    @Override
    public void showToast(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onViewDestroy() {
    }
    protected <T extends View> T findView(View view, int id) {
        return (T) view.findViewById(id);
    }
}
