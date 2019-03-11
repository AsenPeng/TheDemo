package com.pys.theone.mvp.base;

import android.content.Context;

/**
 * des:基类presenter
 * Created by xsf
 * on 2016.07.11:55
 */
public abstract class BasePresenter<T, E> {
    protected Context mContext;
    protected E mModel;
    protected T mView;

    public void setViewAndModel(T v, E m) {
        this.mView = v;
        this.mModel = m;
    }

    public void setContext(Context context) {
        mContext = context;
    }
}
