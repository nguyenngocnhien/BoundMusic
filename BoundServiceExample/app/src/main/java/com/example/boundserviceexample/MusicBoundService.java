package com.example.boundserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.security.Provider;

public class MusicBoundService extends Service {
    private  MyBinder myBinder = new MyBinder();
    public class MyBinder extends Binder {
        MusicBoundService getMusicBoundService() {
            return MusicBoundService.this;
        }
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("MusicBoundService","onCreate");
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("MusicBoundService","onBind");
        return myBinder;
    }
    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("MusicBoundService","onUnbind");
        return super.onUnbind(intent);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("MusicBoundService","onDestroy");
    }

}
