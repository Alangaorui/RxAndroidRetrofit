package com.grant.rxandroid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class DisposeResult {
    @SerializedName("uId")
    private String uId;
    @SerializedName("loginErrMsg")
    private String loginErrMsg;
    @SerializedName("userType")
    private String userType;
    @SerializedName("loginPasswordisRight")
    private String loginPasswordisRight;

    public DisposeResult() {}

    public DisposeResult(String uId, String loginErrMsg, String userType, String loginPasswordisRight) {
        this.uId = uId;
        this.loginErrMsg = loginErrMsg;
        this.userType = userType;
        this.loginPasswordisRight = loginPasswordisRight;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getLoginErrMsg() {
        return loginErrMsg;
    }

    public void setLoginErrMsg(String loginErrMsg) {
        this.loginErrMsg = loginErrMsg;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getLoginPasswordisRight() {
        return loginPasswordisRight;
    }

    public void setLoginPasswordisRight(String loginPasswordisRight) {
        this.loginPasswordisRight = loginPasswordisRight;
    }
}
