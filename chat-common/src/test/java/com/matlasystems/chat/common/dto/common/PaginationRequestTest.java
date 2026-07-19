package com.matlasystems.chat.common.dto.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PaginationRequestTest {

    @Test
    void shouldCreateDefaultPaginationRequest() {

        PaginationRequest request =
                new PaginationRequest();

        assertEquals(0, request.getPage());
        assertEquals(20, request.getSize());
        assertEquals("id", request.getSortBy());
        assertEquals("ASC", request.getSortDirection());

    }

    @Test
    void shouldCreateUsingConstructor() {

        PaginationRequest request =
                new PaginationRequest(
                        2,
                        50,
                        "username",
                        "DESC");

        assertEquals(2, request.getPage());
        assertEquals(50, request.getSize());
        assertEquals("username", request.getSortBy());
        assertEquals("DESC", request.getSortDirection());

    }

    @Test
    void shouldSetValues() {

        PaginationRequest request =
                new PaginationRequest();

        request.setPage(5);
        request.setSize(100);
        request.setSortBy("email");
        request.setSortDirection("DESC");

        assertEquals(5, request.getPage());
        assertEquals(100, request.getSize());
        assertEquals("email", request.getSortBy());
        assertEquals("DESC", request.getSortDirection());

    }

}