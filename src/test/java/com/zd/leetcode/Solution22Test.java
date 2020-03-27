package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author zhengdai
 * @date 2020年03月27日
 */
public class Solution22Test {
    private static Solution22 solution22;

    @BeforeAll
    static void initAll() {
        solution22 = new Solution22();
    }

    @Test
    @DisplayName("generate parenthesis")
    public void testGenerateParenthesis() {
        List<String> result = solution22.generateParenthesis(5);
        System.out.println(result);
        assertEquals(42, result.size());
    }

    @Test
    @DisplayName("generate parenthesis2")
    public void testGenerateParenthesis2() {
        List<String> result = solution22.generateParenthesis2(5);
        System.out.println(result);
        assertEquals(42, result.size());
    }

    @Test
    @DisplayName("generate parenthesis")
    public void testGenerateParenthesis3() {
        List<String> result = solution22.generateParenthesis3(5);
        System.out.println(result);
        assertEquals(42, result.size());
    }
}
