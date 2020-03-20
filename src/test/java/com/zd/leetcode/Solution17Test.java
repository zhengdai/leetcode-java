package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution17Test {
    private static Solution17 solution17;

    @BeforeAll
    static void initAll() {
        solution17 = new Solution17();
    }

    @Test
    @DisplayName("letter combinations")
    public void testLetterCombinations() {
        assertThat(solution17.letterCombinations("23"), is(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }
}
