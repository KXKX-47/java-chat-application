package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilTest {

    /*
     * ============================================================
     * requireNotBlank()
     * ============================================================
     */

    @Test
    @DisplayName("Should accept non-blank value")
    void shouldAcceptNonBlankValue() {

        assertDoesNotThrow(() ->
                ValidationUtil.requireNotBlank(
                        "Kutlwano",
                        "Username"));

    }

    @Test
    @DisplayName("Should reject blank value")
    void shouldRejectBlankValue() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.requireNotBlank(
                        "",
                        "Username"));

    }

    @Test
    @DisplayName("Should reject null value")
    void shouldRejectNullValue() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.requireNotBlank(
                        null,
                        "Username"));

    }

    /*
     * ============================================================
     * requirePositive(Long)
     * ============================================================
     */

    @Test
    void shouldAcceptPositiveLong() {

        assertDoesNotThrow(() ->
                ValidationUtil.requirePositive(
                        10L,
                        "User ID"));

    }

    @Test
    void shouldRejectZeroLong() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.requirePositive(
                        0L,
                        "User ID"));

    }

    @Test
    void shouldRejectNegativeLong() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.requirePositive(
                        -5L,
                        "User ID"));

    }

    /*
     * ============================================================
     * requirePositive(Integer)
     * ============================================================
     */

    @Test
    void shouldAcceptPositiveInteger() {

        assertDoesNotThrow(() ->
                ValidationUtil.requirePositive(
                        5,
                        "Page"));

    }

    @Test
    void shouldRejectNegativeInteger() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.requirePositive(
                        -1,
                        "Page"));

    }

    /*
     * ============================================================
     * validateEmail()
     * ============================================================
     */

    @Test
    void shouldAcceptValidEmail() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateEmail(
                        "john@example.com"));

    }

    @Test
    void shouldRejectInvalidEmail() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateEmail(
                        "invalid-email"));

    }

    @Test
    void shouldRejectEmailLongerThanMaximum() {

        String email =
                "a".repeat(ValidationConstants.MAX_EMAIL_LENGTH)
                        + "@gmail.com";

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateEmail(email));

    }

    /*
     * ============================================================
     * validateUsername()
     * ============================================================
     */

    @Test
    void shouldAcceptValidUsername() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateUsername(
                        "john_doe"));

    }

    @Test
    void shouldRejectShortUsername() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateUsername("a"));

    }

    @Test
    void shouldRejectUsernameWithInvalidCharacters() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateUsername(
                        "john@doe"));

    }

    /*
     * ============================================================
     * validateFirstName()
     * ============================================================
     */

    @Test
    void shouldAcceptValidFirstName() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateFirstName(
                        "John"));

    }

    @Test
    void shouldRejectShortFirstName() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateFirstName(
                        "A"));

    }

    /*
     * ============================================================
     * validateLastName()
     * ============================================================
     */

    @Test
    void shouldAcceptValidLastName() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateLastName(
                        "Smith"));

    }

    /*
     * ============================================================
     * validatePhoneNumber()
     * ============================================================
     */

    @Test
    void shouldAcceptValidPhoneNumber() {

        assertDoesNotThrow(() ->
                ValidationUtil.validatePhoneNumber(
                        "+27123456789"));

    }

    @Test
    void shouldRejectInvalidPhoneNumber() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validatePhoneNumber(
                        "ABC123"));

    }

    /*
     * ============================================================
     * validateMessage()
     * ============================================================
     */

    @Test
    void shouldAcceptValidMessage() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateMessage(
                        "Hello World"));

    }

    @Test
    void shouldRejectEmptyMessage() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateMessage(""));

    }

    @Test
    void shouldRejectMessageLongerThanMaximum() {

        String message =
                "A".repeat(
                        ValidationConstants.MAX_MESSAGE_LENGTH + 1);

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateMessage(
                        message));

    }

    /*
     * ============================================================
     * validateGroupName()
     * ============================================================
     */

    @Test
    void shouldAcceptValidGroupName() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateGroupName(
                        "Developers"));

    }

    @Test
    void shouldRejectLongGroupName() {

        String name =
                "A".repeat(
                        ValidationConstants.MAX_GROUP_NAME_LENGTH + 1);

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateGroupName(
                        name));

    }

    /*
     * ============================================================
     * validateGroupDescription()
     * ============================================================
     */

    @Test
    void shouldAcceptNullDescription() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateGroupDescription(
                        null));

    }

    @Test
    void shouldRejectLongDescription() {

        String description =
                "A".repeat(
                        ValidationConstants.MAX_GROUP_DESCRIPTION_LENGTH + 1);

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateGroupDescription(
                        description));

    }

    /*
     * ============================================================
     * ID Validation
     * ============================================================
     */

    @Test
    void shouldAcceptValidUserId() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateUserId(1L));

    }

    @Test
    void shouldRejectInvalidUserId() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateUserId(0L));

    }

    @Test
    void shouldAcceptConversationId() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateConversationId(100L));

    }

    @Test
    void shouldAcceptMessageId() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateMessageId(200L));

    }

    @Test
    void shouldAcceptGroupId() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateGroupId(300L));

    }

    @Test
    void shouldAcceptAttachmentId() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateAttachmentId(400L));

    }

    /*
     * ============================================================
     * Composite Validation
     * ============================================================
     */

    @Test
    void shouldAcceptValidRegistration() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateRegistration(
                        "john_doe",
                        "John",
                        "Smith",
                        "john@example.com",
                        "Password123!",
                        "Password123!"));

    }

    @Test
    void shouldRejectInvalidRegistration() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateRegistration(
                        "",
                        "",
                        "",
                        "invalid",
                        "123",
                        "456"));

    }

    @Test
    void shouldAcceptValidUserProfile() {

        assertDoesNotThrow(() ->
                ValidationUtil.validateUserProfile(
                        "John",
                        "Smith",
                        "john@example.com"));

    }

    @Test
    void shouldRejectInvalidUserProfile() {

        assertThrows(
                ValidationException.class,
                () -> ValidationUtil.validateUserProfile(
                        "",
                        "",
                        "invalid-email"));

    }

}