package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution9Test {
    private static Solution9 solution9;

    @BeforeAll
    static void initAll() {
        solution9 = new Solution9();
    }

    @Test
    @DisplayName("is palindrome")
    public void testIsPalindrome() {
        assertTrue(solution9.isPalindrome(121));
        assertFalse(solution9.isPalindrome(-121));
        assertFalse(solution9.isPalindrome(10));
    }

    @Test
    @DisplayName("is palindrome2")
    public void testIsPalindrome2() {
        assertTrue(solution9.isPalindrome2(121));
        assertFalse(solution9.isPalindrome2(-121));
        assertFalse(solution9.isPalindrome2(10));
    }

    @Test
    @DisplayName("is palindrome3")
    public void testIsPalindrome3() {
        assertTrue(solution9.isPalindrome3(121));
        assertFalse(solution9.isPalindrome3(-121));
        assertFalse(solution9.isPalindrome3(10));
    }
}
