package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author zhengdai
 * @date 2020年04月01日
 */
public class Solution30Test {
    private static Solution30 solution30;

    @BeforeAll
    static void initAll() {
        solution30 = new Solution30();
    }

    @Test
    @DisplayName("find substring")
    public void testFindSubstring() {
        List<Integer> list1 = solution30.findSubstring("barfoothefoobarman", new String[]{"bar", "foo"});
        assertThat(list1, is(Arrays.asList(0, 9)));
        List<Integer> list2 = solution30.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        assertThat(list2, is(Collections.EMPTY_LIST));
    }

    @Test
    @DisplayName("find substring2")
    public void testFindSubstring2() {
        List<Integer> list1 = solution30.findSubstring2("barfoothefoobarman", new String[]{"bar", "foo"});
        assertThat(list1, is(Arrays.asList(0, 9)));
        List<Integer> list2 = solution30.findSubstring2("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        assertThat(list2, is(Collections.EMPTY_LIST));
    }
}
