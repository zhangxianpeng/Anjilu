package com.example.administrator.bean;

/**
 * 加密方式实体类
 */

public class EncryptionType {
    private int Icon;
    private String encryptiontype;

    public EncryptionType() {
    }

    public EncryptionType(int Icon, String encryptiontype) {
        this.Icon = Icon;
        this.encryptiontype = encryptiontype;
    }

    public int gethIcon() {
        return Icon;
    }

    public String gethName() {
        return encryptiontype;
    }

    public void sethIcon(int Icon) {
        this.Icon = Icon;
    }

    public void sethName(String encryptiontype) {
        this.encryptiontype = encryptiontype;
    }
}
