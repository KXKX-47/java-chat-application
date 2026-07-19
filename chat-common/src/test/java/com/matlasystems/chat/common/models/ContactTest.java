package com.matlasystems.chat.common.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void shouldCreateContactUsingDefaultConstructor() {

        Contact contact = new Contact();

        assertNotNull(contact);

    }

    @Test
    void shouldCreateContactUsingMinimalConstructor() {

        Contact contact = new Contact(
                1L,
                2L
        );

        assertEquals(1L, contact.getOwnerId());
        assertEquals(2L, contact.getContactId());

    }

    @Test
    void shouldCreateContactUsingFullConstructor() {

        LocalDateTime createdAt = LocalDateTime.now();

        Contact contact = new Contact(
                10L,
                100L,
                200L,
                "Best Friend",
                true,
                false,
                createdAt
        );

        assertEquals(10L, contact.getId());
        assertEquals(100L, contact.getOwnerId());
        assertEquals(200L, contact.getContactId());
        assertEquals("Best Friend", contact.getNickname());
        assertTrue(contact.isFavourite());
        assertFalse(contact.isBlocked());
        assertEquals(createdAt, contact.getCreatedAt());

    }

    @Test
    void shouldSetAndGetProperties() {

        LocalDateTime createdAt = LocalDateTime.now();

        Contact contact = new Contact();

        contact.setId(1L);
        contact.setOwnerId(100L);
        contact.setContactId(200L);
        contact.setNickname("Work");
        contact.setFavourite(true);
        contact.setBlocked(false);
        contact.setCreatedAt(createdAt);

        assertEquals(1L, contact.getId());
        assertEquals(100L, contact.getOwnerId());
        assertEquals(200L, contact.getContactId());
        assertEquals("Work", contact.getNickname());
        assertTrue(contact.isFavourite());
        assertFalse(contact.isBlocked());
        assertEquals(createdAt, contact.getCreatedAt());

    }

    @Test
    void shouldCompareContactsUsingId() {

        Contact first = new Contact();
        first.setId(1L);

        Contact second = new Contact();
        second.setId(1L);

        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());

    }

    @Test
    void shouldGenerateReadableToString() {

        Contact contact = new Contact();
        contact.setId(1L);
        contact.setOwnerId(100L);
        contact.setContactId(200L);

        String value = contact.toString();

        assertNotNull(value);
        assertTrue(value.contains("Contact"));
        assertTrue(value.contains("ownerId=100"));
        assertTrue(value.contains("contactId=200"));

    }

}