package com.nextdimit.mvvmtemplate.extras.manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.nextdimit.mvvmtemplate.MyApp;
import com.nextdimit.mvvmtemplate.R;

public class SharedPrefManager {

    private static SharedPrefManager instance;

    public synchronized static SharedPrefManager getInstance() {
        if(instance == null)
            instance = new SharedPrefManager();
        return instance;
    }

    private final SharedPreferences mPref;

    private SharedPrefManager(){
        Context context = MyApp.getInstance().getAppContext();
        mPref = context.getSharedPreferences(MyApp.getInstance().getAppContext().getResources().getString(R.string.app_name), Context.MODE_PRIVATE);
    }

    public void saveString(String key, String value) {
        mPref
                .edit()
                .putString(key, value)
                .apply();
    }

    public String getString(String key){
        return mPref.getString(key, null);
    }

    public void saveBoolean(String key, boolean value){
        mPref
                .edit()
                .putBoolean(key, value)
                .apply();
    }

    public boolean getBoolean(String key) {
        return mPref.getBoolean(key, false);
    }

    public void saveInteger(String key, int value) {
        mPref
                .edit()
                .putInt(key, value)
                .apply();
    }

    public int getInteger(String key){
        return mPref.getInt(key, -1);
    }

    public void saveLong(String key, long value) {
        mPref
                .edit()
                .putLong(key, value)
                .apply();
    }

    public long getLong(String key){
        return mPref.getLong(key, -1);
    }

    public void saveFloat(String key, float value) {
        mPref
                .edit()
                .putFloat(key, value)
                .apply();
    }

    public float getFloat(String key){
        return mPref.getFloat(key, -1);
    }

}
