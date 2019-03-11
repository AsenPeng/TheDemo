package com.pys.theone.bean;


import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/11 0011.
 */

public class UserInfoOnBean implements Serializable {
    private static final long serialVersionUID = -8519850307490599323L;
    private String TransType;
    private String TransKey;
    private long TrasnTimeSpan;
    private String phoneType= "android";
    private String pCustID;

    public UserInfoOnBean(String transType, String transKey, long trasnTimeSpan, String pCustID) {
        TransType = transType;
        TransKey = transKey;
        TrasnTimeSpan = trasnTimeSpan;
        this.pCustID=pCustID;
    }
}
