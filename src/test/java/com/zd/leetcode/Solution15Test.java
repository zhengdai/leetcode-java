package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution15Test {
    private static Solution15 solution15;

    @BeforeAll
    static void initAll() {
        solution15 = new Solution15();
    }

    @Test
    @DisplayName("three sum")
    public void testThreeSum() {
        List<List<Integer>> res = solution15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertThat(res.get(0), is(Arrays.asList(-1, -1, 2)));
        assertThat(res.get(1), is(Arrays.asList(-1, 0, 1)));
    }
}
