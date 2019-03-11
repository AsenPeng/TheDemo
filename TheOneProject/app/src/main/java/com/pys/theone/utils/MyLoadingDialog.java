package com.pys.theone.utils;

import android.content.Context;

/**
 * 加载数据时显示的dialog
 *
 * @author lisheng
 */
public class MyLoadingDialog {
    public static PictureDialog messageDialog;

    /**
     * 显示加载框
     *
     * @param context 显示的act
     */
    public static void showLoadingDialog(Context context) {
        if (context == null) {
            return;
        }
        closeDialog();
        try {
            messageDialog = new PictureDialog(context);
            messageDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 判断dialog是不是显示
     *
     * @return
     */
    public static boolean isShowing() {
        if (messageDialog == null) {
            return false;
        }
        return messageDialog.isShowing();
    }

    /**
     * 关闭dialog
     */
    public static void closeDialog() {
        try {
            if (messageDialog != null && messageDialog.isShowing()) {
                messageDialog.dismiss();
                messageDialog = null;
            } else {
                messageDialog = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
