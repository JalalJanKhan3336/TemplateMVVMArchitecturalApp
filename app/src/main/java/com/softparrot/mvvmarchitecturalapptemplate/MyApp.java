package com.softparrot.mvvmarchitecturalapptemplate;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.multidex.MultiDex;

import com.softparrot.mvvmarchitecturalapptemplate.extras.utils.AlertUtils;
import com.softparrot.mvvmarchitecturalapptemplate.receiver.StatusTrackerReceiver;

public class MyApp extends Application
        implements StatusTrackerReceiver.StatusTrackerReceiverCallback {

    public boolean isConnectedToNetwork = false;

    private MutableLiveData<String> onlineStatusLiveData;
    private StatusTrackerReceiver mStatusTrackerReceiver;

    private static MyApp instance;

    public static synchronized MyApp getInstance() {
        return instance;
    }

    public Context getAppContext() {
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        MultiDex.install(this);

        initRef();
        startInternetTracker();
    }

    private void initRef() {
        if (mStatusTrackerReceiver == null)
            mStatusTrackerReceiver = new StatusTrackerReceiver(this);

        if (onlineStatusLiveData == null)
            onlineStatusLiveData = new MutableLiveData<>();
    }

    // Will start Status Tracker Receiver
    private void startInternetTracker() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(mStatusTrackerReceiver, filter);
    }

    // Will stop Status Tracker Receiver
    private void stopInternetTracker() {
        unregisterReceiver(mStatusTrackerReceiver);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        stopInternetTracker();
    }

    @Override
    public void onInternetStatusChanged(String internetStatus, boolean isConnected) {
        String status = isConnected ? "Online" : "Offline";

        isConnectedToNetwork = isConnected;
        onlineStatusLiveData.setValue(status);

        AlertUtils.toast(internetStatus);
    }

    public LiveData<String> getOnlineStatus() {
        return onlineStatusLiveData;
    }
}
