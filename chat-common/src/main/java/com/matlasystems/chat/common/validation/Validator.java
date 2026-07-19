package com.matlasystems.chat.common.validation;

/**
 * Generic validation contract for all validators in the chat platform.
 *
 * <p>
 * Implementations should validate business rules for a specific object type.
 * If validation fails, a ValidationException should be thrown.
 *
 * @param <T> the type to validate
 */
public interface Validator<T> {

    /**
     * Validates the supplied object.
     *
     * @param object object to validate
     * @throws com.matlasystems.chat.common.exceptions.ValidationException
     *         if validation fails
     */
    void validate(T object);

    /**
     * Determines whether the supplied object is valid.
     *
     * This method delegates to {@link #validate(Object)} and converts any
     * validation exception into a boolean result.
     *
     * @param object object to validate
     * @return true if valid, otherwise false
     */
    default boolean isValid(T object) {

        try {

            validate(object);
            return true;

        } catch (RuntimeException ex) {

            return false;

        }

    }

    /**
     * Validates a single field.
     *
     * Implementations that do not support field-level validation
     * can simply inherit this default implementation.
     *
     * @param fieldName field name
     * @param value field value
     */
    default void validateField(String fieldName,
                               Object value) {

        // Optional implementation

    }

}