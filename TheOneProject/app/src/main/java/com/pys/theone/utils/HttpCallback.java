package com.pys.theone.utils;

/**
 * Created by WD on 2017/1/12.
 */

public abstract class HttpCallback {
    public abstract void onFailure(String errmsg) ;
    public abstract void onSuccess(String response);

}
