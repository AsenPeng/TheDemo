package com.pys.theone.mvp.model;

import com.google.gson.Gson;
import com.pys.theone.bean.UserInfoOnBean;
import com.pys.theone.mvp.contract.SetUpContract;
import com.pys.theone.utils.EncryptionHelper;
import com.pys.theone.utils.HttpCallback;
import com.pys.theone.utils.OkHttp;

/**
 * Created by Administrator on 2018/12/17 0017.
 */

public class SetUpModel implements SetUpContract.Model {
    private Gson mGson = new Gson();

    @Override
    public void getInfo(String pCustID, HttpCallback callback) {
        try {
            long transType1 = EncryptionHelper.getDate();
            String transType = "CXGRXX" + transType1;
            String transKey = EncryptionHelper.md5(transType);
            UserInfoOnBean mBean = new UserInfoOnBean("CXGRXX", transKey, transType1, pCustID);
            String mStr = mGson.toJson(mBean);
            OkHttp.post(mStr, callback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
