package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution39Test {
    private static Solution39 solution39;

    @BeforeAll
    static void initAll() {
        solution39 = new Solution39();
    }

    @Test
    @DisplayName("test combination sum")
    public void testCombinationSum() {
        List<List<Integer>> res = solution39.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(res);
        List<List<Integer>> res1 = solution39.combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(res1);
    }
}
