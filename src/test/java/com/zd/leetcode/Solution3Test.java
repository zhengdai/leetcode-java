package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution3Test {
    private static Solution3 solution3;

    @BeforeAll
    static void initAll() {
        solution3 = new Solution3();
    }

    @Test
    @DisplayName("length of longest substring")
    public void testLengthOfLongestSubstring() {
        String errorMessage = "最长不重复子串方法测试不通过";
        assertEquals(3, solution3.lengthOfLongestSubstring("abcabcbb"), errorMessage);
        assertEquals(1, solution3.lengthOfLongestSubstring("bbbbb"), errorMessage);
        assertEquals(3, solution3.lengthOfLongestSubstring("pwwkew"), errorMessage);
    }

}
