package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.dto.user.ChangePasswordRequest;
import com.matlasystems.chat.common.dto.user.UpdateUserRequest;
import com.matlasystems.chat.common.dto.user.UserRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class UserValidatorTest {

    private final UserValidator validator =
            new UserValidator();

    private UserRequest validUserRequest() {

        return new UserRequest(
                "johndoe",
                "John",
                "Doe",
                "john.doe@example.com",
                "Sup3rSecret!",
                "Sup3rSecret!");

    }

    /*
     * ============================================================
     * validate(UserRequest)
     * ============================================================
     */

    @Test
    @DisplayName("Should accept a valid user registration request")
    void shouldAcceptValidUserRequest() {

        assertDoesNotThrow(() ->
                validator.validate(validUserRequest()));

    }

    @Test
    @DisplayName("Should reject a null user request")
    void shouldRejectNullUserRequest() {

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate((UserRequest) null));

    }

    @Test
    @DisplayName("Should reject a blank username")
    void shouldRejectBlankUsername() {

        UserRequest request = validUserRequest();
        request.setUsername("   ");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject a blank first name")
    void shouldRejectBlankFirstName() {

        UserRequest request = validUserRequest();
        request.setFirstName("   ");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject a blank last name")
    void shouldRejectBlankLastName() {

        UserRequest request = validUserRequest();
        request.setLastName("   ");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject an invalid email")
    void shouldRejectInvalidEmail() {

        UserRequest request = validUserRequest();
        request.setEmail("not-an-email");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject mismatched password confirmation")
    void shouldRejectMismatchedPasswordConfirmation() {

        UserRequest request = validUserRequest();
        request.setConfirmPassword("SomethingElse1!");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    /*
     * ============================================================
     * validate(UpdateUserRequest)
     * ============================================================
     */

    @Test
    @DisplayName("Should accept a valid update user request")
    void shouldAcceptValidUpdateUserRequest() {

        UpdateUserRequest request =
                new UpdateUserRequest(
                        "John",
                        "Doe",
                        "john.doe@example.com");

        assertDoesNotThrow(() ->
                validator.validate(request));

    }

    @Test
    @DisplayName("Should reject a null update user request")
    void shouldRejectNullUpdateUserRequest() {

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate((UpdateUserRequest) null));

    }

    @Test
    @DisplayName("Should reject an update user request with a blank first name")
    void shouldRejectUpdateUserRequestWithBlankFirstName() {

        UpdateUserRequest request =
                new UpdateUserRequest(
                        "   ",
                        "Doe",
                        "john.doe@example.com");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject an update user request with an invalid email")
    void shouldRejectUpdateUserRequestWithInvalidEmail() {

        UpdateUserRequest request =
                new UpdateUserRequest(
                        "John",
                        "Doe",
                        "not-an-email");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    /*
     * ============================================================
     * validate(ChangePasswordRequest)
     * ============================================================
     */

    @Test
    @DisplayName("Should accept a valid password change request")
    void shouldAcceptValidChangePasswordRequest() {

        ChangePasswordRequest request =
                new ChangePasswordRequest(
                        "OldPassword1!",
                        "NewPassword1!",
                        "NewPassword1!");

        assertDoesNotThrow(() ->
                validator.validate(request));

    }

    @Test
    @DisplayName("Should reject a null password change request")
    void shouldRejectNullChangePasswordRequest() {

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate((ChangePasswordRequest) null));

    }

    @Test
    @DisplayName("Should reject a password change request where the new password matches the current password")
    void shouldRejectChangePasswordRequestWithSamePassword() {

        ChangePasswordRequest request =
                new ChangePasswordRequest(
                        "SamePassword1!",
                        "SamePassword1!",
                        "SamePassword1!");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject a password change request with mismatched confirmation")
    void shouldRejectChangePasswordRequestWithMismatchedConfirmation() {

        ChangePasswordRequest request =
                new ChangePasswordRequest(
                        "OldPassword1!",
                        "NewPassword1!",
                        "DifferentPassword1!");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

}
