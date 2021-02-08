package com.softparrot.mvvmarchitecturalapptemplate.mvvm.ui.base.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;

public abstract class PMBaseFragment<VB> extends BaseFragment<VB> {

    public PMBaseFragment() {}

    private static final int PERMISSION_REQUEST_CODE = 5432;

    protected void askRuntimePermissions(final String... PERMISSIONS){
        if(!areAllPermissionsEnabled(PERMISSIONS))
            requestPermissions(PERMISSIONS, PERMISSION_REQUEST_CODE);
    }

    protected boolean areAllPermissionsEnabled(String... PERMISSIONS){

        boolean isAllGranted = false;

        for(String permission : PERMISSIONS){
            if(ContextCompat.checkSelfPermission(requireContext(), permission) == PackageManager.PERMISSION_GRANTED){
                isAllGranted = true;
            }else {
                isAllGranted = false;
                break;
            }
        }

        return isAllGranted;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == PERMISSION_REQUEST_CODE){
            if(grantResults.length > 0){
                boolean isAllGranted = false;

                for(int result : grantResults){
                    if(result == PackageManager.PERMISSION_GRANTED){
                        isAllGranted = true;
                    }else {
                        isAllGranted = false;
                        break;
                    }
                }

                if(isAllGranted)
                    onPermissionsGranted();
                else
                    onPermissionsDenied();
            }
        }

    }

    protected void showDenialBox(){

        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle("Permissions Required!");
        builder.setMessage("Permissions are required to proceed.");
        builder.setCancelable(false);

        builder.setPositiveButton("Goto Settings", (dialogInterface, i) -> {
            dialogInterface.dismiss();
            gotoSettings(requireContext());
        });

        builder.create().show();
    }

    private void gotoSettings(Context context) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", context.getPackageName(), null);
        intent.setData(uri);
        startActivity(intent);
    }

    protected abstract void onPermissionsGranted();
    protected abstract void onPermissionsDenied();
}