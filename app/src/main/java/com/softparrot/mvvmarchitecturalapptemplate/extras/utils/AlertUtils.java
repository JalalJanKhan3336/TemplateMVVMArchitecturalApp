package com.softparrot.mvvmarchitecturalapptemplate.extras.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.google.android.material.snackbar.Snackbar;
import com.softparrot.mvvmarchitecturalapptemplate.MyApp;

public class AlertUtils {
    private AlertUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Can not instantiate");
    }

    public static void toast(String msg){
        Toast.makeText(MyApp.getInstance().getAppContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void toast(String msg, int gravity, int xOffset, int yOffset){
        Toast toast = Toast.makeText(MyApp.getInstance().getAppContext(), msg, Toast.LENGTH_SHORT);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.show();
    }

    public static void snackIt(View view, String msg){
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }

    public static void snackIt(View view, String msg, int color){
        Snackbar
                .make(view, msg, Snackbar.LENGTH_LONG)
                .setBackgroundTint(color)
                .show();
    }

    public static void snackIt(View view, String msg, int textColor, int bgColor){
        Snackbar
                .make(view, msg, Snackbar.LENGTH_LONG)
                .setBackgroundTint(bgColor)
                .setTextColor(textColor)
                .show();
    }

    public static void okAlert(Context context, String title, String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());

        builder.create().show();
    }

    public static void oneButtonAlert(Context context, String title, String msg, String posName, Dialog.OnClickListener listener){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton(posName, listener);
        builder.create().show();
    }

    public static void twoButtonsAlert(Context context, String title, String msg, String posName, String negName, Dialog.OnClickListener listener){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.setPositiveButton(posName, listener);
        builder.setNegativeButton(negName, listener);
        builder.create().show();
    }

}
