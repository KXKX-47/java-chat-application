package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.IdConstants;
import com.matlasystems.chat.common.exceptions.IdGenerationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    void shouldGenerateUuid() {

        String uuid = IdGenerator.uuid();

        assertNotNull(uuid);

        assertEquals(
                36,
                uuid.length());

    }

    @Test
    void shouldGenerateRandomId() {

        String id = IdGenerator.randomId();

        assertNotNull(id);

        assertEquals(
                IdConstants.DEFAULT_RANDOM_LENGTH,
                id.length());

    }

    @Test
    void shouldGenerateRandomIdWithSpecifiedLength() {

        String id = IdGenerator.randomId(20);

        assertEquals(
                20,
                id.length());

    }

    @Test
    void shouldRejectInvalidLength() {

        assertThrows(
                IdGenerationException.class,
                () -> IdGenerator.randomId(0));

    }

    @Test
    void shouldGeneratePrefixedId() {

        String id = IdGenerator.prefixedId("USR");

        assertTrue(
                id.startsWith("USR-"));

    }

    @Test
    void shouldGenerateUserId() {

        assertTrue(
                IdGenerator.userId()
                        .startsWith(
                                IdConstants.USER_PREFIX
                                        + IdConstants.SEPARATOR));

    }

    @Test
    void shouldGenerateMessageId() {

        assertTrue(
                IdGenerator.messageId()
                        .startsWith(
                                IdConstants.MESSAGE_PREFIX
                                        + IdConstants.SEPARATOR));

    }

    @Test
    void shouldGenerateGroupId() {

        assertTrue(
                IdGenerator.groupId()
                        .startsWith(
                                IdConstants.GROUP_PREFIX
                                        + IdConstants.SEPARATOR));

    }

    @Test
    void shouldGenerateSessionId() {

        assertTrue(
                IdGenerator.sessionId()
                        .startsWith(
                                IdConstants.SESSION_PREFIX
                                        + IdConstants.SEPARATOR));

    }

    @Test
    void shouldGenerateConversationId() {

        assertTrue(
                IdGenerator.conversationId()
                        .startsWith(
                                IdConstants.CONVERSATION_PREFIX
                                        + IdConstants.SEPARATOR));

    }

    @Test
    void shouldGenerateFileId() {

        assertTrue(
                IdGenerator.fileId()
                        .startsWith(
                                IdConstants.FILE_PREFIX
                                        + IdConstants.SEPARATOR));

    }

    @Test
    void shouldGenerateNotificationId() {

        assertTrue(
                IdGenerator.notificationId()
                        .startsWith(
                                IdConstants.NOTIFICATION_PREFIX
                                        + IdConstants.SEPARATOR));

    }

}