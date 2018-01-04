package com.example.administrator.bean;

import org.json.JSONObject;

/**
 * Created by Administrator on 2017/12/26/026.
 * 登录接口返回参数
 */

public class SetSPwdFlagBean {

    /**
     * status : 200
     * msg : OK
     * data : {"isSet":true}
     */

    private int status;
    private String msg;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }



    public static class DataBean {
        /**
         * isSet : true
         */

        private boolean isSet;

        public boolean isIsSet() {
            return isSet;
        }

        public void setIsSet(boolean isSet) {
            this.isSet = isSet;
        }
    }
}
