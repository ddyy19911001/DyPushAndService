package yin.deng.chengguang;

import android.widget.Toast;

import com.google.gson.JsonObject;
import com.okhttplib.HttpInfo;
import com.okhttplib.callback.Callback;
import com.umeng.message.PushAgent;
import com.umeng.message.entity.UMessage;
import com.xdandroid.hellodaemon.IntentWrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import yin.deng.dyrequestutils.http.HeaderParam;
import yin.deng.dyrequestutils.http.MyHttpUtils;
import yin.deng.normalutils.utils.LogUtils;
import yin.deng.normalutils.utils.SharedPreferenceUtil;
import yin.deng.superbase.activity.SuperBaseActivity;

public class MainActivity extends SuperBaseActivity {

    String requestUrl="http://iapi.66rpg.com/game/v2/gameinfo/game_info?pack_name=com.sixrpg.opalyer&sv=PKQ1.180729.001&gindex=1454842&android_cur_ver=2.23.245.0305&nt=wifi&device_code=MI8&channel=yingyongbao01YD&skey=f06a668ef5aae5e6be40d1566d7a680b&device_unique_id=3d7895d00312e082d8e2bd8c52861bb42&token=9c46000fbc4bcc3321c7f11c7b42a3c9";
    private MyHttpUtils httpUtils;

    @Override
    public int setLayout() {
        PushAgent.getInstance(this).onAppStart();
        return R.layout.activity_main;
    }

    @Override
    protected void initFirst() {
        httpUtils=new MyHttpUtils(getApplication());
        MyApp.getApp().setListener(new MyApp.OnUmPushListener() {
            @Override
            public void onPushSendHere(UMessage msg) {
                LogUtils.w("注册接到友盟消息了");
                requestRefreshBookInfo();
            }
        });
        SharedPreferenceUtil util=new SharedPreferenceUtil(this,"myDemo");
        boolean isShowWhite=util.getBoolean("isShowWhite");
        if(!isShowWhite){
            IntentWrapper.whiteListMatters(this,"为了更好的为您提供服务，请将本应用添加至白名单中！");
        }
        util.saveBoolean("isShowWhite",true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        requestRefreshBookInfo();
    }

    private void requestRefreshBookInfo() {
        httpUtils.sendMsgGet(requestUrl, initHeadParams(), null, ChangGuangInfo.class, new MyHttpUtils.OnGetInfoListener() {
            @Override
            public void onInfoGet(String requestUrl, Object info) {
                if(info instanceof ChangGuangInfo){
                    ChangGuangInfo changGuangInfo= (ChangGuangInfo) info;
                    LogUtils.i("获取到作品信息如下：\n"+changGuangInfo.toString());
                }
            }
        });
    }

    public List<HeaderParam> initHeadParams(){
        /**
         * Content-Type:application/x-www-form-urlencoded
         * x-ts:1564458270
         * x-sign:bd57dfb892e69f3b190882dd684a1f96
         * x-skey:f06a668ef5aae5e6be40d1566d7a680b
         */
        List<HeaderParam> params=new ArrayList<>();
        HeaderParam headerParam=new HeaderParam();
        headerParam.setKey("x-ts");
        headerParam.setValue("1564458270");
        params.add(headerParam);
        HeaderParam headerParam2=new HeaderParam();
        headerParam2.setKey("x-sign");
        headerParam2.setValue("bd57dfb892e69f3b190882dd684a1f96");
        params.add(headerParam2);
        HeaderParam headerParam3=new HeaderParam();
        headerParam3.setKey("x-skey");
        headerParam3.setValue("f06a668ef5aae5e6be40d1566d7a680b");
        params.add(headerParam3);
        HeaderParam headerParam4=new HeaderParam();
        headerParam4.setKey("Content-Type");
        headerParam4.setValue("application/x-www-form-urlencoded");
        params.add(headerParam4);
        return params;
    }


    @Override
    public void onBackPressed() {
        IntentWrapper.onBackPressed(this);
    }
}
