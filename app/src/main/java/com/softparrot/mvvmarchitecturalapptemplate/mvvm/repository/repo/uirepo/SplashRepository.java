package com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.repo.uirepo;

import com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.repo.BaseRepository;


public class SplashRepository extends BaseRepository<Object> {

    private static SplashRepository instance;

    public synchronized static SplashRepository getInstance() {
        if(instance == null)
            instance = new SplashRepository();
        return instance;
    }

    private SplashRepository() {
        initBaseRef();
    }

    @Override
    protected void initLiveRef() {}

    @Override
    protected void initRef() {

    }
}
