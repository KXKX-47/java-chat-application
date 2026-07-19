package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.dto.user.ChangePasswordRequest;
import com.matlasystems.chat.common.dto.user.UpdateUserRequest;
import com.matlasystems.chat.common.dto.user.UserRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import com.matlasystems.chat.common.util.ValidationUtil;

/**
 * Validates user-related requests.
 *
 * This validator coordinates validation by delegating
 * to ValidationUtil and PasswordValidator.
 */
public class UserValidator implements Validator<UserRequest> {

    /**
     * Validates a user registration request.
     */
    @Override
    public void validate(UserRequest request) {

        if (request == null) {

            throw new ValidationException(
                    "User request cannot be null.");

        }

        ValidationUtil.validateUsername(
                request.getUsername());

        ValidationUtil.validateFirstName(
                request.getFirstName());

        ValidationUtil.validateLastName(
                request.getLastName());

        ValidationUtil.validateEmail(
                request.getEmail());

        PasswordValidator.validateConfirmation(
                request.getPassword(),
                request.getConfirmPassword());

    }

    /**
     * Validates a user profile update request.
     */
    public void validate(UpdateUserRequest request) {

        if (request == null) {

            throw new ValidationException(
                    "Update user request cannot be null.");

        }

        ValidationUtil.validateFirstName(
                request.getFirstName());

        ValidationUtil.validateLastName(
                request.getLastName());

        ValidationUtil.validateEmail(
                request.getEmail());

    }

    /**
     * Validates a password change request.
     */
    public void validate(ChangePasswordRequest request) {

        if (request == null) {

            throw new ValidationException(
                    "Password change request cannot be null.");

        }

        PasswordValidator.validatePasswordChange(
                request.getCurrentPassword(),
                request.getNewPassword());

        PasswordValidator.validateConfirmation(
                request.getNewPassword(),
                request.getConfirmPassword());

    }

}