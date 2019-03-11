package com.pys.theone.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class LazyFragment extends BaseFragment {
    private final String TAG = "LazyFragment";

    /**
     * 控件是否初始化完成
     */
    protected boolean isViewCreated;

    /**
     * 数据是否已加载
     */
    protected boolean isLoadData;

    /**
     * 是否显示
     */
    protected boolean isVisibleToUser = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = getRootView(inflater, container, savedInstanceState);
        isViewCreated = true;
        return rootView;
    }

    public abstract View getRootView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisibleToUser = isVisibleToUser;
        if (isVisibleToUser && isViewCreated) {
            isLoadData = loadData(isLoadData);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (isVisibleToUser && !isLoadData) {
            isLoadData = loadData(isLoadData);
        }
    }

    /**
     * 子类实现加载数据的方法
     */
    public abstract boolean loadData(boolean isLoadData);

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        isViewCreated = false;
        isLoadData = false;
    }

}
