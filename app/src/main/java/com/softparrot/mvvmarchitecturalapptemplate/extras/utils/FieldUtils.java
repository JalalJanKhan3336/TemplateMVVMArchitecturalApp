package com.softparrot.mvvmarchitecturalapptemplate.extras.utils;

import android.text.TextUtils;
import android.widget.EditText;

import androidx.annotation.NonNull;

public class FieldUtils {

    private FieldUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Can not instantiated");
    }

    /**
     * @param value a String Value
     * @endpoint Returns TRUE iff @value is null or empty
     * */
    public static boolean isEmpty(String value){
        return value == null || TextUtils.isEmpty(value);
    }

    /**
     * @param value a String Value
     * @endpoint Returns null iff @value is null or empty
     * */
    public static String filterValue(String value){
        if(value == null || TextUtils.isEmpty(value))
            return null;

        return value;
    }


    /**
     * @param fields List of EditTexts to Validate
     * @endpoint Return TRUE iff all fields are OK
     * */
    public static boolean validate(EditText... fields){

        for(EditText field : fields){
            if(field != null){
                String value = field.getText().toString().trim();
                if(isEmpty(value))
                    return false;
            }
        }

        return true; // All Fields are OK
    }

    /**
     * @param errorText A NonNull Error Message to Show on Empty EditText
     * @param fields List of EditTexts to Validate
     * @endpoint Return TRUE iff all fields are OK
     * */
    public static boolean validate(@NonNull String errorText, EditText... fields){

        for(EditText field : fields){
            if(field != null){
                String value = field.getText().toString().trim();
                if(isEmpty(value)){
                    field.setError(errorText);
                    return false;
                }else
                    field.setError(null);
            }
        }

        return true; // All Fields are OK
    }

}
