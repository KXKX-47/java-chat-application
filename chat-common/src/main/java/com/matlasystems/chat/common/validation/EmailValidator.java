package com.matlasystems.chat.common.validation;

import java.util.regex.Pattern;

import com.matlasystems.chat.common.constants.RegexConstants;
import com.matlasystems.chat.common.exceptions.ValidationException;
import com.matlasystems.chat.common.util.StringUtil;

public final class EmailValidator {

    /**
     * Compiled once and reused for better performance.
     */
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile(RegexConstants.EMAIL);

    /**
     * Prevent instantiation.
     */
    private EmailValidator() {

    }

    /**
     * Validates an email address.
     *
     * @param email Email address to validate
     * @throws ValidationException if the email is invalid
     */
    public static void validate(String email) {

        if (StringUtil.isNullOrBlank(email)) {
            throw new ValidationException(
                    "Email address is required.");
        }

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new ValidationException(
                    "Invalid email address.");
        }

    }

    /**
     * Returns true if the email is valid.
     * Does not throw an exception.
     *
     * @param email Email address
     * @return true if valid
     */
    public static boolean isValid(String email) {

        if (StringUtil.isNullOrBlank(email)) {
            return false;
        }

        return EMAIL_PATTERN.matcher(email).matches();

    }

}