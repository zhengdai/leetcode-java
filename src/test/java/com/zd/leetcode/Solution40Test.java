package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution40Test {
    private static Solution40 solution40;

    @BeforeAll
    static void initAll() {
        solution40 = new Solution40();
    }

    @Test
    @DisplayName("test combination sum2")
    public void testCombinationSum2() {
        List<List<Integer>> res = solution40.combinationSum2(new int[]{2, 3, 6, 7}, 7);
        System.out.println(res);
        List<List<Integer>> res1 = solution40.combinationSum2(new int[]{2, 3, 5}, 8);
        System.out.println(res1);
        List<List<Integer>> res2 = solution40.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(res2);
    }
}
