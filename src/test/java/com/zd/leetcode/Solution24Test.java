package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月27日
 */
public class Solution24Test {
    private static Solution24 solution24;

    @BeforeAll
    static void initAll() {
        solution24 = new Solution24();
    }

    @Test
    @DisplayName("swap pairs")
    public void testSwapPairs() {
        ListNode l = new ListNode(2);
        l.next = new ListNode(4);
        l.next.next = new ListNode(9);
        l.next.next.next = new ListNode(7);
        l.next.next.next.next = new ListNode(19);
        l = solution24.swapPairs(l);
        assertEquals(4, l.val);
        assertEquals(2, l.next.val);
        assertEquals(7, l.next.next.val);
        assertEquals(9, l.next.next.next.val);
        assertEquals(19, l.next.next.next.next.val);
    }

    @Test
    @DisplayName("swap pairs2")
    public void testSwapPairs2() {
        ListNode l = new ListNode(2);
        l.next = new ListNode(4);
        l.next.next = new ListNode(9);
        l.next.next.next = new ListNode(7);
        l.next.next.next.next = new ListNode(19);
        l = solution24.swapPairs2(l);
        assertEquals(4, l.val);
        assertEquals(2, l.next.val);
        assertEquals(7, l.next.next.val);
        assertEquals(9, l.next.next.next.val);
        assertEquals(19, l.next.next.next.next.val);
    }
}
