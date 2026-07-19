package com.matlasystems.chat.common.util;

import com.matlasystems.chat.common.constants.CollectionConstants;
import com.matlasystems.chat.common.exceptions.ValidationException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class CollectionUtil {

    private CollectionUtil() {

    }

    public static boolean isNullOrEmpty(Collection<?> collection) {

        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {

        return !isNullOrEmpty(collection);
    }

    public static int size(Collection<?> collection) {

        return collection == null ? 0 : collection.size();
    }

    public static int size(Map<?,?> map) {

        return map == null ? 0 : map.size();

    }

    public static <T> List<T> emptyIfNull(List<T> list) {

        return list == null ? Collections.emptyList() : list;

    }

    public static <T> Set<T> emptyIfNull(Set<T> set) {

        return set == null ? Collections.emptySet() : set;
    }

    public static <K, V> Map<K, V> emptyIfNull(Map<K, V> map) {

        return map == null ? Collections.emptyMap() : map;
    }

    public static void requireNotEmpty(Collection<?> collection, String message) {

        if(isNullOrEmpty(collection)) {

            throw new ValidationException(message);
        }
    }
}