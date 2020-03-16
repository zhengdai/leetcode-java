package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月13日
 */
public class Solution5Test {
    private static Solution5 solution5;

    @BeforeAll
    static void initAll() {
        solution5 = new Solution5();
    }

    @Test
    @DisplayName("longest palindrome")
    public void testLongestPalindrome() {
        assertEquals("bab", solution5.longestPalindrome("babad"));
        assertEquals("bb", solution5.longestPalindrome("cbbd"));
        assertEquals("aa", solution5.longestPalindrome("aacdefcaa"));
    }

    @Test
    @DisplayName("longest palindrome1")
    public void testLongestPalindrome1() {
        assertEquals("bab", solution5.longestPalindrome1("babad"));
        assertEquals("bb", solution5.longestPalindrome1("cbbd"));
        assertEquals("aa", solution5.longestPalindrome1("aacdefcaa"));
    }

    @Test
    @DisplayName("longest palindrome2")
    public void testLongestPalindrome2() {
        assertEquals("bab", solution5.longestPalindrome2("babad"));
        assertEquals("bb", solution5.longestPalindrome2("cbbd"));
        assertEquals("aa", solution5.longestPalindrome2("aacdefcaa"));
    }

    @Test
    @DisplayName("longest palindrome3")
    public void testLongestPalindrome3() {
        assertEquals("bab", solution5.longestPalindrome3("babad"));
        assertEquals("bb", solution5.longestPalindrome3("cbbd"));
        assertEquals("aa", solution5.longestPalindrome3("aacdefcaa"));
    }

    @Test
    @DisplayName("longest palindrome4")
    public void testLongestPalindrome4() {
        assertEquals("aba", solution5.longestPalindrome4("babad"));
        assertEquals("bb", solution5.longestPalindrome4("cbbd"));
        assertEquals("aa", solution5.longestPalindrome4("aacdefcaa"));
    }

    @Test
    @DisplayName("longest palindrome5")
    public void testLongestPalindrome5() {
        assertEquals("bab", solution5.longestPalindrome5("babad"));
        assertEquals("bb", solution5.longestPalindrome5("cbbd"));
        assertEquals("aa", solution5.longestPalindrome5("aacdefcaa"));
    }

    @Test
    @DisplayName("longest palindrome6")
    public void testLongestPalindrome6() {
        assertEquals("bab", solution5.longestPalindrome6("babad"));
        assertEquals("bb", solution5.longestPalindrome6("cbbd"));
        assertEquals("aa", solution5.longestPalindrome6("aacdefcaa"));
    }
}
