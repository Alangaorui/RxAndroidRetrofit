package com.grant.rxandroid;

/**
 * Created by grant on 2018/4/26 0026.
 */

public class ListBan {
    private String bankCode;
    private String bankContent;
    private String bankName;
    private String bankLogo;

    public ListBan() {}

    public ListBan(String bankCode, String bankContent, String bankName, String bankLogo) {
        this.bankCode = bankCode;
        this.bankContent = bankContent;
        this.bankName = bankName;
        this.bankLogo = bankLogo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankContent() {
        return bankContent;
    }

    public void setBankContent(String bankContent) {
        this.bankContent = bankContent;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo;
    }

    @Override
    public String toString() {
        return "ListBan{" +
                "bankCode='" + bankCode + '\'' +
                ", bankContent='" + bankContent + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankLogo='" + bankLogo + '\'' +
                '}';
    }
}
