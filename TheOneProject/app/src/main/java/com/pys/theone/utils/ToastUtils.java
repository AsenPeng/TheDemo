package com.pys.theone.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/11/16 0016.
 */
@SuppressLint("WrongConstant")
public class ToastUtils {
    public static void showToast(Context context, String str){
        if(context!=null&&!TextUtils.isEmpty(str)){
            Toast.makeText(context,str,Toast.LENGTH_LONG).show();
        }
    }
}
