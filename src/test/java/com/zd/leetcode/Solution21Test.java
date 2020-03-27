package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月27日
 */
public class Solution21Test {
    private static Solution21 solution21;

    @BeforeAll
    static void initAll() {
        solution21 = new Solution21();
    }

    @Test
    @DisplayName("merge two lists")
    public void testMergeTwoLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        ListNode l3 = solution21.mergeTwoLists(l1, l2);
        assertEquals(1, l3.val);
        assertEquals(2, l3.next.val);
        assertEquals(3, l3.next.next.val);
        assertEquals(4, l3.next.next.next.val);
        assertEquals(5, l3.next.next.next.next.val);
        assertEquals(6, l3.next.next.next.next.next.val);
    }
}
