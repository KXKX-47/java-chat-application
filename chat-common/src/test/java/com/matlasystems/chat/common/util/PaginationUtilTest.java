package com.matlasystems.chat.common.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.matlasystems.chat.common.constants.PaginationConstants;
import com.matlasystems.chat.common.exceptions.PaginationException;

class PaginationUtilTest {

    @Test
    @DisplayName("Should validate default page")
    void shouldValidateDefaultPage() {

        assertDoesNotThrow(() ->
                PaginationUtil.validatePage(
                        PaginationConstants.DEFAULT_PAGE));

    }

    @Test
    @DisplayName("Should reject negative page")
    void shouldRejectNegativePage() {

        assertThrows(
                PaginationException.class,
                () -> PaginationUtil.validatePage(-1));

    }

    @Test
    @DisplayName("Should reject page above maximum")
    void shouldRejectPageAboveMaximum() {

        assertThrows(
                PaginationException.class,
                () -> PaginationUtil.validatePage(
                        PaginationConstants.MAX_PAGE_NUMBER + 1));

    }

    @Test
    @DisplayName("Should validate minimum page size")
    void shouldValidateMinimumPageSize() {

        assertDoesNotThrow(() ->
                PaginationUtil.validatePageSize(
                        PaginationConstants.MIN_PAGE_SIZE));

    }

    @Test
    @DisplayName("Should validate maximum page size")
    void shouldValidateMaximumPageSize() {

        assertDoesNotThrow(() ->
                PaginationUtil.validatePageSize(
                        PaginationConstants.MAX_PAGE_SIZE));

    }

    @Test
    @DisplayName("Should reject page size below minimum")
    void shouldRejectPageSizeBelowMinimum() {

        assertThrows(
                PaginationException.class,
                () -> PaginationUtil.validatePageSize(
                        PaginationConstants.MIN_PAGE_SIZE - 1));

    }

    @Test
    @DisplayName("Should reject page size above maximum")
    void shouldRejectPageSizeAboveMaximum() {

        assertThrows(
                PaginationException.class,
                () -> PaginationUtil.validatePageSize(
                        PaginationConstants.MAX_PAGE_SIZE + 1));

    }

    @Test
    @DisplayName("Should validate page and size together")
    void shouldValidatePagination() {

        assertDoesNotThrow(() ->
                PaginationUtil.validate(
                        PaginationConstants.DEFAULT_PAGE,
                        PaginationConstants.DEFAULT_SIZE));

    }

    @Test
    @DisplayName("Should calculate SQL offset")
    void shouldCalculateOffset() {

        assertEquals(
                20,
                PaginationUtil.calculateOffset(2, 10));

    }

    @Test
    @DisplayName("Should calculate zero offset")
    void shouldCalculateZeroOffset() {

        assertEquals(
                0,
                PaginationUtil.calculateOffset(0, 10));

    }

    @Test
    @DisplayName("Should calculate total pages exactly")
    void shouldCalculateExactPages() {

        assertEquals(
                10,
                PaginationUtil.calculateTotalPages(100, 10));

    }

    @Test
    @DisplayName("Should round up total pages")
    void shouldRoundUpPages() {

        assertEquals(
                11,
                PaginationUtil.calculateTotalPages(101, 10));

    }

    @Test
    @DisplayName("Should return zero pages when there are no records")
    void shouldReturnZeroPages() {

        assertEquals(
                0,
                PaginationUtil.calculateTotalPages(0, 10));

    }

    @Test
    @DisplayName("Should detect next page")
    void shouldDetectNextPage() {

        assertTrue(
                PaginationUtil.hasNextPage(2, 5));

    }

    @Test
    @DisplayName("Should detect last page")
    void shouldDetectLastPage() {

        assertFalse(
                PaginationUtil.hasNextPage(4, 5));

    }

    @Test
    @DisplayName("Should detect previous page")
    void shouldDetectPreviousPage() {

        assertTrue(
                PaginationUtil.hasPreviousPage(1));

    }

    @Test
    @DisplayName("Should reject previous page on first page")
    void shouldRejectPreviousPage() {

        assertFalse(
                PaginationUtil.hasPreviousPage(0));

    }

    @Test
    @DisplayName("Should return default page when null")
    void shouldReturnDefaultPageForNull() {

        assertEquals(
                PaginationConstants.DEFAULT_PAGE,
                PaginationUtil.defaultPage(null));

    }

    @Test
    @DisplayName("Should return default page when negative")
    void shouldReturnDefaultPageForNegative() {

        assertEquals(
                PaginationConstants.DEFAULT_PAGE,
                PaginationUtil.defaultPage(-5));

    }

    @Test
    @DisplayName("Should return supplied page")
    void shouldReturnSuppliedPage() {

        assertEquals(
                5,
                PaginationUtil.defaultPage(5));

    }

    @Test
    @DisplayName("Should return default page size when null")
    void shouldReturnDefaultPageSizeForNull() {

        assertEquals(
                PaginationConstants.DEFAULT_SIZE,
                PaginationUtil.defaultPageSize(null));

    }

    @Test
    @DisplayName("Should return default page size when below minimum")
    void shouldReturnDefaultPageSizeBelowMinimum() {

        assertEquals(
                PaginationConstants.DEFAULT_SIZE,
                PaginationUtil.defaultPageSize(
                        PaginationConstants.MIN_PAGE_SIZE - 1));

    }

    @Test
    @DisplayName("Should return maximum page size when above maximum")
    void shouldReturnMaximumPageSize() {

        assertEquals(
                PaginationConstants.MAX_PAGE_SIZE,
                PaginationUtil.defaultPageSize(
                        PaginationConstants.MAX_PAGE_SIZE + 100));

    }

    @Test
    @DisplayName("Should return supplied page size")
    void shouldReturnSuppliedPageSize() {

        assertEquals(
                25,
                PaginationUtil.defaultPageSize(25));

    }

}