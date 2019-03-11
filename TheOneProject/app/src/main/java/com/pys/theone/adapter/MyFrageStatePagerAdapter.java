package com.pys.theone.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */

public class MyFrageStatePagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;
    private List<Fragment> mFragments;

    public MyFrageStatePagerAdapter(FragmentManager fm, Context context, List<Fragment> fragments) {
        super(fm);
        mContext=context;
        mFragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
