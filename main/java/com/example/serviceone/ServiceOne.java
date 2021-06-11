package com.example.serviceone;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class ServiceOne extends Service {
    public ServiceOne() {
    }

    private IMyInterface.Stub mService = new IMyInterface.Stub() {
        @Override
        public int add(int x, int y) {
            return x+y;
        }
    };

    @Override
    public IBinder onBind(Intent intent){
        return mService;
    }
}