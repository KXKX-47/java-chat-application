package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.exceptions.ValidationException;
import com.matlasystems.chat.common.util.StringUtil;

/**
 * Password validation utilities.
 */
public final class PasswordValidator {

    private PasswordValidator() {
    }

    /**
     * Validates a password.
     */
    public static void validate(String password) {

        if (StringUtil.isNullOrBlank(password)) {

            throw new ValidationException(
                    "Password is required.");

        }

        if (password.length()
                < ValidationConstants.MIN_PASSWORD_LENGTH) {

            throw new ValidationException(
                    "Password must contain at least "
                            + ValidationConstants.MIN_PASSWORD_LENGTH
                            + " characters.");

        }

        if (password.length()
                > ValidationConstants.MAX_PASSWORD_LENGTH) {

            throw new ValidationException(
                    "Password may not exceed "
                            + ValidationConstants.MAX_PASSWORD_LENGTH
                            + " characters.");

        }

    }

    /**
     * Validates password confirmation.
     */
    public static void validateConfirmation(
            String password,
            String confirmPassword) {

        validate(password);

        if (StringUtil.isNullOrBlank(confirmPassword)) {

            throw new ValidationException(
                    "Confirmation password is required.");

        }

        if (!password.equals(confirmPassword)) {

            throw new ValidationException(
                    "Passwords do not match.");

        }

    }

    /**
     * Validates password change.
     */
    public static void validatePasswordChange(
            String currentPassword,
            String newPassword) {

        validate(currentPassword);

        validate(newPassword);

        if (currentPassword.equals(newPassword)) {

            throw new ValidationException(
                    "New password must be different from the current password.");

        }

    }

}