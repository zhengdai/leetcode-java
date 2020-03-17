package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author zhengdai
 * @date 2020年03月16日
 */
public class Solution10Test {
    private static Solution10 solution10;

    @BeforeAll
    static void initAll() {
        solution10 = new Solution10();
    }

    @Test
    @DisplayName("is match")
    public void testIsMatch() {
        assertFalse(solution10.isMatch("aa", "a"));
        assertTrue(solution10.isMatch("aa", "a*"));
        assertTrue(solution10.isMatch("ab", ".*"));
        assertTrue(solution10.isMatch("aab", "c*a*b"));
        assertFalse(solution10.isMatch("mississippi", "mis*is*p*."));
    }
}
