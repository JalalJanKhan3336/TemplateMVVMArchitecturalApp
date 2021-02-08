package com.softparrot.mvvmarchitecturalapptemplate.mvvm.viewmodel;

import androidx.lifecycle.ViewModel;

import com.softparrot.mvvmarchitecturalapptemplate.extras.manager.SingleLiveEventManager;
import com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.model.helper.ResponseBody;

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
