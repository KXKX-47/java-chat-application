package com.matlasystems.chat.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.matlasystems.chat.common.constants.JsonConstants;
import com.matlasystems.chat.common.exceptions.JsonException;

public final class JsonUtil {

    private static final ObjectMapper OBJECT_MAPPER =
            createObjectMapper();

    private JsonUtil() {
    }

    private static ObjectMapper createObjectMapper() {

        ObjectMapper mapper = new ObjectMapper();

        if (JsonConstants.PRETTY_PRINT) {

            mapper.enable(
                    SerializationFeature.INDENT_OUTPUT);

        }

        return mapper;
    }

    public static String toJson(Object object) {

        try {

            return OBJECT_MAPPER.writeValueAsString(object);

        }

        catch (JsonProcessingException exception) {

            throw new JsonException(
                    "Failed to convert object to JSON.",
                    exception);

        }

    }

    public static <T> T fromJson(String json,
                                 Class<T> clazz) {

        try {

            return OBJECT_MAPPER.readValue(
                    json,
                    clazz);

        }

        catch (Exception exception) {

            throw new JsonException(
                    "Failed to convert JSON to object.",
                    exception);

        }

    }

    public static String prettyPrint(Object object) {

        try {

            return OBJECT_MAPPER
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(object);

        }

        catch (JsonProcessingException exception) {

            throw new JsonException(
                    "Failed to pretty print JSON.",
                    exception);

        }

    }

    public static boolean isValidJson(String json) {

        if (StringUtil.isNullOrBlank(json)) {

            return false;

        }

        try {

            OBJECT_MAPPER.readTree(json);

            return true;

        }

        catch (Exception exception) {

            return false;

        }

    }

}