package com.grant.rxandroid.TotailRxAndroid;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * Created by grant on 2018/4/26 0026.
 * 构造一个Retrofit对象
 */

public class RetrofitOkhttp {
    static RetrofitDataUrlService retrofitDataUrlService;
    RetrofitOkhttp() {
        OkHttpClient httpClient;
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient = new OkHttpClient.Builder()
                .connectTimeout(10L, TimeUnit.SECONDS)
                .writeTimeout(20L, TimeUnit.SECONDS)
                .readTimeout(20L, TimeUnit.SECONDS)
                .build();
        retrofitDataUrlService = (new Retrofit.Builder().client(httpClient)
                .baseUrl(RetrofitDataUrlService.BASEURL)//请求的总地址
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(RetrofitDataUrlService.class));
    }

    public RetrofitDataUrlService getDateInfoServer() {
        return retrofitDataUrlService;
    }
}
