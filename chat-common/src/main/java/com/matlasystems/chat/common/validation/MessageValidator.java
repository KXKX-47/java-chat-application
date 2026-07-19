package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.dto.chat.SendMessageRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import com.matlasystems.chat.common.util.StringUtil;

public class MessageValidator implements Validator<SendMessageRequest> {

    @Override
    public void validate(SendMessageRequest request) {

        validateRequest(request);

        validateSender(request);

        validateReceiver(request);

        validateMessage(request);

    }

    /**
     * Validates that the request object exists.
     */
    private void validateRequest(SendMessageRequest request) {

        if (request == null) {
            throw new ValidationException(
                    "Message request cannot be null.");
        }

    }

    /**
     * Validates the sender identifier.
     */
    private void validateSender(SendMessageRequest request) {

        if (request.getSenderId() == null) {
            throw new ValidationException(
                    "Sender ID is required.");
        }

        if (request.getSenderId() <= 0) {
            throw new ValidationException(
                    "Sender ID must be greater than zero.");
        }

    }

    /**
     * Validates the receiver identifier.
     */
    private void validateReceiver(SendMessageRequest request) {

        if (request.getReceiverId() == null) {
            throw new ValidationException(
                    "Receiver ID is required.");
        }

        if (request.getReceiverId() <= 0) {
            throw new ValidationException(
                    "Receiver ID must be greater than zero.");
        }

    }

    /**
     * Validates the message body.
     */
    private void validateMessage(SendMessageRequest request) {

        String message = request.getMessage();

        if (StringUtil.isNullOrBlank(message)) {
            throw new ValidationException(
                    "Message cannot be empty.");
        }

        if (message.length() >
                ValidationConstants.MAX_MESSAGE_LENGTH) {

            throw new ValidationException(
                    "Message exceeds the maximum allowed length of "
                            + ValidationConstants.MAX_MESSAGE_LENGTH
                            + " characters.");
        }

    }

}