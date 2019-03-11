package com.pys.theone.utils;

import android.text.TextUtils;

import com.pys.theone.activity.MyApplication;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/8/12.
 */

public class OkHttp {
    public static void post(String value, final HttpCallback mHttpCallBack) {
        OkHttpClient mOkClient = NetUtil.getClient();
        try {
            String key = EncryptionHelper.key;
            value = EncryptionHelper.aesEncrypt(value, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestBody body = new FormBody.Builder()
                .add("sPostParam", value)
                .build();
        Request request = new Request.Builder().url(ParaConfig.URI).post(body).build();
        mOkClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                final String mMessage = e.getMessage();
                MainHandler.getInstance().post(new Runnable() {
                    @Override
                    public void run() {
                        if (!TextUtils.isEmpty(mMessage)) {
                            if (mMessage.contains("Failed to connect")) {
                                MyLoadingDialog.closeDialog();
                                ToastUtils.showToast(MyApplication.getInstance().getApplicationContext(), "连接超时，请检查网络是否正常");
                            } else {
                                mHttpCallBack.onFailure(mMessage);
                            }
                        }
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                String string = response.body().string();
                try {
                    string = EncryptionHelper.aesDecrypt(string, EncryptionHelper.key);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                final String mFinalStr = string;
                MainHandler.getInstance().post(new Runnable() {
                    @Override
                    public void run() {
                        if (!TextUtils.isEmpty(mFinalStr) && mFinalStr.contains("Failed to connect")) {
                            MyLoadingDialog.closeDialog();
                            ToastUtils.showToast(MyApplication.getInstance().getApplicationContext(), "连接超时，请检查网络是否正常");
                            return;
                        }
                        if (response.isSuccessful()) {
                            mHttpCallBack.onSuccess(mFinalStr);
                        } else {
                            mHttpCallBack.onSuccess(null);
                        }
                    }
                });
            }
        });
    }
}
