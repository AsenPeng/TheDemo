package com.pys.theone.utils;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Administrator on 2019/3/11 0011.
 */

public class CommonUtils {
    /**
     * @Title: dip2px @Description: TODO(dp转px) @param @param
     * context @param @param dpValue @param @return 设定文件 @return int
     * 返回类型 @throws
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
    /**
     * 获取状态栏的高度（顶部）
     *
     * @param activity
     * @return
     */
    public static int getStatusBarHeight(Activity activity) {
        int statusBarHeight = 0;
        if (activity != null) {
            int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            statusBarHeight = activity.getResources().getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }
}
