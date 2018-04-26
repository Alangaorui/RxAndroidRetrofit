package com.grant.rxandroid.TotailRxAndroid.ui.bean;

import com.grant.rxandroid.InvokingResult;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class FactoryBean<T> {
    private T disposeResult;
    private InvokingResult invokingResult;

    public FactoryBean() {}

    public FactoryBean(T disposeResult, InvokingResult invokingResult) {
        this.disposeResult = disposeResult;
        this.invokingResult = invokingResult;
    }

    public T getDisposeResult() {
        return disposeResult;
    }

    public void setDisposeResult(T disposeResult) {
        this.disposeResult = disposeResult;
    }

    public InvokingResult getInvokingResult() {
        return invokingResult;
    }

    public void setInvokingResult(InvokingResult invokingResult) {
        this.invokingResult = invokingResult;
    }

    @Override
    public String toString() {
        return "FactoryBean{" +
                "disposeResult=" + disposeResult +
                ", invokingResult=" + invokingResult +
                '}';
    }
}
