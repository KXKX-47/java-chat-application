package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.dto.group.CreateGroupRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class GroupValidatorTest {

    private final GroupValidator validator =
            new GroupValidator();

    @Test
    @DisplayName("Should accept a valid group")
    void shouldAcceptValidGroup() {

        CreateGroupRequest request =
                new CreateGroupRequest();

        request.setName("Developers");

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
    @DisplayName("Should reject blank group name")
    void shouldRejectBlankGroupName() {

        CreateGroupRequest request =
                new CreateGroupRequest();

        request.setName("   ");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject null group name")
    void shouldRejectNullGroupName() {

        CreateGroupRequest request =
                new CreateGroupRequest();

        request.setName(null);

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject group name exceeding maximum length")
    void shouldRejectLongGroupName() {

        CreateGroupRequest request =
                new CreateGroupRequest();

        request.setName(
                "A".repeat(
                        ValidationConstants.MAX_GROUP_NAME_LENGTH + 1));

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

}