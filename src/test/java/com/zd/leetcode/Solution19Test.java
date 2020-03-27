package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月26日
 */
public class Solution19Test {
    private static Solution19 solution19;

    @BeforeAll
    static void initAll() {
        solution19 = new Solution19();
    }

    @Test
    @DisplayName("remove nth from end")
    public void testRemoveNthFromEnd() {
        Solution19.ListNode head = new Solution19.ListNode(0);
        head.next = new Solution19.ListNode(1);
        head.next.next = new Solution19.ListNode(2);
        assertEquals(1, head.next.val);
        assertEquals(2, solution19.removeNthFromEnd(head, 2).next.val);
    }
}
