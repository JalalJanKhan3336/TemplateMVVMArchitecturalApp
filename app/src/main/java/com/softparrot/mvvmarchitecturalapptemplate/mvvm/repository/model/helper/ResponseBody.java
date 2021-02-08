package com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.model.helper;

import android.text.TextUtils;

import java.io.Serializable;

public class ResponseBody<T> implements Serializable {
    private boolean isSuccess;
    private String message;
    private T body;

    public ResponseBody() {}

    public ResponseBody(boolean isSuccess, String message, T body) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.body = body;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        if(message == null || TextUtils.isEmpty(message))
            return null;
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
