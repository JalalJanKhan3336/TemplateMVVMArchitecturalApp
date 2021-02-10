package com.nextdimit.mvvmtemplate.mvvm.ui.base.dialog;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.io.Serializable;

public abstract class BaseDialogFragment<VB> extends DialogFragment {

    protected VB mBinding;
    protected NavController mNavController;
    protected ProgressDialog mProgressDialog;

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
        if (mProgressDialog == null)
            mProgressDialog = new ProgressDialog(getContext());
    }

    protected void loading(boolean showIt, boolean isCancelable, String msg) {
        mProgressDialog.setMessage(msg);
        mProgressDialog.setCancelable(isCancelable);

        if (showIt)
            mProgressDialog.show();
        else
            mProgressDialog.dismiss();
    }

    protected void initNavGraph(int host) {
        mNavController = Navigation.findNavController(requireActivity(), host);
    }

    protected void initNavGraph(View host) {
        mNavController = Navigation.findNavController(host);
    }

    protected Bundle initBundle(String key, Serializable item) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(key, item);
        return bundle;
    }

}