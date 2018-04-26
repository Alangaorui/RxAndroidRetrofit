package com.grant.rxandroid;

import com.google.gson.annotations.SerializedName;

import java.lang.ref.PhantomReference;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class InvokingResult {
    @SerializedName("alertCode")
    private String alertCode;
    @SerializedName("message")
    private String message;
    @SerializedName("invoking")
    private String invoking;

    public InvokingResult() {}

    public InvokingResult(String alertCode, String message, String invoking) {
        this.alertCode = alertCode;
        this.message = message;
        this.invoking = invoking;
    }

    public String getAlertCode() {
        return alertCode;
    }

    public void setAlertCode(String alertCode) {
        this.alertCode = alertCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getInvoking() {
        return invoking;
    }

    public void setInvoking(String invoking) {
        this.invoking = invoking;
    }
}
