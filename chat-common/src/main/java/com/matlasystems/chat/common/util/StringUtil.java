package com.matlasystems.chat.common.util;

public final class StringUtil {

    private StringUtil() {
    }

    public static boolean isNull(String value) {
        return value == null;
    }

    public static boolean isEmpty(String value) {
        return value != null && value.isEmpty();
    }

    public static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isNullOrBlank(String value) {
        return isBlank(value);
    }    

    public static boolean hasText(String value) {
        return !isBlank(value);
    }

    public static String trim(String value) {

        if (value == null) {
            return null;
        }

        return value.trim();
    }

    public static String capitalize(String value) {

        if (isBlank(value)) {
            return value;
        }

        return Character.toUpperCase(value.charAt(0))
                + value.substring(1).toLowerCase();
    }

    public static String capitalizeWords(String value) {

        if (isBlank(value)) {
            return value;
        }

        StringBuilder builder = new StringBuilder();

        String[] words = value.trim().split("\\s+");

        for (String word : words) {

            builder.append(capitalize(word));

            builder.append(" ");

        }

        return builder.toString().trim();

    }

    public static String fullName(String firstName,
                                  String lastName) {

        if (isBlank(firstName) && isBlank(lastName)) {
            return "";
        }

        if (isBlank(firstName)) {
            return trim(lastName);
        }

        if (isBlank(lastName)) {
            return trim(firstName);
        }

        return trim(firstName) + " " + trim(lastName);

    }

    public static String reverse(String value) {

        if (value == null) {
            return null;
        }

        return new StringBuilder(value)
                .reverse()
                .toString();

    }

    public static boolean equals(String first,
                                 String second) {

        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return first.equals(second);

    }

    public static boolean equalsIgnoreCase(String first,
                                           String second) {

        if (first == null && second == null) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        return first.equalsIgnoreCase(second);

    }

}