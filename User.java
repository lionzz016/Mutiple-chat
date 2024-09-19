package com.cjp.olc.common;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author CJP
 * @version 1.0
 * User用户类，用于定义用户账号、用户密码等。
 */
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String userID;
    private String userPwd;

    public User() {
    }

    public User(String userID, String userPwd) {
        this.userID = userID;
        this.userPwd = userPwd;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
