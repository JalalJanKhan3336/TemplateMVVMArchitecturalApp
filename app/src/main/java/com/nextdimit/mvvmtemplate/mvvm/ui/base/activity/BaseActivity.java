package com.nextdimit.mvvmtemplate.mvvm.ui.base.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.io.Serializable;

public abstract class BaseActivity<VB> extends AppCompatActivity {

    protected VB mBinding;

    protected abstract VB initBinding();
    protected abstract View initRoot();
    protected abstract void initRef();
    protected abstract void click();

    private ProgressDialog mLoadingDialog;

    protected NavController mNavController;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        mBinding = initBinding();
        setContentView(initRoot());

        initBase();
        initRef();
        click();
    }

    private void initBase(){
        mLoadingDialog = new ProgressDialog(this);
    }

    protected void initNavGraph(int host){
        mNavController = Navigation.findNavController(this, host);
    }

    protected void initNavGraph(View host){
        mNavController = Navigation.findNavController(host);
    }

    public void loading(boolean showIt, boolean cancelable, String msg){
        if(mLoadingDialog == null)
            mLoadingDialog = new ProgressDialog(this);

        mLoadingDialog.setCancelable(cancelable);
        mLoadingDialog.setMessage(msg);

        // will be cancelable after 5 seconds
        new Handler().postDelayed(() -> mLoadingDialog.setCancelable(true), 5000);

        if(showIt) {
            if(mLoadingDialog.isShowing())
                mLoadingDialog.dismiss();

            mLoadingDialog.show();
        }
        else
            mLoadingDialog.dismiss();
    }

    protected Bundle initBundle(String key, String item) {
        Bundle bundle = new Bundle();
        bundle.putString(key,item);
        return bundle;
    }

    protected Bundle initBundle(String key, Serializable item) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(key, item);
        return bundle;
    }

    protected Bundle initBundle(String key1, Serializable item1, String key2, Serializable item2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(key1, item1);
        bundle.putSerializable(key2, item2);
        return bundle;
    }

    protected Bundle initBundle(String keyStatus, boolean status, String key1, String value1, String key2, String value2){
        Bundle bundle = new Bundle();

        bundle.putString(key1, value1);
        bundle.putString(key2, value2);
        bundle.putBoolean(keyStatus, status);

        return bundle;
    }
}
