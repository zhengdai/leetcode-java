package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution1Test {
    private static Solution1 solution1;

    @BeforeAll
    static void initAll() {
        solution1 = new Solution1();
    }

    @Test
    @DisplayName("two sum")
    public void testTwoSum() {
        assertArrayEquals(new int[]{0, 1}, solution1.twoSum(new int[]{2, 7, 11, 15}, 9), "两数之和测试数据不通过");
    }
}
