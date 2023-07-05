package com.qian.studentststem;

public class User {
    private String userName;
    private String userPassword;
    private String uesrID;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String userPassword, String uesrId, String phoneNumber) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.uesrID = uesrId;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUesrId() {
        return uesrID;
    }

    public void setUesrId(String uesrId) {
        this.uesrID = uesrId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
