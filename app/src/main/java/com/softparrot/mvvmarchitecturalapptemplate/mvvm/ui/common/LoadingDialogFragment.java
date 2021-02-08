package com.softparrot.mvvmarchitecturalapptemplate.mvvm.ui.common;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softparrot.mvvmarchitecturalapptemplate.R;
import com.softparrot.mvvmarchitecturalapptemplate.databinding.FragmentLoadingDialogBinding;
import com.softparrot.mvvmarchitecturalapptemplate.extras.callback.PreventDoubleClickCallback;

public class LoadingDialogFragment extends DialogFragment {

    private FragmentLoadingDialogBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = FragmentLoadingDialogBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);

        click();
    }

    private void click() {
        mBinding.closeIv.setOnClickListener(v -> dismiss());
    }
}