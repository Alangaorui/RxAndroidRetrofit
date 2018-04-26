package com.grant.rxandroid.TotailRxAndroid;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class RetrofitFactory {
    static RetrofitDataUrlService retrofitDataUrlService = null;

    public static RetrofitDataUrlService getsDateInfoSingleton() {
        if (retrofitDataUrlService == null) {
            retrofitDataUrlService = new RetrofitOkhttp().getDateInfoServer();
        }
        return retrofitDataUrlService;
    }
}
