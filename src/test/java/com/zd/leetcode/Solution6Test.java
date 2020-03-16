package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月14日
 */
public class Solution6Test {
    private static Solution6 solution6;

    @BeforeAll
    static void initAll() {
        solution6 = new Solution6();
    }

    @Test
    @DisplayName("convert")
    public void testConvert() {
        assertEquals("LCIRETOESIIGEDHN", solution6.convert("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", solution6.convert("LEETCODEISHIRING", 4));
    }

    @Test
    @DisplayName("convert2")
    public void testConvert2() {
        assertEquals("LCIRETOESIIGEDHN", solution6.convert2("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", solution6.convert2("LEETCODEISHIRING", 4));
    }

    @Test
    @DisplayName("convert3")
    public void testConvert3() {
        assertEquals("LCIRETOESIIGEDHN", solution6.convert3("LEETCODEISHIRING", 3));
        assertEquals("LDREOEIIECIHNTSG", solution6.convert3("LEETCODEISHIRING", 4));
    }
}
