package com.pys.theone.mvp.view;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pys.theone.R;
import com.pys.theone.mvp.base.BaseView;
import com.pys.theone.utils.CommonUtils;

/**
 * Created by Administrator on 2019/3/11 0011.
 */

public class ThreeView extends BaseView {
    private LayoutInflater mInflater;
    private View mView;
    private TextView mTxt;
    public ThreeView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public View obtainRootView() {
        mView=mInflater.inflate(R.layout.fragment_three,null);
        initView();
        initData();
        return mView;
    }
    private void initView() {
        mTxt=findView(mView,R.id.text);
    }

    private void initData() {
        int statusBarHeight = CommonUtils.getStatusBarHeight((Activity) mContext);
        if (statusBarHeight > 0) {
            int add = CommonUtils.dip2px(mContext, 10);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.setMargins(0, statusBarHeight + add, 0, 0);
            mTxt.setLayoutParams(lp);
        }
    }
    public void loadData() {
    }
}
