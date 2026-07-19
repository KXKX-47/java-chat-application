package com.matlasystems.chat.common.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReadReceiptTest {

    @Test
    void shouldCreateReadReceipt() {

        LocalDateTime now = LocalDateTime.now();

        ReadReceipt receipt = new ReadReceipt();

        receipt.setMessageId(10L);
        receipt.setUserId(15L);
        receipt.setReadAt(now);

        assertEquals(10L, receipt.getMessageId());
        assertEquals(15L, receipt.getUserId());
        assertEquals(now, receipt.getReadAt());

    }

    @Test
    void shouldUpdateReadTime() {

        ReadReceipt receipt = new ReadReceipt();

        LocalDateTime first = LocalDateTime.now();
        LocalDateTime second = first.plusMinutes(5);

        receipt.setReadAt(first);

        assertEquals(first, receipt.getReadAt());

        receipt.setReadAt(second);

        assertEquals(second, receipt.getReadAt());

    }

}