package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution16Test {
    private static Solution16 solution16;

    @BeforeAll
    static void initAll() {
        solution16 = new Solution16();
    }

    @Test
    @DisplayName("three sum closest")
    public void testThreeSumClosest() {
        assertEquals(2, solution16.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
