package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.dto.group.CreateGroupRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import com.matlasystems.chat.common.util.StringUtil;

public class GroupValidator implements Validator<CreateGroupRequest> {

    @Override
    public void validate(CreateGroupRequest request) {

        if (request == null) {
            throw new ValidationException(
                    "Group request cannot be null.");
        }

        validateGroupName(request.getName());

        validateDescription(request.getDescription());

    }

    /**
     * Validates the group name.
     */
    private void validateGroupName(String groupName) {

        if (StringUtil.isNullOrBlank(groupName)) {
            throw new ValidationException(
                    "Group name is required.");
        }

        if (groupName.length() >
                ValidationConstants.MAX_GROUP_NAME_LENGTH) {

            throw new ValidationException(
                    "Group name cannot exceed "
                            + ValidationConstants.MAX_GROUP_NAME_LENGTH
                            + " characters.");
        }

    }

    /**
     * Validates the group description.
     */
    private void validateDescription(String description) {

        if (description == null) {
            return;
        }

        if (description.length() >
                ValidationConstants.MAX_GROUP_DESCRIPTION_LENGTH) {

            throw new ValidationException(
                    "Group description cannot exceed "
                            + ValidationConstants.MAX_GROUP_DESCRIPTION_LENGTH
                            + " characters.");
        }

    }

}