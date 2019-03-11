package com.pys.theone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pys.theone.mvp.view.OneView;
import com.pys.theone.mvp.view.ThreeView;

/**
 * Created by Administrator on 2019/3/11 0011.
 */

public class ThreeFragment extends com.pys.theone.mvp.base.BaseFragment {
    private ThreeView mView;
    @Override
    public View getRootView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return mView.obtainRootView();
    }

    @Override
    public boolean loadData(boolean isLoadData) {
        if (!isLoadData) {
            mView.loadData();
            isLoadData = true;
        }
        return isLoadData;
    }

    @Override
    protected void initPresenters() {
        mView=new ThreeView(getContext());
    }
}
