package com.pys.theone.bean;


import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/16 0016.
 */

public class UnReadOnBean implements Serializable {
    private static final long serialVersionUID = 582065540551613482L;
    private String TransType;
    private String TransKey;
    private long TrasnTimeSpan;
    private String phoneType = "android";
    private String pCustID;
    private String pLongitude;
    private String pLatitude;

    public UnReadOnBean(String transType, String transKey, long trasnTimeSpan, String pCustID, String pLongitude, String pLatitude) {
        TransType = transType;
        TransKey = transKey;
        TrasnTimeSpan = trasnTimeSpan;
        this.pCustID = pCustID;
        this.pLongitude = pLongitude;
        this.pLatitude = pLatitude;
    }
}
