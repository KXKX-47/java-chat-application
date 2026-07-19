package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.exceptions.JsonException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonUtilTest {

    static class Person {

        public String name;

        public int age;

        public Person() {
        }

        public Person(String name,
                      int age) {

            this.name = name;
            this.age = age;

        }

    }

    @Test
    void shouldConvertObjectToJson() {

        Person person = new Person(
                "John",
                25);

        String json = JsonUtil.toJson(person);

        assertTrue(
                json.contains("John"));

    }

    @Test
    void shouldConvertJsonToObject() {

        String json = """
                {
                  "name":"John",
                  "age":25
                }
                """;

        Person person =
                JsonUtil.fromJson(
                        json,
                        Person.class);

        assertEquals(
                "John",
                person.name);

        assertEquals(
                25,
                person.age);

    }

    @Test
    void shouldPrettyPrintJson() {

        Person person =
                new Person(
                        "John",
                        25);

        String json =
                JsonUtil.prettyPrint(person);

        assertTrue(
                json.contains("\n"));

    }

    @Test
    void shouldRecognizeValidJson() {

        assertTrue(
                JsonUtil.isValidJson(
                        "{\"name\":\"John\"}"));

    }

    @Test
    void shouldRejectInvalidJson() {

        assertFalse(
                JsonUtil.isValidJson(
                        "{name"));

    }

    @Test
    void shouldRejectBlankJson() {

        assertFalse(
                JsonUtil.isValidJson(""));

    }

    @Test
    void shouldThrowExceptionForInvalidJsonConversion() {

        assertThrows(
                JsonException.class,
                () -> JsonUtil.fromJson(
                        "{invalid}",
                        Person.class));

    }

}