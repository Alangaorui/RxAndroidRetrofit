package com.grant.rxandroid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class Baens {

    @SerializedName("invokingResult")
    private InvokingResult invokingResult;
    @SerializedName("disposeResult")
    private DisposeResultnew disposeResult;

    public Baens() {}

    public Baens(InvokingResult invokingResult, DisposeResultnew disposeResult) {
        this.invokingResult = invokingResult;
        this.disposeResult = disposeResult;
    }

    public InvokingResult getInvokingResult() {
        return invokingResult;
    }

    public void setInvokingResult(InvokingResult invokingResult) {
        this.invokingResult = invokingResult;
    }

    public DisposeResultnew getDisposeResult() {
        return disposeResult;
    }

    public void setDisposeResult(DisposeResultnew disposeResult) {
        this.disposeResult = disposeResult;
    }
}
