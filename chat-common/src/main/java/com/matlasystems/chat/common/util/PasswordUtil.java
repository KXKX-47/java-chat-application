package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.PasswordConstants;
import com.matlasystems.chat.common.exceptions.PasswordException;

public final class PasswordUtil {

    private PasswordUtil() {
    }

    /**
     * Validate password according to application policy.
     */
    public static void validatePassword(String password) {

        if (password == null) {

            throw new PasswordException(
                    "Password cannot be null.");
        }

        if (password.length()
                < PasswordConstants.MIN_PASSWORD_LENGTH) {

            throw new PasswordException(
                    "Password must contain at least "
                            + PasswordConstants.MIN_PASSWORD_LENGTH
                            + " characters.");
        }

        if (password.length()
                > PasswordConstants.MAX_PASSWORD_LENGTH) {

            throw new PasswordException(
                    "Password may not exceed "
                            + PasswordConstants.MAX_PASSWORD_LENGTH
                            + " characters.");
        }

        if (!containsUppercase(password)) {

            throw new PasswordException(
                    "Password must contain an uppercase letter.");
        }

        if (!containsLowercase(password)) {

            throw new PasswordException(
                    "Password must contain a lowercase letter.");
        }

        if (!containsDigit(password)) {

            throw new PasswordException(
                    "Password must contain a digit.");
        }

        if (!containsSpecialCharacter(password)) {

            throw new PasswordException(
                    "Password must contain a special character.");
        }

    }

    /**
     * Verify password confirmation.
     */
    public static void validatePasswordConfirmation(
            String password,
            String confirmPassword) {

        if (password == null || confirmPassword == null) {

            throw new PasswordException(
                    "Password confirmation is required.");
        }

        if (!password.equals(confirmPassword)) {

            throw new PasswordException(
                    "Passwords do not match.");
        }

    }

    /**
     * Check uppercase.
     */
    public static boolean containsUppercase(String password) {

        return password.chars()
                .anyMatch(Character::isUpperCase);
    }

    /**
     * Check lowercase.
     */
    public static boolean containsLowercase(String password) {

        return password.chars()
                .anyMatch(Character::isLowerCase);
    }

    /**
     * Check numeric.
     */
    public static boolean containsDigit(String password) {

        return password.chars()
                .anyMatch(Character::isDigit);
    }

    /**
     * Check special character.
     */
    public static boolean containsSpecialCharacter(String password) {

        return password.chars()
                .anyMatch(ch -> PasswordConstants.SPECIAL_CHARACTERS
                        .indexOf(ch) >= 0);

    }

}