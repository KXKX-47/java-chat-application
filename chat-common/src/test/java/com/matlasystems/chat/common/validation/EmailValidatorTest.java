package com.matlasystems.chat.common.validation;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.exceptions.ValidationException;

class EmailValidatorTest {

    @Test
    @DisplayName("Should accept a valid email address")
    void shouldAcceptValidEmail() {

        assertDoesNotThrow(() ->
                EmailValidator.validate("john.doe@example.com"));

    }

    @Test
    @DisplayName("Should reject a null email")
    void shouldRejectNullEmail() {

        assertThrowsExactly(
                ValidationException.class,
                () -> EmailValidator.validate(null));

    }

    @Test
    @DisplayName("Should reject an empty email")
    void shouldRejectEmptyEmail() {

        assertThrowsExactly(
                ValidationException.class,
                () -> EmailValidator.validate(""));

    }

    @Test
    @DisplayName("Should reject a blank email")
    void shouldRejectBlankEmail() {

        assertThrowsExactly(
                ValidationException.class,
                () -> EmailValidator.validate("     "));

    }

    @Test
    @DisplayName("Should reject an invalid email")
    void shouldRejectInvalidEmail() {

        assertThrowsExactly(
                ValidationException.class,
                () -> EmailValidator.validate("john.gmail.com"));

    }

    @Test
    @DisplayName("Should reject email without domain")
    void shouldRejectEmailWithoutDomain() {

        assertThrowsExactly(
                ValidationException.class,
                () -> EmailValidator.validate("john@"));

    }

}


