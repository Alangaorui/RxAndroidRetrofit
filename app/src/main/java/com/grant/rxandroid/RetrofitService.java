package com.grant.rxandroid;



import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by grant on 2018/4/26 0026.
 */

public interface RetrofitService {

    @POST("userInfo/userLogin")
    Observable<LoginEntity> login(@Query("login_phone") String phone,
                                   @Query("login_password") String password);
    @POST("signAndBinding/bankList")
    Observable<Baens> listban();
}