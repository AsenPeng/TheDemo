package com.pys.theone.mvp.presenter;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.pys.theone.bean.UserOutBean;
import com.pys.theone.mvp.contract.SetUpContract;
import com.pys.theone.utils.HttpCallback;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/12/17 0017.
 */

public class SetUpPresenter extends SetUpContract.Presenter {
    private Gson mGson = new Gson();

    @Override
    public void getInfo(String pCustID) {
        mModel.getInfo(pCustID, new HttpCallback() {
            @Override
            public void onFailure(String errmsg) {
                if (!TextUtils.isEmpty(errmsg)) {
                    mView.showToast(errmsg);
                }
            }

            @Override
            public void onSuccess(String response) {
                try {
                    if (!TextUtils.isEmpty(response)) {
                        JSONObject obj = new JSONObject(response);
                        String mResult = obj.getString("nResul");
                        if (!TextUtils.isEmpty(mResult) && "1".equals(mResult)) {
                            String Data = obj.getString("Data");
                            if (!TextUtils.isEmpty(Data)) {
                                JSONObject json = new JSONObject(Data);
                                String state = json.getString("state");
                                if (!TextUtils.isEmpty(state) && "00".equals(state)) {
                                    JSONArray dataList = json.getJSONArray("dataList");
                                    if (dataList.length() > 0) {
                                        String string = dataList.getString(0);
                                        UserOutBean bean = mGson.fromJson(string, UserOutBean.class);
                                        mView.getInfoSuccess(bean);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
