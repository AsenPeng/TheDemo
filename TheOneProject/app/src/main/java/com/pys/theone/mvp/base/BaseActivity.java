package com.pys.theone.mvp.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pys.theone.R;
import com.pys.theone.activity.MyApplication;

/**
 * Created by Administrator on 2016/11/17.
 */
public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {
    /**
     * 返回按钮
     */
    public RelativeLayout mReturn;
    /**
     * 标题
     */
    public TextView mTitle;
    /**
     * 右边标题
     */
    public TextView mRightTitle;
    /**
     * 右侧图片按钮
     */
    public ImageView mRightIcon;

    /**
     * 设置标题以及返回按钮
     *
     * @param title          标题
     * @param mHasRightTitle 右侧标题
     * @param hasreturn      返回按钮是否显示
     */
    @SuppressLint("WrongConstant")
    public void setTitle(String title, String mHasRightTitle, boolean hasreturn) {
        mReturn = findView(R.id.left_return);
        mTitle = findView(R.id.title);
        mRightTitle = findView(R.id.right_title);
        mRightIcon = findView(R.id.right_icon);
        mTitle.setText(title);
        mRightTitle.setText(mHasRightTitle);
        if (hasreturn) {
            mReturn.setVisibility(View.VISIBLE);
            mReturn.setOnClickListener(this);
        } else {
            mReturn.setVisibility(View.GONE);
        }

    }

    @Override
    public void onClick(View v) {
        int mMyId = v.getId();
        if (mMyId == R.id.left_return) {
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenters();
        MyApplication.getInstance().addActivity(this);
    }

    @Override
    protected void onDestroy() {
        MyApplication.getInstance().finishActivity(this);
        super.onDestroy();
    }

    protected abstract void initPresenters();

    protected <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }

}
