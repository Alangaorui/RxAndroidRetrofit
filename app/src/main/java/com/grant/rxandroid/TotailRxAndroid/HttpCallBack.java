package com.grant.rxandroid.TotailRxAndroid;

/**
 * Created by grant on 2018/4/26 0026.
 */

public interface HttpCallBack<T> {
    void onSuccessful(T t);//成功了就回调这个方法,可以传递任何形式的数据给调用者

    void onFaild(String errorMsg);//失败了就调用这个方法,可以传递错误的请求消息给调用者
}
