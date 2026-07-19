package com.matlasystems.chat.common.util;

import java.util.regex.Pattern;

import com.matlasystems.chat.common.constants.RegexConstants;
import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.exceptions.ValidationException;

public final class ValidationUtil {

    private ValidationUtil() {
    }

    /*
     * ============================================================
     * Generic Validation
     * ============================================================
     */

    public static void requireNotBlank(String value,
                                       String fieldName) {

        if (StringUtil.isNullOrBlank(value)) {

            throw new ValidationException(
                    fieldName + " is required.");

        }

    }

    public static void requirePositive(Long value,
                                       String fieldName) {

        if (value == null || value <= 0) {

            throw new ValidationException(
                    fieldName + " must be greater than zero.");

        }

    }

    public static void requirePositive(Integer value,
                                       String fieldName) {

        if (value == null || value <= 0) {

            throw new ValidationException(
                    fieldName + " must be greater than zero.");

        }

    }

    /*
     * ============================================================
     * Email
     * ============================================================
     */

    public static void validateEmail(String email) {

        requireNotBlank(email, "Email");

        if (email.length()
                > ValidationConstants.MAX_EMAIL_LENGTH) {

            throw new ValidationException(
                    "Email may not exceed "
                            + ValidationConstants.MAX_EMAIL_LENGTH
                            + " characters.");

        }

        if (!Pattern.matches(
                RegexConstants.EMAIL,
                email)) {

            throw new ValidationException(
                    "Invalid email address.");

        }

    }

    /*
     * ============================================================
     * Username
     * ============================================================
     */

    public static void validateUsername(String username) {

        requireNotBlank(username, "Username");

        if (username.length()
                < ValidationConstants.MIN_USERNAME_LENGTH) {

            throw new ValidationException(
                    "Username must contain at least "
                            + ValidationConstants.MIN_USERNAME_LENGTH
                            + " characters.");

        }

        if (username.length()
                > ValidationConstants.MAX_USERNAME_LENGTH) {

            throw new ValidationException(
                    "Username may not exceed "
                            + ValidationConstants.MAX_USERNAME_LENGTH
                            + " characters.");

        }

        if (!Pattern.matches(
                RegexConstants.USERNAME,
                username)) {

            throw new ValidationException(
                    "Username contains invalid characters.");

        }

    }

    /*
     * ============================================================
     * Name Validation
     * ============================================================
     */

    public static void validateFirstName(String firstName) {

        validateName(firstName,
                "First name");

    }

    public static void validateLastName(String lastName) {

        validateName(lastName,
                "Last name");

    }

    public static void validateName(String name,
                                    String fieldName) {

        requireNotBlank(name, fieldName);

        if (name.length()
                < ValidationConstants.MIN_NAME_LENGTH) {

            throw new ValidationException(
                    fieldName
                            + " must contain at least "
                            + ValidationConstants.MIN_NAME_LENGTH
                            + " characters.");

        }

        if (name.length()
                > ValidationConstants.MAX_NAME_LENGTH) {

            throw new ValidationException(
                    fieldName
                            + " may not exceed "
                            + ValidationConstants.MAX_NAME_LENGTH
                            + " characters.");

        }

    }

    /*
     * ============================================================
     * Phone Number
     * ============================================================
     */

    public static void validatePhoneNumber(String phoneNumber) {

        requireNotBlank(phoneNumber,
                "Phone number");

        if (!Pattern.matches(
                RegexConstants.PHONE,
                phoneNumber)) {

            throw new ValidationException(
                    "Invalid phone number.");

        }

    }

    /*
     * ============================================================
     * Message
     * ============================================================
     */

    public static void validateMessage(String message) {

        requireNotBlank(message,
                "Message");

        if (message.length()
                > ValidationConstants.MAX_MESSAGE_LENGTH) {

            throw new ValidationException(
                    "Message may not exceed "
                            + ValidationConstants.MAX_MESSAGE_LENGTH
                            + " characters.");

        }

    }

    /*
     * ============================================================
     * Group
     * ============================================================
     */

    public static void validateGroupName(String groupName) {

        requireNotBlank(groupName,
                "Group name");

        if (groupName.length()
                > ValidationConstants.MAX_GROUP_NAME_LENGTH) {

            throw new ValidationException(
                    "Group name may not exceed "
                            + ValidationConstants.MAX_GROUP_NAME_LENGTH
                            + " characters.");

        }

    }

    public static void validateGroupDescription(
            String description) {

        if (description == null) {

            return;

        }

        if (description.length()
                > ValidationConstants.MAX_GROUP_DESCRIPTION_LENGTH) {

            throw new ValidationException(
                    "Group description may not exceed "
                            + ValidationConstants.MAX_GROUP_DESCRIPTION_LENGTH
                            + " characters.");

        }

    }

    /*
     * ============================================================
     * IDs
     * ============================================================
     */

    public static void validateUserId(Long userId) {

        requirePositive(userId,
                "User ID");

    }

    public static void validateConversationId(
            Long conversationId) {

        requirePositive(conversationId,
                "Conversation ID");

    }

    public static void validateMessageId(Long messageId) {

        requirePositive(messageId,
                "Message ID");

    }

    public static void validateGroupId(Long groupId) {

        requirePositive(groupId,
                "Group ID");

    }

    public static void validateAttachmentId(Long attachmentId) {

        requirePositive(attachmentId,
                "Attachment ID");

    }

    /*
     * ============================================================
     * Composite Validation
     * ============================================================
     */

    public static void validateRegistration(
            String username,
            String firstName,
            String lastName,
            String email,
            String password,
            String confirmPassword) {

        validateUsername(username);

        validateFirstName(firstName);

        validateLastName(lastName);

        validateEmail(email);

        PasswordUtil.validatePassword(password);

        PasswordUtil.validatePasswordConfirmation(
                password,
                confirmPassword);

    }

    public static void validateUserProfile(
            String firstName,
            String lastName,
            String email) {

        validateFirstName(firstName);

        validateLastName(lastName);

        validateEmail(email);

    }

}