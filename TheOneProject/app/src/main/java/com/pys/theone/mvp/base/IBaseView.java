package com.pys.theone.mvp.base;

import android.view.View;

/**
 * Created by Administrator on 2016/11/17.
 */
public interface IBaseView {

    /**
     * 获取视图
     *
     * @return
     */
    View obtainRootView();

    /**
     * 显示loading
     */
    void showLoadingView();

    /**
     * 隐藏loading
     */
    void dismissLoadingView();

    /**
     * 显示Toast
     */
    void showToast(String msg);

    /**
     * 销毁时调用
     */
    void onViewDestroy();
}
