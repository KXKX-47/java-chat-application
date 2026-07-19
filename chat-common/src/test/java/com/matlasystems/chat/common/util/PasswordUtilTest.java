package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.PasswordConstants;
import com.matlasystems.chat.common.exceptions.PasswordException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    /*
     * -------------------------------------------------------------------------
     * validatePassword()
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should accept a valid password")
    void shouldAcceptValidPassword() {

        String password = "Password@123";

        assertDoesNotThrow(() ->
                PasswordUtil.validatePassword(password));

    }

    @Test
    @DisplayName("Should reject null password")
    void shouldRejectNullPassword() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword(null));

        assertEquals(
                "Password cannot be null.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject password shorter than minimum length")
    void shouldRejectPasswordShorterThanMinimumLength() {

        String password = "Aa1@";

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword(password));

        assertEquals(
                "Password must contain at least "
                        + PasswordConstants.MIN_PASSWORD_LENGTH
                        + " characters.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject password longer than maximum length")
    void shouldRejectPasswordLongerThanMaximumLength() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0;
             i < PasswordConstants.MAX_PASSWORD_LENGTH + 1;
             i++) {

            builder.append("A");

        }

        builder.append("a1@");

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword(builder.toString()));

        assertEquals(
                "Password may not exceed "
                        + PasswordConstants.MAX_PASSWORD_LENGTH
                        + " characters.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject password without uppercase letter")
    void shouldRejectPasswordWithoutUppercaseLetter() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword("password@123"));

        assertEquals(
                "Password must contain an uppercase letter.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject password without lowercase letter")
    void shouldRejectPasswordWithoutLowercaseLetter() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword("PASSWORD@123"));

        assertEquals(
                "Password must contain a lowercase letter.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject password without digit")
    void shouldRejectPasswordWithoutDigit() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword("Password@"));

        assertEquals(
                "Password must contain a digit.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject password without special character")
    void shouldRejectPasswordWithoutSpecialCharacter() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePassword("Password123"));

        assertEquals(
                "Password must contain a special character.",
                exception.getMessage());

    }

    /*
     * -------------------------------------------------------------------------
     * validatePasswordConfirmation()
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should accept matching passwords")
    void shouldAcceptMatchingPasswords() {

        assertDoesNotThrow(() ->
                PasswordUtil.validatePasswordConfirmation(
                        "Password@123",
                        "Password@123"));

    }

    @Test
    @DisplayName("Should reject null confirmation")
    void shouldRejectNullConfirmation() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePasswordConfirmation(
                        "Password@123",
                        null));

        assertEquals(
                "Password confirmation is required.",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should reject different passwords")
    void shouldRejectDifferentPasswords() {

        PasswordException exception = assertThrows(
                PasswordException.class,
                () -> PasswordUtil.validatePasswordConfirmation(
                        "Password@123",
                        "Password@321"));

        assertEquals(
                "Passwords do not match.",
                exception.getMessage());

    }

    /*
     * -------------------------------------------------------------------------
     * containsUppercase()
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should detect uppercase letters")
    void shouldDetectUppercaseLetters() {

        assertTrue(
                PasswordUtil.containsUppercase("Password"));

        assertFalse(
                PasswordUtil.containsUppercase("password"));

    }

    /*
     * -------------------------------------------------------------------------
     * containsLowercase()
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should detect lowercase letters")
    void shouldDetectLowercaseLetters() {

        assertTrue(
                PasswordUtil.containsLowercase("PASSWORDa"));

        assertFalse(
                PasswordUtil.containsLowercase("PASSWORD"));

    }

    /*
     * -------------------------------------------------------------------------
     * containsDigit()
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should detect numeric digits")
    void shouldDetectNumericDigits() {

        assertTrue(
                PasswordUtil.containsDigit("Password1"));

        assertFalse(
                PasswordUtil.containsDigit("Password"));

    }

    /*
     * -------------------------------------------------------------------------
     * containsSpecialCharacter()
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should detect special characters")
    void shouldDetectSpecialCharacters() {

        assertTrue(
                PasswordUtil.containsSpecialCharacter("Password@"));

        assertFalse(
                PasswordUtil.containsSpecialCharacter("Password123"));

    }

    /*
     * -------------------------------------------------------------------------
     * Boundary Tests
     * -------------------------------------------------------------------------
     */

    @Test
    @DisplayName("Should accept password exactly at minimum length")
    void shouldAcceptPasswordAtMinimumLength() {

        String password = "Aa1@aaaa";

        if (password.length() == PasswordConstants.MIN_PASSWORD_LENGTH) {

            assertDoesNotThrow(() ->
                    PasswordUtil.validatePassword(password));

        }

    }

    @Test
    @DisplayName("Should accept password exactly at maximum length")
    void shouldAcceptPasswordAtMaximumLength() {

        StringBuilder builder = new StringBuilder();

        builder.append("Aa1@");

        while (builder.length() < PasswordConstants.MAX_PASSWORD_LENGTH) {

            builder.append("a");

        }

        String password = builder.toString();

        assertEquals(
                PasswordConstants.MAX_PASSWORD_LENGTH,
                password.length());

        assertDoesNotThrow(() ->
                PasswordUtil.validatePassword(password));

    }

}