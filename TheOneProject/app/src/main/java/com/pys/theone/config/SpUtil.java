package com.pys.theone.config;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2017/9/8.
 */

public class SpUtil {
    /**
     * 存储一个字符串的偏好
     *
     * @param key
     * @param str
     */
    public static void setShare(Context context, String key, String str) {
        SharedPreferences sp = context.getSharedPreferences("flag", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, str);
        edit.commit();
    }

    /**
     * 获取对应key的字符串
     *
     * @param key
     */
    public static String getShare(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("flag", Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }

    /**
     * 存储一个字符串的偏好,share有标记的
     *
     * @param context
     * @param sharekey share 标记
     * @param key
     * @param str
     */
    public static void setShareFlag(Context context, String sharekey, String key, String str) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, str);
        edit.commit();
    }

    /**
     * 存储一个字符串的偏好,share有标记的
     *
     * @param context
     * @param sharekey share 标记
     * @param key
     * @param str
     */
    public static void setShareBooleanFlag(Context context, String sharekey, String key, boolean str) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(key, str);
        edit.commit();
    }

    /**
     * 获取对应key的字符串,share有标记的
     *
     * @param context
     * @param sharekey share 标记
     * @param key
     * @return
     */
    public static boolean getShareBooleanFlag(Context context, String sharekey, String key, boolean str) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        return sp.getBoolean(key, str);
    }

    /**
     * 存储一个字符串的偏好,share有标记的
     *
     * @param context
     * @param sharekey share 标记
     * @param key
     * @param str
     */
    public static void setShareIntFlag(Context context, String sharekey, String key, int str) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putInt(key, str);
        edit.commit();
    }

    /**
     * 获取对应key的字符串,share有标记的
     *
     * @param context
     * @param sharekey share 标记
     * @param key
     * @return
     */
    public static int getShareIntFlag(Context context, String sharekey, String key, int str) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        return sp.getInt(key, str);
    }

    /**
     * 移除对应页面
     *
     * @param context
     * @param sharekey
     * @param key
     */
    public static void removeFlag(Context context, String sharekey, String key) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.remove(key);
        edit.commit();
    }

    /**
     * 获取对应key的字符串,share有标记的
     *
     * @param context
     * @param sharekey share 标记
     * @param key
     * @return
     */
    public static String getShareFlag(Context context, String sharekey, String key) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }

    /**
     * 清空偏好中数据
     *
     * @param context
     * @param sharekey
     */
    public static void clearShareFlag(Context context, String sharekey) {
        SharedPreferences sp = context.getSharedPreferences(sharekey, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
    }
}
