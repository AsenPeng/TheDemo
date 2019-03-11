package com.pys.theone.mvp.contract;

import com.pys.theone.mvp.base.BaseModel;
import com.pys.theone.mvp.base.BasePresenter;
import com.pys.theone.mvp.base.IBaseView;

/**
 * Created by Administrator on 2018/12/6 0006.
 */

public interface MainContract {
    interface Model extends BaseModel {
    }

    interface View extends IBaseView {
    }

    abstract class Presenter extends BasePresenter<View, Model> {
    }
}
