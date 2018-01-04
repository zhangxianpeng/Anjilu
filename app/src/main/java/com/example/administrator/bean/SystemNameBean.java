package com.example.administrator.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public class SystemNameBean {

    /**
     * status : 200
     * msg : OK
     * data : [{"id":1,"systemName":"Ukey","status":1,"createTime":1509463408000,"lastUpdate":1509463402000},{"id":2,"systemName":"域账户","status":1,"createTime":1509463421000,"lastUpdate":1509463418000},{"id":3,"systemName":"企信","status":1,"createTime":1509463437000,"lastUpdate":1509463435000},{"id":4,"systemName":"外部邮箱","status":1,"createTime":1509463448000,"lastUpdate":1509463446000},{"id":5,"systemName":"培评系统","status":1,"createTime":1509463468000,"lastUpdate":1509463466000},{"id":6,"systemName":"U盘密码","status":1,"createTime":1509463482000,"lastUpdate":1509463479000},{"id":7,"systemName":"4A账号","status":1,"createTime":1509463496000,"lastUpdate":1509463494000},{"id":8,"systemName":"电网运行管理系统","status":1,"createTime":1509463512000,"lastUpdate":1509463510000},{"id":9,"systemName":"OA系统帐号","status":1,"createTime":1509463528000,"lastUpdate":1509463526000},{"id":37,"systemName":"你就","status":0,"createTime":1513698671000,"lastUpdate":1513698671000},{"id":38,"systemName":"进被窝","status":0,"createTime":1513698805000,"lastUpdate":1513698805000},{"id":39,"systemName":"自定义","status":0,"createTime":1513698942000,"lastUpdate":1513698942000},{"id":40,"systemName":"我是post","status":0,"createTime":1513699928000,"lastUpdate":1513699928000},{"id":41,"systemName":"我是get","status":0,"createTime":1513699979000,"lastUpdate":1513699979000},{"id":42,"systemName":"你好吗","status":0,"createTime":1513700274000,"lastUpdate":1513700274000},{"id":43,"systemName":"尼嘛哟","status":0,"createTime":1513700704000,"lastUpdate":1513700704000},{"id":44,"systemName":"你嘛哟","status":0,"createTime":1513700795000,"lastUpdate":1513700795000},{"id":45,"systemName":"自定义123","status":0,"createTime":1513701480000,"lastUpdate":1513701480000},{"id":46,"systemName":"改好了","status":0,"createTime":1513703296000,"lastUpdate":1513703296000},{"id":47,"systemName":"改好了2","status":0,"createTime":1513703354000,"lastUpdate":1513703354000},{"id":48,"systemName":"你好啊","status":0,"createTime":1513736856000,"lastUpdate":1513736856000},{"id":49,"systemName":"nimabi","status":0,"createTime":1513963715000,"lastUpdate":1513963715000},{"id":50,"systemName":"系统名字","status":0,"createTime":1514629930000,"lastUpdate":1514629930000},{"id":51,"systemName":"系统147258","status":0,"createTime":1514630881000,"lastUpdate":1514630881000},{"id":52,"systemName":"Postman添加","status":0,"createTime":1514631064000,"lastUpdate":1514631064000}]
     */

    private int status;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * systemName : Ukey
         * status : 1
         * createTime : 1509463408000
         * lastUpdate : 1509463402000
         */

        private String systemName;

        public String getSystemName() {
            return systemName;
        }

        public void setSystemName(String systemName) {
            this.systemName = systemName;
        }
    }
}
