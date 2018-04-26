package com.grant.rxandroid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class LoginPresenter implements Presenter {

    private DataManager manager;
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;
    private LoginEntity baseEntitys;
    private LoginView loginView;

    public LoginPresenter(Context context) {
        this.mContext= context;
    }

    @Override
    public void onCreate() {
        manager = new DataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(com.grant.rxandroid.View view) {
        loginView = (LoginView) view;
    }


    @Override
    public void attachIncomingIntent(Intent intent) {

    }
    public void login(String phone,String password){
        mCompositeSubscription.add(manager.login(phone,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginEntity>() {
                    @Override
                    public void onCompleted() {
                        LoginEntity loginEntity = baseEntitys;
                        Log.e("sss","sss"+loginEntity);
                        if (baseEntitys != null){
                            loginView.onSuccess(baseEntitys);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        loginView.onError("请求失败！！");
                    }

                    @Override
                    public void onNext(LoginEntity baseEntitys) {
                        DisposeResult disposeResult = baseEntitys.getDisposeResult();
                        String s = disposeResult.getuId();
                        loginView.onSuccess(baseEntitys);
                        Log.e("sss","sssa"+s);
                    }
                })
        );
    }

    public void listban() {
        mCompositeSubscription.add(manager.listban()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Baens>() {
                    @Override
                    public void onCompleted() {
                        Log.e("ad","ad1");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("ad","ad2");
                    }

                    @Override
                    public void onNext(Baens baens) {

                        DisposeResultnew disposeResult = baens.getDisposeResult();
                        String bankCode = disposeResult.getListBans().get(1).getBankCode();
                        Log.e("ad","ad"+bankCode);
                    }
                }));
    }

}
