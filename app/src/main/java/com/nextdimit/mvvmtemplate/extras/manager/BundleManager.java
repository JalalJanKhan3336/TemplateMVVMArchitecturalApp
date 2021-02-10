package com.nextdimit.mvvmtemplate.extras.manager;

import android.os.Bundle;

public class BundleManager {
    private static BundleManager instance;

    public synchronized static BundleManager getInstance() {
        if(instance == null)
            instance = new BundleManager();
        return instance;
    }

    private BundleManager(){}

    public Bundle initBundle(String key, String value) {
        Bundle bundle = new Bundle();
        bundle.putString(key, value);
        return bundle;
    }

}
