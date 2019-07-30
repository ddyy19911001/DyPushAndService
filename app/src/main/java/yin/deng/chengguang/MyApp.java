package yin.deng.chengguang;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.entity.UMessage;
import com.xdandroid.hellodaemon.DaemonEnv;

import java.util.Map;

import yin.deng.chengguang.service.MyWorkService;
import yin.deng.normalutils.utils.LogUtils;
import yin.deng.normalutils.utils.MyUtils;
import yin.deng.normalutils.utils.ToastUtil;

public class MyApp extends Application {
    OnUmPushListener listener;
    static MyApp app;
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        initService(this);
        initUmPush();
    }

    public static MyApp getApp() {
        return app;
    }

    private void initUmPush() {
        // 参数一：当前上下文context；
        // 参数二：应用申请的Appkey（需替换）；
        // 参数三：渠道名称；
        // 参数四：设备类型，必须参数，传参数为UMConfigure.DEVICE_TYPE_PHONE则表示手机；传参数为UMConfigure.DEVICE_TYPE_BOX则表示盒子；默认为手机；
        // 参数五：Push推送业务的secret 填充Umeng Message Secret对应信息（需替换）
        UMConfigure.init(this, "59b5edcdb27b0a0955000033", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "ba440aa4a7f77f9558aa83ca0b00321c");
        //获取消息推送代理示例
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //获取umeng推送的消息内容
        UmengMessageHandler messageHandler = new UmengMessageHandler() {
            @Override
            public Notification getNotification(Context context, UMessage msg) {
                if(listener!=null){
                    listener.onPushSendHere(msg);
                }
                return super.getNotification(context, msg);
            }
        };
        mPushAgent.setMessageHandler(messageHandler);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {
            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回deviceToken deviceToken是推送消息的唯一标志
                LogUtils.e("注册成功：deviceToken：-------->  " + deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {
                LogUtils.e("注册失败：-------->  " + "s:" + s + ",s1:" + s1);
            }
        });
    }

    public void setListener(OnUmPushListener listener) {
        this.listener = listener;
    }

    public interface OnUmPushListener{
        void onPushSendHere(UMessage msg);
    }

    public static void initService(Application app) {
        DaemonEnv.initialize(app,  //Application Context.
                MyWorkService.class, //刚才创建的 Service 对应的 Class 对象.
                10* 1000);  //定时唤醒的时间间隔(ms), 默认 6 分钟.
        app.startService(new Intent(app, MyWorkService.class));
    }
}
