package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution28Test {
    private static Solution28 solution28;

    @BeforeAll
    static void initAll() {
        solution28 = new Solution28();
    }

    @Test
    @DisplayName("str str")
    public void testStrStr() {
        assertEquals(2, solution28.strStr("hello", "ll"));
        assertEquals(-1, solution28.strStr("aaaaa", "bba"));
    }

    @Test
    @DisplayName("str str2")
    public void testStrStr2() {
        assertEquals(2, solution28.strStr2("hello", "ll"));
        assertEquals(-1, solution28.strStr2("aaaaa", "bba"));
    }

    @Test
    @DisplayName("str str3")
    public void testStrStr3() {
        assertEquals(2, solution28.strStr3("hello", "ll"));
        assertEquals(-1, solution28.strStr3("aaaaa", "bba"));
    }

    @Test
    @DisplayName("str str4")
    public void testStrStr4() {
        assertEquals(2, solution28.strStr4("hello", "ll"));
        assertEquals(-1, solution28.strStr4("aaaaa", "bba"));
    }
}
