package com.matlasystems.chat.common.dto.common;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PaginationResponseTest {

    @Test
    void shouldCreateDefaultPaginationResponse() {

        PaginationResponse<String> response =
                new PaginationResponse<>();

        assertNull(response.getContent());
        assertEquals(0, response.getPage());
        assertEquals(0, response.getSize());
        assertEquals(0, response.getTotalElements());
        assertEquals(0, response.getTotalPages());
        assertFalse(response.isFirst());
        assertFalse(response.isLast());

    }

    @Test
    void shouldCreateUsingConstructor() {

        List<String> users =
                List.of("John", "Mary");

        PaginationResponse<String> response =
                new PaginationResponse<>(
                        users,
                        1,
                        2,
                        10,
                        5,
                        false,
                        false);

        assertEquals(users, response.getContent());
        assertEquals(1, response.getPage());
        assertEquals(2, response.getSize());
        assertEquals(10, response.getTotalElements());
        assertEquals(5, response.getTotalPages());
        assertFalse(response.isFirst());
        assertFalse(response.isLast());

    }

    @Test
    void shouldSetValues() {

        PaginationResponse<Integer> response =
                new PaginationResponse<>();

        response.setContent(List.of(1,2,3));
        response.setPage(3);
        response.setSize(25);
        response.setTotalElements(100);
        response.setTotalPages(4);
        response.setFirst(false);
        response.setLast(true);

        assertEquals(List.of(1,2,3), response.getContent());
        assertEquals(3, response.getPage());
        assertEquals(25, response.getSize());
        assertEquals(100, response.getTotalElements());
        assertEquals(4, response.getTotalPages());
        assertFalse(response.isFirst());
        assertTrue(response.isLast());

    }

}