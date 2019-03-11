package com.pys.theone.config;

import com.pys.theone.bean.UnReadOutBean;
import com.pys.theone.bean.UserOutBean;

/**
 * Created by Administrator on 2018/12/10 0010.
 */

public class AppConfig {
    //标记当前是不是隐藏版本，默认不隐藏
    public static boolean mIsHide = false;
    public static UserOutBean UserBean;
    public static boolean NeedReset = false;//标记是否需要重新获取个人信息
    public static String mVersionNo;//后台的版本号
    public static String mUpdateType = "0";//版本更新状态0：不更新；1：强制更新；2：一般更新；
    public static String mUpdateContent;//更新提示内容
    public static String mUpdateUrl;//下载的链接
    public static boolean mVersion = false;
    public static UnReadOutBean UNREAD_NO;//未读消息数实体类
}
