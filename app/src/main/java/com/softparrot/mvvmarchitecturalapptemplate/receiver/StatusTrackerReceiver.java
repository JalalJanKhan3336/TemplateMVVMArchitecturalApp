package com.softparrot.mvvmarchitecturalapptemplate.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.softparrot.mvvmarchitecturalapptemplate.extras.utils.MessageUtils;

// This Class will keep tracking internet connection
public class StatusTrackerReceiver extends BroadcastReceiver {

    private final StatusTrackerReceiverCallback mStatusTrackerReceiverCallback;

    public StatusTrackerReceiver(StatusTrackerReceiverCallback mStatusTrackerReceiverCallback) {
        this.mStatusTrackerReceiverCallback = mStatusTrackerReceiverCallback;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent != null && mStatusTrackerReceiverCallback != null) {
            String status = MessageUtils.MSG_NO_INTERNET;
            boolean isConnected = false;

            if(intent.getExtras() != null){

                NetworkInfo networkInfo = (NetworkInfo) intent.getExtras().get(ConnectivityManager.EXTRA_NETWORK_INFO);
                if(networkInfo != null && networkInfo.getState() != null){
                    if(networkInfo.getState() == NetworkInfo.State.CONNECTED){
                        isConnected = true;
                        status = "Connected";
                    }
                    else if(networkInfo.getState() == NetworkInfo.State.CONNECTING){
                        isConnected = true;
                        status = "Connecting...";
                    }
                }

            }

            mStatusTrackerReceiverCallback.onInternetStatusChanged(status, isConnected);
        }
    }

    public interface StatusTrackerReceiverCallback {
        void onInternetStatusChanged(String status, boolean isConnected);
    }
}
