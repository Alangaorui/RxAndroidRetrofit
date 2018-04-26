package com.grant.rxandroid;

/**
 * Created by grant on 2018/4/26 0026.
 */

public interface LoginView extends View {
    void onSuccess(LoginEntity baseEntitys);
    void onError(String result);
}
