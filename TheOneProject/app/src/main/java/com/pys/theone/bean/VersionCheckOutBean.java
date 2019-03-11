package com.pys.theone.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Lenovo on 2018/12/14.
 */

public class VersionCheckOutBean implements Serializable {
    private static final long serialVersionUID = 448331808000914613L;
    private int nResul;
    private String sMessage;
    private Version Data;

    public int getnResul() {
        return nResul;
    }

    public void setnResul(int nResul) {
        this.nResul = nResul;
    }

    public String getsMessage() {
        return sMessage;
    }

    public void setsMessage(String sMessage) {
        this.sMessage = sMessage;
    }

    public Version getData() {
        return Data;
    }

    public void setData(Version data) {
        Data = data;
    }

    public class Version implements Serializable {
        private static final long serialVersionUID = -7962245643242157529L;
        private ArrayList<DataList> dataList;
        private String state;
        private String message;

        public ArrayList<DataList> getDataList() {
            return dataList;
        }

        public void setDataList(ArrayList<DataList> dataList) {
            this.dataList = dataList;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public class DataList implements Serializable{
            private static final long serialVersionUID = -1521143807930633770L;
            private String VersionNo;
            private String UpdateUrl;
            private String UpdateType;
            private String UpdateContent;

            public String getVersionNo() {
                return VersionNo;
            }

            public void setVersionNo(String versionNo) {
                VersionNo = versionNo;
            }

            public String getUpdateUrl() {
                return UpdateUrl;
            }

            public void setUpdateUrl(String updateUrl) {
                UpdateUrl = updateUrl;
            }

            public String getUpdateType() {
                return UpdateType;
            }

            public void setUpdateType(String updateType) {
                UpdateType = updateType;
            }

            public String getUpdateContent() {
                return UpdateContent;
            }

            public void setUpdateContent(String updateContent) {
                UpdateContent = updateContent;
            }
        }
    }
}
