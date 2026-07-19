package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class PasswordValidatorTest {

    /*
     * ============================================================
     * validate
     * ============================================================
     */

    @Test
    @DisplayName("Should accept a valid password")
    void shouldAcceptValidPassword() {

        assertDoesNotThrow(() ->
                PasswordValidator.validate("Sup3rSecret!"));

    }

    @Test
    @DisplayName("Should reject a null password")
    void shouldRejectNullPassword() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validate(null));

    }

    @Test
    @DisplayName("Should reject a blank password")
    void shouldRejectBlankPassword() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validate("   "));

    }

    @Test
    @DisplayName("Should reject a password that is too short")
    void shouldRejectPasswordTooShort() {

        String password = "A".repeat(
                ValidationConstants.MIN_PASSWORD_LENGTH - 1);

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validate(password));

    }

    @Test
    @DisplayName("Should accept a password at the minimum length")
    void shouldAcceptPasswordAtMinimumLength() {

        String password = "A".repeat(
                ValidationConstants.MIN_PASSWORD_LENGTH);

        assertDoesNotThrow(() ->
                PasswordValidator.validate(password));

    }

    @Test
    @DisplayName("Should reject a password exceeding the maximum length")
    void shouldRejectPasswordExceedingMaximumLength() {

        String password = "A".repeat(
                ValidationConstants.MAX_PASSWORD_LENGTH + 1);

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validate(password));

    }

    @Test
    @DisplayName("Should accept a password at the maximum length")
    void shouldAcceptPasswordAtMaximumLength() {

        String password = "A".repeat(
                ValidationConstants.MAX_PASSWORD_LENGTH);

        assertDoesNotThrow(() ->
                PasswordValidator.validate(password));

    }

    /*
     * ============================================================
     * validateConfirmation
     * ============================================================
     */

    @Test
    @DisplayName("Should accept matching password confirmation")
    void shouldAcceptMatchingConfirmation() {

        assertDoesNotThrow(() ->
                PasswordValidator.validateConfirmation(
                        "Sup3rSecret!",
                        "Sup3rSecret!"));

    }

    @Test
    @DisplayName("Should reject null confirmation password")
    void shouldRejectNullConfirmation() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validateConfirmation(
                        "Sup3rSecret!",
                        null));

    }

    @Test
    @DisplayName("Should reject blank confirmation password")
    void shouldRejectBlankConfirmation() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validateConfirmation(
                        "Sup3rSecret!",
                        "   "));

    }

    @Test
    @DisplayName("Should reject mismatched password confirmation")
    void shouldRejectMismatchedConfirmation() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validateConfirmation(
                        "Sup3rSecret!",
                        "DifferentPass1!"));

    }

    @Test
    @DisplayName("Should reject confirmation when the original password is invalid")
    void shouldRejectConfirmationWhenPasswordInvalid() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validateConfirmation(
                        "short",
                        "short"));

    }

    /*
     * ============================================================
     * validatePasswordChange
     * ============================================================
     */

    @Test
    @DisplayName("Should accept a valid password change")
    void shouldAcceptValidPasswordChange() {

        assertDoesNotThrow(() ->
                PasswordValidator.validatePasswordChange(
                        "OldPassword1!",
                        "NewPassword1!"));

    }

    @Test
    @DisplayName("Should reject password change with invalid current password")
    void shouldRejectPasswordChangeWithInvalidCurrentPassword() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validatePasswordChange(
                        null,
                        "NewPassword1!"));

    }

    @Test
    @DisplayName("Should reject password change with invalid new password")
    void shouldRejectPasswordChangeWithInvalidNewPassword() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validatePasswordChange(
                        "OldPassword1!",
                        "short"));

    }

    @Test
    @DisplayName("Should reject password change when new password matches current password")
    void shouldRejectPasswordChangeWhenPasswordsMatch() {

        assertThrowsExactly(
                ValidationException.class,
                () -> PasswordValidator.validatePasswordChange(
                        "SamePassword1!",
                        "SamePassword1!"));

    }

}
