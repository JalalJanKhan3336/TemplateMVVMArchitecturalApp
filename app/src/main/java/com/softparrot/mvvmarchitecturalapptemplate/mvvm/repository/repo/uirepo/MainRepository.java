package com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.repo.uirepo;

import com.softparrot.mvvmarchitecturalapptemplate.mvvm.repository.repo.BaseRepository;

public class MainRepository extends BaseRepository<Object> {

    private static MainRepository instance;

    public synchronized static MainRepository getInstance() {
        if(instance == null)
            instance = new MainRepository();
        return instance;
    }

    private MainRepository() {
        initBaseRef();
    }

    @Override
    protected void initRef() {}

    @Override
    protected void initLiveRef() {}

}
