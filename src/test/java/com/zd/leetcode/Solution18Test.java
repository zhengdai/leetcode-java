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
public class Solution18Test {
    private static Solution18 solution18;

    @BeforeAll
    static void initAll() {
        solution18 = new Solution18();
    }

    @Test
    @DisplayName("four sum")
    public void testFourSum() {
        List<List<Integer>> res = solution18.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertThat(res.get(0), is(Arrays.asList(-2, -1, 1, 2)));
        assertThat(res.get(1), is(Arrays.asList(-2,  0, 0, 2)));
        assertThat(res.get(2), is(Arrays.asList(-1,  0, 0, 1)));
        List<List<Integer>> res2 = solution18.fourSum(new int[]{0, 0, 0, 0}, 0);
        assertThat(res2.get(0), is(Arrays.asList(0, 0, 0, 0)));
        List<List<Integer>> res3 = solution18.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);
        System.out.println(res3);
    }
}
