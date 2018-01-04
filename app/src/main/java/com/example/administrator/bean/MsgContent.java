package com.example.administrator.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public class MsgContent {
    /**
     * status : 200
     * msg : OK
     * data : {"pageNum":1,"pageSize":20,"size":6,"orderBy":null,"startRow":1,"endRow":6,"total":6,"pages":1,"list":[{"systemId":2,"password":"159624","systemName":"域账户","id":104,"userId":8,"account":"11111222","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":74,"userId":8,"account":"11","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":73,"userId":8,"account":"11","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":72,"userId":8,"account":"11","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":71,"userId":8,"account":"11","encryptionId":1},{"systemId":2,"password":"123","systemName":"域账户","id":69,"userId":8,"account":"123","encryptionId":1}],"firstPage":1,"prePage":0,"nextPage":0,"lastPage":1,"isFirstPage":true,"isLastPage":true,"hasPreviousPage":false,"hasNextPage":false,"navigatePages":8,"navigatepageNums":[1]}
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
         * pageNum : 1
         * pageSize : 20
         * size : 6
         * orderBy : null
         * startRow : 1
         * endRow : 6
         * total : 6
         * pages : 1
         * list : [{"systemId":2,"password":"159624","systemName":"域账户","id":104,"userId":8,"account":"11111222","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":74,"userId":8,"account":"11","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":73,"userId":8,"account":"11","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":72,"userId":8,"account":"11","encryptionId":1},{"systemId":1,"password":"123456","systemName":"Ukey","id":71,"userId":8,"account":"11","encryptionId":1},{"systemId":2,"password":"123","systemName":"域账户","id":69,"userId":8,"account":"123","encryptionId":1}]
         * firstPage : 1
         * prePage : 0
         * nextPage : 0
         * lastPage : 1
         * isFirstPage : true
         * isLastPage : true
         * hasPreviousPage : false
         * hasNextPage : false
         * navigatePages : 8
         * navigatepageNums : [1]
         */

        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * systemId : 2
             * password : 159624
             * systemName : 域账户
             * id : 104
             * userId : 8
             * account : 11111222
             * encryptionId : 1
             */

            private String password;
            private String systemName;
            private String account;

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getSystemName() {
                return systemName;
            }

            public void setSystemName(String systemName) {
                this.systemName = systemName;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }
        }
    }
}
