package com.matlasystems.chat.common.validation;

import com.matlasystems.chat.common.constants.ValidationConstants;
import com.matlasystems.chat.common.dto.chat.SendMessageRequest;
import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class MessageValidatorTest {

    private final MessageValidator validator =
            new MessageValidator();

    private SendMessageRequest validRequest() {

        SendMessageRequest request =
                new SendMessageRequest();

        request.setSenderId(1L);
        request.setReceiverId(2L);
        request.setConversationId(1L);
        request.setMessage("Hello there!");
        request.setMessageType("TEXT");

        return request;

    }

    @Test
    @DisplayName("Should accept a valid message request")
    void shouldAcceptValidMessageRequest() {

        assertDoesNotThrow(() ->
                validator.validate(validRequest()));

    }

    @Test
    @DisplayName("Should reject null request")
    void shouldRejectNullRequest() {

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(null));

    }

    @Test
    @DisplayName("Should reject null sender ID")
    void shouldRejectNullSenderId() {

        SendMessageRequest request = validRequest();
        request.setSenderId(null);

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject sender ID that is not positive")
    void shouldRejectNonPositiveSenderId() {

        SendMessageRequest request = validRequest();
        request.setSenderId(0L);

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject null receiver ID")
    void shouldRejectNullReceiverId() {

        SendMessageRequest request = validRequest();
        request.setReceiverId(null);

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject receiver ID that is not positive")
    void shouldRejectNonPositiveReceiverId() {

        SendMessageRequest request = validRequest();
        request.setReceiverId(-1L);

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject null message body")
    void shouldRejectNullMessage() {

        SendMessageRequest request = validRequest();
        request.setMessage(null);

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject blank message body")
    void shouldRejectBlankMessage() {

        SendMessageRequest request = validRequest();
        request.setMessage("   ");

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should reject message exceeding maximum length")
    void shouldRejectMessageExceedingMaxLength() {

        SendMessageRequest request = validRequest();
        request.setMessage(
                "A".repeat(
                        ValidationConstants.MAX_MESSAGE_LENGTH + 1));

        assertThrowsExactly(
                ValidationException.class,
                () -> validator.validate(request));

    }

    @Test
    @DisplayName("Should accept message at maximum length")
    void shouldAcceptMessageAtMaxLength() {

        SendMessageRequest request = validRequest();
        request.setMessage(
                "A".repeat(
                        ValidationConstants.MAX_MESSAGE_LENGTH));

        assertDoesNotThrow(() ->
                validator.validate(request));

    }

}
