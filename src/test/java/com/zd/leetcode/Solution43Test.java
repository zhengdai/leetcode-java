package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution43Test {
    private static Solution43 solution43;

    @BeforeAll
    static void initAll() {
        solution43 = new Solution43();
    }

    @Test
    @DisplayName("test multiply")
    public void testMultiply() {
        assertEquals("56088", solution43.multiply("123", "456"));
    }

    @Test
    @DisplayName("test multiply2")
    public void testMultiply2() {
        assertEquals("56088", solution43.multiply2("123", "456"));
    }
}
