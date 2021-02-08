package com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.repo;

public abstract class BaseRepository<T> {

    protected abstract void initRef();
    protected abstract void initLiveRef();

    protected void initBaseRef(){
        initRef();
        initLiveRef();
    }
}
