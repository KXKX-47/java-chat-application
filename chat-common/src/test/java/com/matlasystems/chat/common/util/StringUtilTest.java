package com.matlasystems.chat.common.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    /*--------------------------------------------------
     * isNull()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should return true when value is null")
    void shouldReturnTrueWhenValueIsNull() {

        assertTrue(StringUtil.isNull(null));

    }

    @Test
    @DisplayName("Should return false when value is not null")
    void shouldReturnFalseWhenValueIsNotNull() {

        assertFalse(StringUtil.isNull("Chat"));

    }

    /*--------------------------------------------------
     * isEmpty()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should return true for empty string")
    void shouldReturnTrueForEmptyString() {

        assertTrue(StringUtil.isEmpty(""));

    }

    @Test
    @DisplayName("Should return false for non-empty string")
    void shouldReturnFalseForNonEmptyString() {

        assertFalse(StringUtil.isEmpty("Hello"));

    }

    @Test
    @DisplayName("Should return false for null when checking empty")
    void shouldReturnFalseForNullWhenCheckingEmpty() {

        assertFalse(StringUtil.isEmpty(null));

    }

    /*--------------------------------------------------
     * isBlank()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should return true for null")
    void shouldReturnTrueForNullBlankCheck() {

        assertTrue(StringUtil.isBlank(null));

    }

    @Test
    @DisplayName("Should return true for empty string")
    void shouldReturnTrueForEmptyBlankCheck() {

        assertTrue(StringUtil.isBlank(""));

    }

    @Test
    @DisplayName("Should return true for whitespace")
    void shouldReturnTrueForWhitespace() {

        assertTrue(StringUtil.isBlank("   "));
        assertTrue(StringUtil.isBlank("\t"));
        assertTrue(StringUtil.isBlank("\n"));

    }

    @Test
    @DisplayName("Should return false for text")
    void shouldReturnFalseForTextBlankCheck() {

        assertFalse(StringUtil.isBlank("MATLA"));

    }

    /*--------------------------------------------------
     * hasText()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should return true when string contains text")
    void shouldReturnTrueWhenHasText() {

        assertTrue(StringUtil.hasText("Chat"));

    }

    @Test
    @DisplayName("Should return false for blank string")
    void shouldReturnFalseForBlankHasText() {

        assertFalse(StringUtil.hasText(""));

    }

    @Test
    @DisplayName("Should return false for whitespace")
    void shouldReturnFalseForWhitespaceHasText() {

        assertFalse(StringUtil.hasText("   "));

    }

    @Test
    @DisplayName("Should return false for null")
    void shouldReturnFalseForNullHasText() {

        assertFalse(StringUtil.hasText(null));

    }

    /*--------------------------------------------------
     * trim()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should trim leading and trailing whitespace")
    void shouldTrimWhitespace() {

        assertEquals(
                "Hello",
                StringUtil.trim("   Hello   "));

    }

    @Test
    @DisplayName("Should return null when trimming null")
    void shouldReturnNullWhenTrimNull() {

        assertNull(StringUtil.trim(null));

    }

    @Test
    @DisplayName("Should return unchanged string if already trimmed")
    void shouldReturnAlreadyTrimmedString() {

        assertEquals(
                "Java",
                StringUtil.trim("Java"));

    }

    /*--------------------------------------------------
     * capitalize()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should capitalize lowercase word")
    void shouldCapitalizeLowercaseWord() {

        assertEquals(
                "Kutlwano",
                StringUtil.capitalize("kutlwano"));

    }

    @Test
    @DisplayName("Should capitalize uppercase word")
    void shouldCapitalizeUppercaseWord() {

        assertEquals(
                "Developer",
                StringUtil.capitalize("DEVELOPER"));

    }

    @Test
    @DisplayName("Should return blank string unchanged")
    void shouldReturnBlankWhenCapitalizingBlank() {

        assertEquals(
                "",
                StringUtil.capitalize(""));

    }

    @Test
    @DisplayName("Should return null when capitalizing null")
    void shouldReturnNullWhenCapitalizingNull() {

        assertNull(
                StringUtil.capitalize(null));

    }

    /*--------------------------------------------------
     * capitalizeWords()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should capitalize every word")
    void shouldCapitalizeEveryWord() {

        assertEquals(
                "Matla Systems Development",
                StringUtil.capitalizeWords(
                        "matla systems development"));

    }

    @Test
    @DisplayName("Should remove extra spaces between words")
    void shouldHandleMultipleSpaces() {

        assertEquals(
                "Java Spring Boot",
                StringUtil.capitalizeWords(
                        " java    spring    boot "));

    }

    @Test
    @DisplayName("Should return null when value is null")
    void shouldReturnNullWhenCapitalizingWordsNull() {

        assertNull(
                StringUtil.capitalizeWords(null));

    }

    /*--------------------------------------------------
     * fullName()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should combine first and last name")
    void shouldCombineFirstAndLastName() {

        assertEquals(
                "Kutlwano Matlala",
                StringUtil.fullName(
                        "Kutlwano",
                        "Matlala"));

    }

    @Test
    @DisplayName("Should return first name only")
    void shouldReturnFirstNameOnly() {

        assertEquals(
                "Kutlwano",
                StringUtil.fullName(
                        "Kutlwano",
                        null));

    }

    @Test
    @DisplayName("Should return last name only")
    void shouldReturnLastNameOnly() {

        assertEquals(
                "Matlala",
                StringUtil.fullName(
                        null,
                        "Matlala"));

    }

    @Test
    @DisplayName("Should return empty string when both names are blank")
    void shouldReturnEmptyName() {

        assertEquals(
                "",
                StringUtil.fullName(
                        null,
                        null));

    }

    @Test
    @DisplayName("Should trim both names")
    void shouldTrimNames() {

        assertEquals(
                "Kutlwano Matlala",
                StringUtil.fullName(
                        " Kutlwano ",
                        " Matlala "));

    }

    /*--------------------------------------------------
     * reverse()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should reverse string")
    void shouldReverseString() {

        assertEquals(
                "dcba",
                StringUtil.reverse("abcd"));

    }

    @Test
    @DisplayName("Should return empty string when reversing empty string")
    void shouldReverseEmptyString() {

        assertEquals(
                "",
                StringUtil.reverse(""));

    }

    @Test
    @DisplayName("Should return null when reversing null")
    void shouldReturnNullWhenReverseNull() {

        assertNull(
                StringUtil.reverse(null));

    }

    /*--------------------------------------------------
     * equals()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should return true when strings are equal")
    void shouldReturnTrueWhenEqual() {

        assertTrue(
                StringUtil.equals("Java", "Java"));

    }

    @Test
    @DisplayName("Should return false when strings differ")
    void shouldReturnFalseWhenDifferent() {

        assertFalse(
                StringUtil.equals("Java", "Spring"));

    }

    @Test
    @DisplayName("Should return true when both strings are null")
    void shouldReturnTrueWhenBothNull() {

        assertTrue(
                StringUtil.equals(null, null));

    }

    @Test
    @DisplayName("Should return false when one string is null")
    void shouldReturnFalseWhenOneNull() {

        assertFalse(
                StringUtil.equals(null, "Java"));

    }

    /*--------------------------------------------------
     * equalsIgnoreCase()
     *--------------------------------------------------*/

    @Test
    @DisplayName("Should compare ignoring case")
    void shouldCompareIgnoringCase() {

        assertTrue(
                StringUtil.equalsIgnoreCase(
                        "JAVA",
                        "java"));

    }

    @Test
    @DisplayName("Should return false for different values")
    void shouldReturnFalseIgnoringCase() {

        assertFalse(
                StringUtil.equalsIgnoreCase(
                        "Java",
                        "Spring"));

    }

    @Test
    @DisplayName("Should return true when both are null")
    void shouldReturnTrueIgnoringCaseWhenBothNull() {

        assertTrue(
                StringUtil.equalsIgnoreCase(
                        null,
                        null));

    }

    @Test
    @DisplayName("Should return false when only one value is null")
    void shouldReturnFalseIgnoringCaseWhenOneNull() {

        assertFalse(
                StringUtil.equalsIgnoreCase(
                        null,
                        "Java"));

    }

}