package com.matlasystems.chat.common.constants;

public final class ValidationConstants {

    private ValidationConstants() {
    }

    /*
     * Username
     */
    public static final int MIN_USERNAME_LENGTH = 3;
    public static final int MAX_USERNAME_LENGTH = 30;

    /*
     * Password
     */
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int MAX_PASSWORD_LENGTH = 64;

    /*
     * Names
     */
    public static final int MIN_NAME_LENGTH = 2;
    public static final int MAX_NAME_LENGTH = 50;

    /*
     * Email
     */
    public static final int MAX_EMAIL_LENGTH = 254;

    /*
     * Messages
     */
    public static final int MAX_MESSAGE_LENGTH = 2000;

    /*
     * Groups
     */
    public static final int MIN_GROUP_NAME_LENGTH = 3;
    public static final int MAX_GROUP_NAME_LENGTH = 100;

    public static final int MAX_GROUP_DESCRIPTION_LENGTH = 500;

    /*
     * Files
     */
    public static final long MAX_FILE_SIZE = 10 * 1024 * 1024;

}