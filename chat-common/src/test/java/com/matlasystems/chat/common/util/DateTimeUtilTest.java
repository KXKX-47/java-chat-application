package com.matlasystems.chat.common.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.constants.DateConstants;
import com.matlasystems.chat.common.exceptions.InvalidDateTimeException;

class DateTimeUtilTest {

    @Test
    @DisplayName("Should return today's date")
    void shouldReturnToday() {

        LocalDate today = LocalDate.now();

        assertEquals(today, DateTimeUtil.today());

    }

    @Test
    @DisplayName("Should return current date and time")
    void shouldReturnCurrentDateTime() {

        LocalDateTime before = LocalDateTime.now();

        LocalDateTime actual = DateTimeUtil.now();

        LocalDateTime after = LocalDateTime.now();

        assertFalse(actual.isBefore(before));

        assertFalse(actual.isAfter(after));

    }

    @Test
    @DisplayName("Should return South African current date and time")
    void shouldReturnSouthAfricanCurrentTime() {

        LocalDateTime dateTime = DateTimeUtil.nowSouthAfrica();

        assertNotNull(dateTime);

    }

    @Test
    @DisplayName("Should format LocalDate correctly")
    void shouldFormatDate() {

        LocalDate date = LocalDate.of(2026, 7, 15);

        String formatted = DateTimeUtil.format(date);

        assertEquals("2026-07-15", formatted);

    }

    @Test
    @DisplayName("Should throw exception when formatting null date")
    void shouldThrowExceptionForNullDate() {

        assertThrows(
                InvalidDateTimeException.class,
                () -> DateTimeUtil.format((LocalDate) null));

    }

    @Test
    @DisplayName("Should format LocalDateTime correctly")
    void shouldFormatDateTime() {

        LocalDateTime dateTime =
                LocalDateTime.of(2026, 7, 15, 10, 30, 45);

        String formatted = DateTimeUtil.format(dateTime);

        assertEquals(
                "2026-07-15 10:30:45",
                formatted);

    }

    @Test
    @DisplayName("Should throw exception for null LocalDateTime")
    void shouldThrowExceptionForNullDateTime() {

        assertThrows(
                InvalidDateTimeException.class,
                () -> DateTimeUtil.format((LocalDateTime) null));

    }

    @Test
    @DisplayName("Should parse valid date")
    void shouldParseValidDate() {

        LocalDate expected =
                LocalDate.of(2026, 7, 15);

        LocalDate actual =
                DateTimeUtil.parseDate("2026-07-15");

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Should throw exception for invalid date")
    void shouldThrowExceptionForInvalidDate() {

        assertThrows(
                InvalidDateTimeException.class,
                () -> DateTimeUtil.parseDate("15/07/2026"));

    }

    @Test
    @DisplayName("Should parse valid date time")
    void shouldParseValidDateTime() {

        LocalDateTime expected =
                LocalDateTime.of(
                        2026,
                        7,
                        15,
                        10,
                        30,
                        45);

        LocalDateTime actual =
                DateTimeUtil.parseDateTime(
                        "2026-07-15 10:30:45");

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Should throw exception for invalid date time")
    void shouldThrowExceptionForInvalidDateTime() {

        assertThrows(
                InvalidDateTimeException.class,
                () -> DateTimeUtil.parseDateTime(
                        "15-07-2026 10:30"));

    }

    @Test
    @DisplayName("Should identify first date as before second")
    void shouldReturnTrueWhenBefore() {

        LocalDateTime first =
                LocalDateTime.of(2026, 1, 1, 10, 0);

        LocalDateTime second =
                LocalDateTime.of(2026, 1, 2, 10, 0);

        assertTrue(
                DateTimeUtil.isBefore(first, second));

    }

    @Test
    @DisplayName("Should identify first date as after second")
    void shouldReturnTrueWhenAfter() {

        LocalDateTime first =
                LocalDateTime.of(2026, 1, 2, 10, 0);

        LocalDateTime second =
                LocalDateTime.of(2026, 1, 1, 10, 0);

        assertTrue(
                DateTimeUtil.isAfter(first, second));

    }

    @Test
    @DisplayName("Should calculate days between dates")
    void shouldCalculateDaysBetween() {

        LocalDate start =
                LocalDate.of(2026, 1, 1);

        LocalDate end =
                LocalDate.of(2026, 1, 11);

        assertEquals(
                10,
                DateTimeUtil.daysBetween(start, end));

    }

    @Test
    @DisplayName("Should calculate zero days between same date")
    void shouldCalculateZeroDaysBetweenSameDate() {

        LocalDate date =
                LocalDate.of(2026, 1, 1);

        assertEquals(
                0,
                DateTimeUtil.daysBetween(date, date));

    }

    @Test
    @DisplayName("Should throw exception when start date is null")
    void shouldThrowExceptionForNullStartDate() {

        LocalDate end =
                LocalDate.of(2026, 1, 1);

        assertThrows(
                InvalidDateTimeException.class,
                () -> DateTimeUtil.daysBetween(null, end));

    }

    @Test
    @DisplayName("Should throw exception when end date is null")
    void shouldThrowExceptionForNullEndDate() {

        LocalDate start =
                LocalDate.of(2026, 1, 1);

        assertThrows(
                InvalidDateTimeException.class,
                () -> DateTimeUtil.daysBetween(start, null));

    }

    @Test
    @DisplayName("Should validate valid date range")
    void shouldValidateDateRange() {

        assertDoesNotThrow(() ->

                DateTimeUtil.validateDateRange(
                        LocalDate.of(2026, 1, 1),
                        LocalDate.of(2026, 12, 31)));

    }

    @Test
    @DisplayName("Should throw exception when end date is before start date")
    void shouldThrowExceptionForInvalidDateRange() {

        assertThrows(
                InvalidDateTimeException.class,

                () -> DateTimeUtil.validateDateRange(

                        LocalDate.of(2026, 12, 31),

                        LocalDate.of(2026, 1, 1)));

    }

    @Test
    @DisplayName("Should throw exception when start date is null")
    void shouldThrowExceptionWhenStartDateIsNull() {

        assertThrows(
                InvalidDateTimeException.class,

                () -> DateTimeUtil.validateDateRange(

                        null,

                        LocalDate.now()));

    }

    @Test
    @DisplayName("Should throw exception when end date is null")
    void shouldThrowExceptionWhenEndDateIsNull() {

        assertThrows(
                InvalidDateTimeException.class,

                () -> DateTimeUtil.validateDateRange(

                        LocalDate.now(),

                        null));

    }

}