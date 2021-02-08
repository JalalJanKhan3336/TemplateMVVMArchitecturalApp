package com.softparrot.mvvmarchitecturalapptemplate.extras.utils;

import android.content.Context;
import android.content.Intent;

import java.io.Serializable;

public class NavigatorUtils {
    private NavigatorUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Can not instantiate");
    }

    public static void navigateTo(Context from, Class<?> to){
        from.startActivity(new Intent(from, to));
    }

    public static void navigateTo(Context from, Class<?> to, String key, int value){
        Intent intent = new Intent(from, to);
        intent.putExtra(key, value);
        from.startActivity(intent);
    }

    public static void navigateTo(Context from, Class<?> to, String key, double value){
        Intent intent = new Intent(from, to);
        intent.putExtra(key, value);
        from.startActivity(intent);
    }

    public static void navigateTo(Context from, Class<?> to, String key, String value){
        Intent intent = new Intent(from, to);
        intent.putExtra(key, value);
        from.startActivity(intent);
    }

    public static void navigateTo(Context from, Class<?> to, String key, Serializable value){
        Intent intent = new Intent(from, to);
        intent.putExtra(key, value);
        from.startActivity(intent);
    }
}
