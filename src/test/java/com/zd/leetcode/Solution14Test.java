package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月17日
 */
public class Solution14Test {
    private static Solution14 solution14;

    @BeforeAll
    static void initAll() {
        solution14 = new Solution14();
    }

    @Test
    @DisplayName("longest common prefix")
    public void testLongestCommonPrefix() {
        assertEquals("fl", solution14.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", solution14.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    @DisplayName("longest common prefix2")
    public void testLongestCommonPrefix2() {
        assertEquals("fl", solution14.longestCommonPrefix2(new String[]{"flower","flow","flight"}));
        assertEquals("", solution14.longestCommonPrefix2(new String[]{"dog","racecar","car"}));
    }
}
