package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution25Test {
    private static Solution25 solution25;

    @BeforeAll
    static void initAll() {
        solution25 = new Solution25();
    }

    @Test
    @DisplayName("reverse k group")
    public void testReverseKGroup() {
        ListNode l = new ListNode(2);
        l.next = new ListNode(4);
        l.next.next = new ListNode(9);
        l.next.next.next = new ListNode(7);
        l.next.next.next.next = new ListNode(19);
        l = solution25.reverseKGroup(l, 3);
        assertEquals(9, l.val);
        assertEquals(4, l.next.val);
        assertEquals(2, l.next.next.val);
        assertEquals(7, l.next.next.next.val);
        assertEquals(19, l.next.next.next.next.val);
    }
}
