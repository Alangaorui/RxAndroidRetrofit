package com.grant.rxandroid.TotailRxAndroid.ui.bean;

import com.grant.rxandroid.DisposeResult;
import com.grant.rxandroid.InvokingResult;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class FactoryBean {
    private DisposeResult disposeResult;
    private InvokingResult invokingResult;

    public FactoryBean() {}

    public FactoryBean(DisposeResult disposeResult, InvokingResult invokingResult) {
        this.disposeResult = disposeResult;
        this.invokingResult = invokingResult;
    }

    public DisposeResult getDisposeResult() {
        return disposeResult;
    }

    public void setDisposeResult(DisposeResult disposeResult) {
        this.disposeResult = disposeResult;
    }

    public InvokingResult getInvokingResult() {
        return invokingResult;
    }

    public void setInvokingResult(InvokingResult invokingResult) {
        this.invokingResult = invokingResult;
    }


}
