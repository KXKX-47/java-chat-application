package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.PaginationConstants;
import com.matlasystems.chat.common.dto.common.PaginationRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;

/**
 * Validates pagination requests.
 *
 * <p>
 * Ensures that:
 * <ul>
 *     <li>Request is not null</li>
 *     <li>Page number is valid</li>
 *     <li>Page size is within supported limits</li>
 * </ul>
 */
public class PaginationValidator
        implements Validator<PaginationRequest> {

    @Override
    public void validate(PaginationRequest request) {

        if (request == null) {
            throw new ValidationException(
                    "Pagination request cannot be null.");
        }

        validatePage(request.getPage());
        validateSize(request.getSize());
    }

    /**
     * Validates the requested page number.
     *
     * @param page page number
     */
    public static void validatePage(int page) {

        if (page < PaginationConstants.DEFAULT_PAGE) {

            throw new ValidationException(
                    "Page number cannot be negative.");
        }

    }

    /**
     * Validates the requested page size.
     *
     * @param size page size
     */
    public static void validateSize(int size) {

        if (size < PaginationConstants.MIN_PAGE_SIZE) {

            throw new ValidationException(
                    "Page size must be at least "
                            + PaginationConstants.MIN_PAGE_SIZE + ".");

        }

        if (size > PaginationConstants.MAX_PAGE_SIZE) {

            throw new ValidationException(
                    "Page size cannot exceed "
                            + PaginationConstants.MAX_PAGE_SIZE + ".");

        }

    }

}