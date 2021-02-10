package com.nextdimit.mvvmtemplate.mvvm.viewmodel;

import androidx.lifecycle.ViewModel;

import com.nextdimit.mvvmtemplate.extras.manager.SingleLiveEventManager;
import com.nextdimit.mvvmtemplate.mvvm.repository.model.helper.ResponseBody;

public class BaseViewModel extends ViewModel {
    private SingleLiveEventManager<ResponseBody<Void>> mNotifierLiveData;

    public BaseViewModel() {
        mNotifierLiveData = new SingleLiveEventManager<>();
    }

    protected void updateNotifierStatus(ResponseBody<Void> response){
        mNotifierLiveData.setValue(response);
    }

    protected void updateNotifierStatus(boolean isSuccess, String msg){
        mNotifierLiveData.setValue(new ResponseBody<>(isSuccess, msg, null));
    }

}
