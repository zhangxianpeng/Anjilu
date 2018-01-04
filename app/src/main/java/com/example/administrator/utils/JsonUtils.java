package com.example.administrator.utils;

import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

import com.example.administrator.bean.LoginStatusBean;
import com.example.administrator.bean.SetSPwdFlagBean;

import org.json.JSONObject;


public class JsonUtils {

    private static final String TAG = JsonUtils.class.getName();

    /**
     * 获取登陆时的返回数据
     * @param loginStatusJsonStr
     * @return
     */
    public static LoginStatusBean JsonStr2LoginStatusBean(String loginStatusJsonStr){
        LoginStatusBean loginStatusBean = null;
        try{
            JSONObject jsonObject = new JSONObject(loginStatusJsonStr);
            loginStatusBean = new LoginStatusBean();
            loginStatusBean.setStatus(jsonObject.getInt("status"));
            loginStatusBean.setMsg(jsonObject.getString("msg"));
            loginStatusBean.setData(jsonObject.getString("data"));
        }catch (Exception e){
            Log.e(TAG, e.getMessage());
        }
        return loginStatusBean;
    }
}
