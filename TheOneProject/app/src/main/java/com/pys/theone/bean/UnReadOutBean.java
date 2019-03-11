package com.pys.theone.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/15 0015.
 */

public class UnReadOutBean implements Serializable {
    private static final long serialVersionUID = -7563617923783929898L;
    private int chatCount;
    private int SystemCount;//系统通知
    private int ReportCount;//收到汇报
    private int NoticeCount;//收到通知
    private int ActivityCount;//活动
    private int FinancingCount;//众筹
    private int SumCount;

    public int getChatCount() {
        return chatCount;
    }

    public void setChatCount(int chatCount) {
        this.chatCount = chatCount;
    }

    public int getSystemCount() {
        return SystemCount;
    }

    public void setSystemCount(int systemCount) {
        SystemCount = systemCount;
    }

    public int getReportCount() {
        return ReportCount;
    }

    public void setReportCount(int reportCount) {
        ReportCount = reportCount;
    }

    public int getNoticeCount() {
        return NoticeCount;
    }

    public void setNoticeCount(int noticeCount) {
        NoticeCount = noticeCount;
    }

    public int getActivityCount() {
        return ActivityCount;
    }

    public void setActivityCount(int activityCount) {
        ActivityCount = activityCount;
    }

    public int getFinancingCount() {
        return FinancingCount;
    }

    public void setFinancingCount(int financingCount) {
        FinancingCount = financingCount;
    }

    public int getSumCount() {
        return SumCount;
    }

    public void setSumCount(int sumCount) {
        SumCount = sumCount;
    }
}
