package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.PaginationConstants;
import com.matlasystems.chat.common.dto.common.PaginationRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class PaginationValidatorTest {

    private final PaginationValidator validator =
            new PaginationValidator();

    @Test
    @DisplayName("Should accept a valid pagination request")
    void shouldAcceptValidPaginationRequest() {

        PaginationRequest request =
                new PaginationRequest(
                        0,
                        20,
                        "id",
                        "ASC");

        assertDoesNotThrow(() ->
                validator.validate(request));

    }

    @Test
    @DisplayName("Should reject null request")
    void shouldRejectNullRequest() {

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(null));

    }

    @Test
    @DisplayName("Should reject negative page number")
    void shouldRejectNegativePage() {

        PaginationRequest request =
                new PaginationRequest(
                        -1,
                        20,
                        "id",
                        "ASC");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should accept the default page number")
    void shouldAcceptDefaultPage() {

        assertDoesNotThrow(() ->
                PaginationValidator.validatePage(
                        PaginationConstants.DEFAULT_PAGE));

    }

    @Test
    @DisplayName("Should reject page size below the minimum")
    void shouldRejectPageSizeBelowMinimum() {

        PaginationRequest request =
                new PaginationRequest(
                        0,
                        PaginationConstants.MIN_PAGE_SIZE - 1,
                        "id",
                        "ASC");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should accept page size at the minimum")
    void shouldAcceptPageSizeAtMinimum() {

        assertDoesNotThrow(() ->
                PaginationValidator.validateSize(
                        PaginationConstants.MIN_PAGE_SIZE));

    }

    @Test
    @DisplayName("Should reject page size above the maximum")
    void shouldRejectPageSizeAboveMaximum() {

        PaginationRequest request =
                new PaginationRequest(
                        0,
                        PaginationConstants.MAX_PAGE_SIZE + 1,
                        "id",
                        "ASC");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should accept page size at the maximum")
    void shouldAcceptPageSizeAtMaximum() {

        assertDoesNotThrow(() ->
                PaginationValidator.validateSize(
                        PaginationConstants.MAX_PAGE_SIZE));

    }

}
