package yin.deng.chengguang.service;

import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.xdandroid.hellodaemon.AbsWorkService;

import yin.deng.normalutils.utils.LogUtils;

public class MyWorkService extends AbsWorkService {
    int mStartId=-1;

    OnServiceOpenListener listener;
    public interface OnServiceOpenListener{
        void onOpen(int id);
        void onStop(int id);
        void onKilled(int id);
    }
    public MyWorkService(){
        if(listener==null){
            listener=new OnServiceOpenListener() {
                @Override
                public void onOpen(int id) {
                    LogUtils.d("服务---开启");

                }

                @Override
                public void onStop(int id) {
                    LogUtils.d("服务---关闭");
                }

                @Override
                public void onKilled(int id) {
                    LogUtils.d("服务---杀死");
                }
            };
        }
    }



    /**
     * 是否 任务完成, 不再需要服务运行?
     * @return 应当停止服务, true; 应当启动服务, false; 无法判断, null.
     */
    @Override
    public Boolean shouldStopService(Intent intent, int flags, int startId) {
        return false;
    }


    /**
     * 任务是否正在运行?
     * @return 任务正在运行, true; 任务当前不在运行, false; 无法判断, null.
     */
    @Override
    public void startWork(Intent intent, int flags, int startId) {
        LogUtils.i("服务被激活");
        if(mStartId==-1){
            mStartId=startId;
        }
        if(listener!=null){
            listener.onOpen(mStartId);
        }
    }

    @Override
    public void stopWork(Intent intent, int flags, int startId) {
        LogUtils.i("服务停止运行");
        if(listener!=null){
            listener.onStop(mStartId);
        }
    }

    @Override
    public Boolean isWorkRunning(Intent intent, int flags, int startId) {
        LogUtils.w("服务运行中:flags-->"+flags+"\tstartId:"+startId);
        return null;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent, Void alwaysNull) {
        LogUtils.e("服务执行onBind");
        return null;
    }


    //服务被杀时调用, 可以在这里面保存数据.
    @Override
    public void onServiceKilled(Intent rootIntent) {
        LogUtils.i("服务被杀死");
        if(listener!=null){
            listener.onKilled(mStartId);
        }
    }
}
