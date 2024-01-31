/**
 *
 */
package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @author Nicolas LE LANNIER
 */
public class StringUtilsTest {

    @Test
    public void testLevenshteinDistanceWithEqualStrings() {
        assertEquals(0, StringUtils.levenshteinDistance("abc", "abc"));
    }

    @Test
    public void testLevenshteinDistanceWithOneCharacterDifference() {
        assertEquals(1, StringUtils.levenshteinDistance("abc", "abd"));
    }

    @Test
    public void testLevenshteinDistanceWithInsertionAndDeletion() {
        assertEquals(1, StringUtils.levenshteinDistance("abc", "ac"));
    }

    @Test
    public void testLevenshteinDistanceWithEmptyStrings() {
        assertEquals(3, StringUtils.levenshteinDistance("", "abc"));
    }

    @Test
    public void testLevenshteinDistanceWithNullStrings() {
        assertEquals(3, StringUtils.levenshteinDistance(null, "abc"));
        assertEquals(3, StringUtils.levenshteinDistance("abc", null));
        assertEquals(0, StringUtils.levenshteinDistance(null, null));
    }

}
