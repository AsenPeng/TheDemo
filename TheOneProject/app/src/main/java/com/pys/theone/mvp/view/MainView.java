package com.pys.theone.mvp.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pys.theone.R;
import com.pys.theone.activity.MainActivity;
import com.pys.theone.adapter.MyFrageStatePagerAdapter;
import com.pys.theone.config.AppConfig;
import com.pys.theone.fragment.OneFragment;
import com.pys.theone.fragment.ThreeFragment;
import com.pys.theone.fragment.TwoFragment;
import com.pys.theone.mvp.base.BaseView;
import com.pys.theone.mvp.contract.MainContract;
import com.pys.theone.mvp.presenter.MainPresenter;
import com.pys.theone.weight.NoScrollowViewPager;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/12/6 0006.
 */

public class MainView extends BaseView implements MainContract.View, View.OnClickListener {
    private LayoutInflater mInflater;
    private View mView;
    private MainPresenter mPresenter;
    private NoScrollowViewPager mViewPager;
    private ImageView mImag1,mImag2,mImag3;
    private TextView mText1,mText2,mText3;
    private int mType = 0, mOldPosition = 0;
    private MainActivity mActivity;

    private OneFragment mFragment1;
    private TwoFragment mFragment2;
    private ThreeFragment mFragment3;
    private ArrayList<Fragment>mFragmentList;

    public MainView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(mContext);
        mActivity = (MainActivity) mContext;
    }

    public void setPresenter(MainPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public View obtainRootView() {
        mView = mInflater.inflate(R.layout.activity_main, null);
        initView();
        initData();
        return mView;
    }

    /**
     * 初始化控件
     */
    private void initView() {
        mImag1 = findView(mView, R.id.img_1);
        mImag2 = findView(mView, R.id.img_2);
        mImag3 = findView(mView, R.id.img_3);
        mText1 = findView(mView, R.id.txt_1);
        mText2 = findView(mView, R.id.txt_2);
        mText3 = findView(mView, R.id.txt_3);
        findView(mView, R.id.tab_1).setOnClickListener(this);
        findView(mView, R.id.tab_2).setOnClickListener(this);
        findView(mView, R.id.tab_3).setOnClickListener(this);
        mViewPager = findView(mView, R.id.viewpager);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        mType = ((Activity) mContext).getIntent().getIntExtra("type", 0);
        mFragment1 = new OneFragment();
        mFragment2 = new TwoFragment();
        mFragment3 = new ThreeFragment();
        mFragmentList = new ArrayList<>();
        mFragmentList.add(mFragment1);
        mFragmentList.add(mFragment2);
        mFragmentList.add(mFragment3);
        mViewPager.setNoScroll(true);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(new MyFrageStatePagerAdapter(mActivity.getSupportFragmentManager(), mContext, mFragmentList));
        mViewPager.setCurrentItem(mType);
        if (mType != 0) {
            changeTab(mType);
            mOldPosition = mType;
        }
    }

    /**
     * 改变
     *
     * @param flag
     */
    public void changeTab(int flag) {
        if (flag == 0) {
            mImag1.setImageResource(R.drawable.icon_one_1);
            mText1.setTextColor(Color.parseColor("#5396FF"));
            mViewPager.setCurrentItem(0);
        } else if (flag == 1) {
            mImag2.setImageResource(R.drawable.icon_two_1);
            mText2.setTextColor(Color.parseColor("#5396FF"));
            mViewPager.setCurrentItem(1);
        } else if (flag == 2) {
            mImag3.setImageResource(R.drawable.icon_three_1);
            mText3.setTextColor(Color.parseColor("#5396FF"));
            mViewPager.setCurrentItem(2);
        }
        if (mOldPosition == 0) {
            mImag1.setImageResource(R.drawable.icon_one_0);
            mText1.setTextColor(mContext.getResources().getColor(R.color.color_9));
        } else if (mOldPosition == 1) {
            mImag2.setImageResource(R.drawable.icon_two_0);
            mText2.setTextColor(mContext.getResources().getColor(R.color.color_9));
        } else if (mOldPosition == 2) {
            mImag3.setImageResource(R.drawable.icon_three_0);
            mText3.setTextColor(mContext.getResources().getColor(R.color.color_9));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab_1://首页
                if (mOldPosition != 0) {
                    changeTab(0);
                    mOldPosition = 0;
                }
                break;
            case R.id.tab_2://发现
                if (mOldPosition != 1) {
                    changeTab(1);
                    mOldPosition = 1;
                }
                break;
            case R.id.tab_3://我的
                if (mOldPosition != 2) {
                    changeTab(2);
                    mOldPosition = 2;
                }
                break;
        }
    }
}
