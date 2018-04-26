package com.grant.rxandroid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class LoginEntity {

//    @SerializedName("alertCode")
//    private String alertCode;
//    @SerializedName("message")
//    private String message;
//    @SerializedName("invoking")
//    private String invoking;
    @SerializedName("invokingResult")
    private InvokingResult invokingResult;
    @SerializedName("disposeResult")
    private DisposeResult disposeResult;

    public LoginEntity() {}

    public LoginEntity(InvokingResult invokingResult, DisposeResult disposeResult) {
        this.invokingResult = invokingResult;
        this.disposeResult = disposeResult;
    }

    public InvokingResult getInvokingResult() {
        return invokingResult;
    }

    public void setInvokingResult(InvokingResult invokingResult) {
        this.invokingResult = invokingResult;
    }

    public DisposeResult getDisposeResult() {
        return disposeResult;
    }

    public void setDisposeResult(DisposeResult disposeResult) {
        this.disposeResult = disposeResult;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "invokingResult=" + invokingResult +
                ", disposeResult=" + disposeResult +
                '}';
    }
}
