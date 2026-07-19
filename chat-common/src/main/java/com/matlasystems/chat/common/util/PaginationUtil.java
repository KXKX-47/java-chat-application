package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.PaginationConstants;
import com.matlasystems.chat.common.exceptions.PaginationException;

public final class PaginationUtil {

    private PaginationUtil() {
    }

    /**
     * Validate page number.
     */
    public static void validatePage(int page) {

        if (page < PaginationConstants.DEFAULT_PAGE) {

            throw new PaginationException(
                    "Page number cannot be negative.");
        }

        if (page > PaginationConstants.MAX_PAGE_NUMBER) {

            throw new PaginationException(
                    "Page number exceeds maximum allowed value.");
        }

    }

    /**
     * Validate page size.
     */
    public static void validatePageSize(int size) {

        if (size < PaginationConstants.MIN_PAGE_SIZE) {

            throw new PaginationException(
                    "Page size must be at least "
                    + PaginationConstants.MIN_PAGE_SIZE + ".");
        }

        if (size > PaginationConstants.MAX_PAGE_SIZE) {

            throw new PaginationException(
                    "Page size cannot exceed "
                    + PaginationConstants.MAX_PAGE_SIZE + ".");
        }

    }

    /**
     * Validate both page and size.
     */
    public static void validate(int page,
                                int size) {

        validatePage(page);

        validatePageSize(size);

    }

    /**
     * Calculate SQL offset.
     */
    public static int calculateOffset(int page,
                                      int size) {

        validate(page, size);

        return page * size;

    }

    /**
     * Calculate total pages.
     */
    public static int calculateTotalPages(long totalElements,
                                          int pageSize) {

        validatePageSize(pageSize);

        if (totalElements == 0) {

            return 0;

        }

        return (int) Math.ceil(
                (double) totalElements / pageSize);

    }

    /**
     * Is there another page?
     */
    public static boolean hasNextPage(int currentPage,
                                      int totalPages) {

        return currentPage < totalPages - 1;

    }

    /**
     * Is there a previous page?
     */
    public static boolean hasPreviousPage(int currentPage) {

        return currentPage > PaginationConstants.DEFAULT_PAGE;

    }

    /**
     * Return default page if invalid.
     */
    public static int defaultPage(Integer page) {

        if (page == null || page < 0) {

            return PaginationConstants.DEFAULT_PAGE;

        }

        return page;

    }

    /**
     * Return default page size if invalid.
     */
    public static int defaultPageSize(Integer size) {

        if (size == null) {

            return PaginationConstants.DEFAULT_SIZE;

        }

        if (size < PaginationConstants.MIN_PAGE_SIZE) {

            return PaginationConstants.DEFAULT_SIZE;

        }

        if (size > PaginationConstants.MAX_PAGE_SIZE) {

            return PaginationConstants.MAX_PAGE_SIZE;

        }

        return size;

    }

}