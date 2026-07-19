package com.matlasystems.chat.common.constants;

public final class PasswordConstants {

    private PasswordConstants() {
    }

    /*
     * Password Length
     */
    public static final int MIN_PASSWORD_LENGTH = 8;

    public static final int MAX_PASSWORD_LENGTH = 64;

    /*
     * Character Requirements
     */
    public static final int MIN_UPPERCASE = 1;

    public static final int MIN_LOWERCASE = 1;

    public static final int MIN_DIGITS = 1;

    public static final int MIN_SPECIAL_CHARACTERS = 1;

    /*
     * Allowed Special Characters
     */
    public static final String SPECIAL_CHARACTERS =
            "!@#$%^&*()_+-=[]{}|;:,.<>?";

    /*
     * Password Expiry (Future)
     */
    public static final int PASSWORD_EXPIRY_DAYS = 90;

}