package com.nextdimit.mvvmtemplate.mvvm.ui.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.nextdimit.mvvmtemplate.extras.manager.SharedPrefManager;
import com.nextdimit.mvvmtemplate.mvvm.ui.base.activity.BaseActivity;

import java.io.Serializable;

public abstract class BaseFragment<VB> extends Fragment {

    protected VB mBinding;
    protected NavController mNavController;
    protected SharedPrefManager mPrefManager;

    protected abstract VB initBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup container);
    protected abstract View initRoot();
    protected abstract void initRef();
    protected abstract void click();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = initBinding(inflater, container);
        return initRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initBaseRef();
        initRef();
        click();
    }

    private void initBaseRef() {
        mPrefManager = SharedPrefManager.getInstance();
    }

    protected void loading(boolean showIt, boolean isCancelable, String msg){
        if(getContext() != null)
            ((BaseActivity<VB>) getContext()).loading(showIt, isCancelable, msg);
    }

    protected void initNavGraph(int host){
        mNavController = Navigation.findNavController(requireActivity(), host);
    }

    protected void initNavGraph(View view){
        mNavController = Navigation.findNavController(view);
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