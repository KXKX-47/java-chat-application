//Stores database related constants such as table names, default page sizes, scheman names and other
//database configurations that may be referenced across the application


package com.matlasystems.chat.common.constants;

public final class DatabaseConstants {

    private DatabaseConstants() {

    }

    public static final String USER_TABLE = "users";

    public static final String MESSAGE_TABLE = "messages";

    public static final String GROUP_TABLE = "groups";

    public static final String ROLE_TABLE = "roles";

    public static final int DEFAULT_PAGE_SIZE = 20;
}