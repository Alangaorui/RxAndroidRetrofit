package com.grant.rxandroid;

import android.content.Context;

import java.util.List;

import rx.Observable;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
    public Observable<LoginEntity> login(String phone, String password ){
        return mRetrofitService.login(phone,password);
    }

    public Observable<Baens> listban() {
        return mRetrofitService.listban();
    }
}
