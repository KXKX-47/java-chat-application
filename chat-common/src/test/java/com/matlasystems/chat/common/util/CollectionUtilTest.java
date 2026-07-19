package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.exceptions.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilTest {

    @Test
    @DisplayName("Should return true when collection is null")
    void shouldReturnTrueWhenCollectionIsNull() {

        assertTrue(CollectionUtil.isNullOrEmpty(null));

    }

    @Test
    @DisplayName("Should return true when collection is empty")
    void shouldReturnTrueWhenCollectionIsEmpty() {

        assertTrue(CollectionUtil.isNullOrEmpty(
                Collections.emptyList()));

    }

    @Test
    @DisplayName("Should return false when collection contains elements")
    void shouldReturnFalseWhenCollectionContainsElements() {

        List<String> values = List.of("One", "Two");

        assertFalse(CollectionUtil.isNullOrEmpty(values));

    }

    @Test
    @DisplayName("Should return false for isNotEmpty when collection is null")
    void shouldReturnFalseForIsNotEmptyWhenCollectionIsNull() {

        assertFalse(CollectionUtil.isNotEmpty(null));

    }

    @Test
    @DisplayName("Should return false for isNotEmpty when collection is empty")
    void shouldReturnFalseForIsNotEmptyWhenCollectionIsEmpty() {

        assertFalse(CollectionUtil.isNotEmpty(
                Collections.emptyList()));

    }

    @Test
    @DisplayName("Should return true for non-empty collection")
    void shouldReturnTrueForNonEmptyCollection() {

        List<Integer> numbers = List.of(1, 2, 3);

        assertTrue(CollectionUtil.isNotEmpty(numbers));

    }

    @Test
    @DisplayName("Should return zero size when collection is null")
    void shouldReturnZeroSizeWhenCollectionIsNull() {

        assertEquals(0,
                CollectionUtil.size((List<?>) null));

    }

    @Test
    @DisplayName("Should return correct collection size")
    void shouldReturnCorrectCollectionSize() {

        List<String> values = List.of("A", "B", "C");

        assertEquals(3,
                CollectionUtil.size(values));

    }

    @Test
    @DisplayName("Should return zero when map is null")
    void shouldReturnZeroWhenMapIsNull() {

        assertEquals(0,
                CollectionUtil.size((Map<?, ?>) null));

    }

    @Test
    @DisplayName("Should return correct map size")
    void shouldReturnCorrectMapSize() {

        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);

        assertEquals(2,
                CollectionUtil.size(map));

    }

    @Test
    @DisplayName("Should return empty list when list is null")
    void shouldReturnEmptyListWhenListIsNull() {

        List<String> list =
                CollectionUtil.emptyIfNull((List<String>) null);

        assertNotNull(list);

        assertTrue(list.isEmpty());

    }

    @Test
    @DisplayName("Should return same list instance when list is not null")
    void shouldReturnSameListWhenListIsNotNull() {

        List<String> list = new ArrayList<>();

        list.add("Chat");

        List<String> result =
                CollectionUtil.emptyIfNull(list);

        assertSame(list, result);

    }

    @Test
    @DisplayName("Should return empty set when set is null")
    void shouldReturnEmptySetWhenSetIsNull() {

        assertTrue(CollectionUtil
                .emptyIfNull((HashSet<String>) null)
                .isEmpty());

    }

    @Test
    @DisplayName("Should return same set instance")
    void shouldReturnSameSetInstance() {

        HashSet<String> set = new HashSet<>();

        set.add("Admin");

        assertSame(set,
                CollectionUtil.emptyIfNull(set));

    }

    @Test
    @DisplayName("Should return empty map when map is null")
    void shouldReturnEmptyMapWhenMapIsNull() {

        Map<String, String> map =
                CollectionUtil.emptyIfNull(
                        (Map<String, String>) null);

        assertNotNull(map);

        assertTrue(map.isEmpty());

    }

    @Test
    @DisplayName("Should return same map instance")
    void shouldReturnSameMapInstance() {

        Map<String, String> map = new HashMap<>();

        map.put("A", "B");

        assertSame(map,
                CollectionUtil.emptyIfNull(map));

    }

    @Test
    @DisplayName("Should not throw when collection contains data")
    void shouldNotThrowWhenCollectionContainsData() {

        List<String> list = List.of("Hello");

        assertDoesNotThrow(() ->
                CollectionUtil.requireNotEmpty(
                        list,
                        "Collection cannot be empty"));

    }

    @Test
    @DisplayName("Should throw ValidationException for null collection")
    void shouldThrowValidationExceptionForNullCollection() {

        ValidationException exception =
                assertThrows(
                        ValidationException.class,
                        () -> CollectionUtil.requireNotEmpty(
                                null,
                                "Collection cannot be empty"));

        assertEquals(
                "Collection cannot be empty",
                exception.getMessage());

    }

    @Test
    @DisplayName("Should throw ValidationException for empty collection")
    void shouldThrowValidationExceptionForEmptyCollection() {

        ValidationException exception =
                assertThrows(
                        ValidationException.class,
                        () -> CollectionUtil.requireNotEmpty(
                                Collections.emptyList(),
                                "Collection cannot be empty"));

        assertEquals(
                "Collection cannot be empty",
                exception.getMessage());

    }

}