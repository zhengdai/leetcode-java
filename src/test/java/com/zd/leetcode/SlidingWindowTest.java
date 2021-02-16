package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SlidingWindowTest {
    private static SlidingWindow slidingWindow;

    @BeforeAll
    static void initAll() {
        slidingWindow = new SlidingWindow();
    }

    @Test
    @DisplayName("find average")
    public void testFindAverage() {
        assertArrayEquals(new double[]{2.2, 2.8, 2.4, 3.6, 2.8}, slidingWindow.findAverage2(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}), "测试不通过");
    }

    @Test
    @DisplayName("find max sub")
    public void testFindMaxSubArray() {
        assertEquals(9, slidingWindow.findMaxSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
        assertEquals(7, slidingWindow.findMaxSubArray(2, new int[]{2, 3, 4, 1, 5}));
    }

    @Test
    @DisplayName("find min sub")
    public void testFindMinSubArray() {
        assertEquals(2, slidingWindow.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
        assertEquals(1, slidingWindow.findMinSubArray(7, new int[]{2, 1, 5, 2, 8}));
        assertEquals(3, slidingWindow.findMinSubArray(8, new int[]{3, 4, 1, 1, 6}));
    }

    @Test
    @DisplayName("find max length str")
    public void testFindLength() {
        assertEquals(4, slidingWindow.findLength("araaci", 2));
        assertEquals(2, slidingWindow.findLength("araaci", 1));
        assertEquals(5, slidingWindow.findLength("cbbebi", 3));
    }

    @Test
    @DisplayName("find no repeat substr")
    public void testFindNoRepeatSubstr() {
        assertEquals(3, slidingWindow.findNoRepeatSubstr("aabccbb"));
        assertEquals(2, slidingWindow.findNoRepeatSubstr("abbbb"));
        assertEquals(3, slidingWindow.findNoRepeatSubstr("abccde"));
    }

    @Test
    @DisplayName("find replace length")
    public void testFindReplaceLength() {
        assertEquals(5, slidingWindow.findReplaceLength("aabccbb", 2));
        assertEquals(4, slidingWindow.findReplaceLength("abbcb", 1));
        assertEquals(3, slidingWindow.findReplaceLength("abccde", 1));
    }

    @Test
    @DisplayName("find replace length")
    public void testFindReplaceOneLength() {
        assertEquals(6, slidingWindow.findReplaceOneLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
        assertEquals(9, slidingWindow.findReplaceOneLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
    }

    @Test
    @DisplayName("find permutation")
    public void testFindPermutation() {
        assertTrue(slidingWindow.findPermutation("oidbcaf", "abc"));
        assertFalse(slidingWindow.findPermutation("odicf", "dc"));
        assertTrue(slidingWindow.findPermutation("bcdxabcdy", "bcdyabcdx"));
        assertTrue(slidingWindow.findPermutation("aaacb", "abc"));
    }

    @Test
    @DisplayName("find string anagrams")
    public void testFindStringAnagrams() {
        assertThat(slidingWindow.findStringAnagrams("ppqp", "pq"), contains(1, 2));
        assertThat(slidingWindow.findStringAnagrams("abbcabc", "abc"), contains(2, 3, 4));
    }

    @Test
    @DisplayName("test find substring")
    public void testFindSubstring() {
        assertEquals("abdec", slidingWindow.findSubstring("aabdec", "abc"));
        assertEquals("abc", slidingWindow.findSubstring("abdabca", "abc"));
        assertEquals("", slidingWindow.findSubstring("adcad", "abc"));
    }

    @Test
    @DisplayName("find word concatenation")
    public void testFindWordConcatenation() {
        assertThat(slidingWindow.findWordConcatenation("catfoxcat", new String[]{"cat", "fox"}), contains(0, 3));
        assertThat(slidingWindow.findWordConcatenation("catcatfoxfox", new String[]{"cat", "fox"}), contains(3));
    }
}
