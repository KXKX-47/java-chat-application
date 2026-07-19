//Stores standard date and time formats to ensure consistend date formats acorss the application


package com.matlasystems.chat.common.constants;

public final class DateConstants {

    private DateConstants() {
    }

    /*
     * Standard Date Formats
     */

    public static final String DATE_PATTERN =
            "yyyy-MM-dd";

    public static final String TIME_PATTERN =
            "HH:mm:ss";

    public static final String DATE_TIME_PATTERN =
            "yyyy-MM-dd HH:mm:ss";

    public static final String ISO_DATE_PATTERN =
            "yyyy-MM-dd";

    public static final String ISO_DATE_TIME_PATTERN =
            "yyyy-MM-dd'T'HH:mm:ss";

    public static final String ISO_OFFSET_DATE_TIME_PATTERN =
            "yyyy-MM-dd'T'HH:mm:ssXXX";

    /*
     * Time Zones
     */

    public static final String UTC_ZONE =
            "UTC";

    public static final String SOUTH_AFRICA_ZONE =
            "Africa/Johannesburg";

    /*
     * Business Constants
     */

    public static final int DAYS_PER_WEEK = 7;

    public static final int HOURS_PER_DAY = 24;

    public static final int MINUTES_PER_HOUR = 60;

    public static final int SECONDS_PER_MINUTE = 60;

}