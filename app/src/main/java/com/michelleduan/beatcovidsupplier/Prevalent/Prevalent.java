package com.michelleduan.beatcovidsupplier.Prevalent;

import com.michelleduan.beatcovidsupplier.Model.Users;

public class Prevalent {
    public static Users currentOnlineUser;

    public static final String UsernameKey = "Username";
    public static final String UserPasswordKey = "UserPassword";

    public static Users getCurrentOnlineUser() {
        return currentOnlineUser;
    }

    public static void setCurrentOnlineUser(Users currentOnlineUser) {
        Prevalent.currentOnlineUser = currentOnlineUser;
    }

    public static String getUsernameKey() {
        return UsernameKey;
    }

    public static String getUserPasswordKey() {
        return UserPasswordKey;
    }
}


