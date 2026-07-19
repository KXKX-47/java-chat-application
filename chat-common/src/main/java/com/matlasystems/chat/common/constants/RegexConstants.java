package com.matlasystems.chat.common.constants;

public final class RegexConstants {

    private RegexConstants() {
    }

    public static final String EMAIL =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static final String USERNAME =
            "^[A-Za-z0-9_]{3,30}$";

    public static final String PHONE =
            "^\\+?[0-9]{10,15}$";

    /*
     * At least
     * one uppercase
     * one lowercase
     * one digit
     * one special character
     */
    public static final String PASSWORD =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,64}$";

}