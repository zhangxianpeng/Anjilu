package com.example.administrator.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.example.administrator.base.BaseActivity;
import com.example.administrator.bean.LoginStatusBean;
import com.example.administrator.module.UrlDefine;
import com.example.administrator.testapk.R;
import com.example.administrator.utils.JsonUtils;
import com.example.administrator.utils.NetUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import butterknife.BindView;
import okhttp3.Call;
import okhttp3.Response;

public class AtyMsgContent extends BaseActivity {

    @BindView(R.id.et_sysname)
    EditText et_sysname;
    @BindView(R.id.et_account)
    EditText et_account;
    @BindView(R.id.et_pwd)
    EditText et_pwd;
    @BindView(R.id.title_msg_content)
    TitleBar title_msg_content;

    private static final String TAG = "AtyMsgContent";
//    private LoginStatusBean loginStatusBean;
    @Override
    protected int getLayoutResourceId() {
        return R.layout.aty_msg_content;
    }

    @Override
    protected void init() {
        Bundle bundle = this.getIntent().getExtras();
        et_account.setText(bundle.getString("account"));
        et_pwd.setText(bundle.getString("pwd"));
        et_sysname.setText(bundle.getString("systemName"));
    }

    @Override
    protected void initView() {
        title_msg_content.setLeftImageResource(R.mipmap.back);
        title_msg_content.setTitle("账号详情");
        title_msg_content.addAction(new TitleBar.Action() {
            @Override
            public String getText() {
                return "保存修改";
            }

            @Override
            public int getDrawable() {
                return 0;
            }

            @Override
            public void performAction(View view) {

                Map<String,String> body = new ConcurrentSkipListMap<>();
                body.put("systemName",et_sysname.getText().toString());
                body.put("account",et_account.getText().toString());
                body.put("password",et_pwd.getText().toString());

                NetUtils.getInstance().postDataAsynToNet(UrlDefine.ACTION_URL_UPDATAGENERAL, body, new NetUtils.MyNetCall() {
                    @Override
                    public void success(Call call, Response response) throws IOException {
                        String res = response.body().string();
                        final LoginStatusBean loginStatusBean = JsonUtils.JsonStr2LoginStatusBean(res);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if(loginStatusBean.getStatus() == 200){
                                    toast("信息修改成功");
                                }else {
                                    toast(loginStatusBean.getMsg());
                                }
                            }
                        });
                    }

                    @Override
                    public void failed(Call call, IOException e) {
                        Log.e(TAG,e.getMessage());
                    }
                });
            }
        });

        title_msg_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
