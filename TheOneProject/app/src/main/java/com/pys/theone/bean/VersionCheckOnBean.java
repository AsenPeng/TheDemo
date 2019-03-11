package com.pys.theone.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/11 0011.
 */

public class VersionCheckOnBean implements Serializable {
    private static final long serialVersionUID = -8519850307490599323L;
    private String TransType;
    private String TransKey;
    private long TrasnTimeSpan;
    private String phoneType = "android";
    private String pType;//pType：1 IOS；2 Android；
    private String pCustID;

    public VersionCheckOnBean(String transType, String transKey, long trasnTimeSpan, String pType, String pCustID) {
        TransType = transType;
        TransKey = transKey;
        TrasnTimeSpan = trasnTimeSpan;
        this.pType = pType;
        this.pCustID = pCustID;
    }
}
