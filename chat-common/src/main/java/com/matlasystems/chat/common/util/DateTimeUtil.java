/**
 * Centralizes all date and time operations
 */

package com.matlasystems.chat.common.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import com.matlasystems.chat.common.constants.DateConstants;
import com.matlasystems.chat.common.exceptions.InvalidDateTimeException;

public final class DateTimeUtil {

    private static final DateTimeFormatter DATE_FORMATTER = 
        DateTimeFormatter.ofPattern(DateConstants.DATE_PATTERN);

    private static final DateTimeFormatter DATE_TIME_FORMATTER = 
        DateTimeFormatter.ofPattern(DateConstants.DATE_TIME_PATTERN);

    private DateTimeUtil(){

    }

    public static LocalDate today(){
        return LocalDate.now();
    }

    public static LocalDateTime now(){
        return LocalDateTime.now();
    }

    public static LocalDateTime nowSouthAfrica() {

        return LocalDateTime.now(ZoneId.of(DateConstants.SOUTH_AFRICA_ZONE));
    }

    public static String format(LocalDate date) {

        if(date == null) {
            throw new InvalidDateTimeException("Date cannot be null");
        }

        return date.format(DATE_FORMATTER);
    }

    public static String format(LocalDateTime datetime) {

        if(datetime == null) {

            throw new InvalidDateTimeException("Date/Time cannot be null");
        }

        return datetime.format(DATE_TIME_FORMATTER);
    }

    public static LocalDate parseDate(String value) {

        try {

            return LocalDate.parse(value,DATE_FORMATTER);

        } catch (DateTimeParseException ex) {

            throw new InvalidDateTimeException("Invalid date format: " + value, ex);
        }
    }

    public static LocalDateTime parseDateTime(String value) {

        try {

            return LocalDateTime.parse(value,DATE_TIME_FORMATTER);
        } catch (DateTimeParseException ex) {

            throw new InvalidDateTimeException(
                "Invalid date/time format: " + value, ex
            );
        }
    }

    public static boolean isBefore(LocalDateTime first, LocalDateTime second) {

        return first.isBefore(second);
    }

    public static boolean isAfter(LocalDateTime first, LocalDateTime second) {

        return first.isAfter(second);
    }

    public static long daysBetween(LocalDate start, LocalDate end) {

        if (start == null || end == null) {

            throw new InvalidDateTimeException("Dates cannot be null. ");
        }

        return Duration.between(start.atStartOfDay(),end.atStartOfDay()).toDays();

    }

    public static void validateDateRange(LocalDate start, LocalDate end) {

        if (start == null || end == null) {

            throw new InvalidDateTimeException(
                "Start date and end date are required."
            );
        }

        if (end.isBefore(start)) {

            throw new InvalidDateTimeException("End date cannot be before start date.");
        }
    }
}