package com.matlasystems.chat.common.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReactionTest {

    @Test
    void shouldCreateReaction() {

        Reaction reaction = new Reaction();

        reaction.setId(1L);
        reaction.setMessageId(20L);
        reaction.setUserId(5L);
        reaction.setEmoji("👍");

        assertEquals(1L, reaction.getId());
        assertEquals(20L, reaction.getMessageId());
        assertEquals(5L, reaction.getUserId());
        assertEquals("👍", reaction.getEmoji());

    }

    @Test
    void shouldAllowEmojiChange() {

        Reaction reaction = new Reaction();

        reaction.setEmoji("😀");

        assertEquals("😀", reaction.getEmoji());

        reaction.setEmoji("❤️");

        assertEquals("❤️", reaction.getEmoji());

    }

}