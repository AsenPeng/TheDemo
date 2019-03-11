package com.pys.theone.mvp.contract;

import com.pys.theone.bean.UserOutBean;
import com.pys.theone.mvp.base.BaseModel;
import com.pys.theone.mvp.base.BasePresenter;
import com.pys.theone.mvp.base.IBaseView;
import com.pys.theone.utils.HttpCallback;

/**
 * Created by Administrator on 2018/12/17 0017.
 */

public interface SetUpContract {
    interface Model extends BaseModel {
        /**
         * 获取个人信息
         *
         * @param pCustID
         * @param callback
         */
        void getInfo(String pCustID, HttpCallback callback);
    }

    interface View extends IBaseView {
        void getInfoSuccess(UserOutBean bean);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        /**
         * 获取个人信息
         *
         * @param pCustID
         */
        public abstract void getInfo(String pCustID);
    }
}
