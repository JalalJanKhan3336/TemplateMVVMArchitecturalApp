package com.nextdimit.mvvmtemplate.extras.utils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public abstract class FragmentUtils {

    private FragmentUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Can not instantiate Abstract Class");
    }

    // Adding Fragment
    public static void addFragment(FragmentManager fm, int id, Fragment fragment, boolean addToBackStack
            , FragmentManager.OnBackStackChangedListener listener){

        FragmentTransaction ft = fm.beginTransaction();
        fm.addOnBackStackChangedListener(listener);

        if(addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        else
            ft.addToBackStack(null);

        ft.add(id, fragment, fragment.getClass().getSimpleName());
        ft.commit();
    }

    // Adding Fragment
    public static void addFragment(FragmentManager fm, int id, Fragment fragment, boolean addToBackStack){

        FragmentTransaction ft = fm.beginTransaction();

        if(addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        else
            ft.addToBackStack(null);

        ft.add(id, fragment, fragment.getClass().getSimpleName());
        ft.commit();
    }

    // Replacing Fragment
    public static void replaceFragment(FragmentManager fm, int id, Fragment fragment, boolean addToBackStack
            , FragmentManager.OnBackStackChangedListener listener){

        FragmentTransaction ft = fm.beginTransaction();
        fm.addOnBackStackChangedListener(listener);

        if(addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        else
            ft.addToBackStack(null);

        ft.replace(id, fragment, fragment.getClass().getSimpleName());
        ft.commit();
    }

    // Replacing Fragment
    public static void replaceFragment(FragmentManager fm, int id, Fragment fragment, boolean addToBackStack){

        FragmentTransaction ft = fm.beginTransaction();

        if(addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        else
            ft.addToBackStack(null);

        ft.replace(id, fragment, fragment.getClass().getSimpleName());
        ft.commit();
    }

    public static void removeFragment(FragmentManager fm, Fragment fragment){
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(fragment);
        ft.commit();
        fm.popBackStack();
    }

    public static void removeTopFragment(FragmentManager fm){
        fm.popBackStack();
    }

}