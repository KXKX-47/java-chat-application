package com.matlasystems.chat.common.util;

import java.security.SecureRandom;
import java.util.UUID;

import com.matlasystems.chat.common.constants.IdConstants;
import com.matlasystems.chat.common.exceptions.IdGenerationException;

public final class IdGenerator {

    private static final SecureRandom RANDOM =
            new SecureRandom();

    private IdGenerator() {
    }

    /**
     * Generates a UUID.
     */
    public static String uuid() {

        try {

            return UUID.randomUUID().toString();

        } catch (Exception exception) {

            throw new IdGenerationException(
                    "Unable to generate UUID.",
                    exception);

        }

    }

    /**
     * Generates a random alphanumeric ID.
     */
    public static String randomId() {

        return randomId(
                IdConstants.DEFAULT_RANDOM_LENGTH);

    }

    /**
     * Generates a random alphanumeric ID
     * with a custom length.
     */
    public static String randomId(int length) {

        if (length <= 0) {

            throw new IdGenerationException(
                    "ID length must be greater than zero.");

        }

        StringBuilder builder = new StringBuilder(length);

        try {

            for (int index = 0; index < length; index++) {

                int randomIndex = RANDOM.nextInt(
                        IdConstants.ALPHA_NUMERIC.length());

                builder.append(
                        IdConstants.ALPHA_NUMERIC.charAt(randomIndex));

            }

            return builder.toString();

        } catch (Exception exception) {

            throw new IdGenerationException(
                    "Unable to generate random ID.",
                    exception);

        }

    }

    /**
     * Generates an ID with a prefix.
     *
     * Example:
     * USR-3AB82KD91P
     */
    public static String prefixedId(String prefix) {

        return prefix
                + IdConstants.SEPARATOR
                + randomId();

    }

    public static String userId() {

        return prefixedId(
                IdConstants.USER_PREFIX);

    }

    public static String messageId() {

        return prefixedId(
                IdConstants.MESSAGE_PREFIX);

    }

    public static String groupId() {

        return prefixedId(
                IdConstants.GROUP_PREFIX);

    }

    public static String sessionId() {

        return prefixedId(
                IdConstants.SESSION_PREFIX);

    }

    public static String conversationId() {

        return prefixedId(
                IdConstants.CONVERSATION_PREFIX);

    }

    public static String fileId() {

        return prefixedId(
                IdConstants.FILE_PREFIX);

    }

    public static String notificationId() {

        return prefixedId(
                IdConstants.NOTIFICATION_PREFIX);

    }

}