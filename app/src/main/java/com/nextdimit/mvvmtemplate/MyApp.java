package com.nextdimit.mvvmtemplate;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.multidex.MultiDex;

import com.nextdimit.mvvmtemplate.extras.utils.AlertUtils;
import com.nextdimit.mvvmtemplate.receiver.InternetConnectionStatusReceiver;

public class MyApp extends Application
        implements InternetConnectionStatusReceiver.StatusTrackerReceiverCallback {

    public boolean isConnectedToNetwork = false;

    private MutableLiveData<String> onlineStatusLiveData;
    private InternetConnectionStatusReceiver mInternetConnectionStatusReceiver;

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
        if (mInternetConnectionStatusReceiver == null)
            mInternetConnectionStatusReceiver = new InternetConnectionStatusReceiver(this);

        if (onlineStatusLiveData == null)
            onlineStatusLiveData = new MutableLiveData<>();
    }

    // Will start Status Tracker Receiver
    private void startInternetTracker() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(mInternetConnectionStatusReceiver, filter);
    }

    // Will stop Status Tracker Receiver
    private void stopInternetTracker() {
        unregisterReceiver(mInternetConnectionStatusReceiver);
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
