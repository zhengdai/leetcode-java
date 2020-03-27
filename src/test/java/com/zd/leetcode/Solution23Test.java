package com.zd.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhengdai
 * @date 2020年03月27日
 */
public class Solution23Test {
    private static Solution23 solution23;

    @BeforeAll
    static void initAll() {
        solution23 = new Solution23();
    }

    @Test
    @DisplayName("merge k lists")
    public void testMergeKLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(30);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(13);
        l2.next.next = new ListNode(27);
        ListNode l3 = new ListNode(5);
        l3.next = new ListNode(15);
        l3.next.next = new ListNode(22);
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode result = solution23.mergeKLists(lists);
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(8, result.next.next.next.val);
        assertEquals(13, result.next.next.next.next.val);
        assertEquals(15, result.next.next.next.next.next.val);
        assertEquals(22, result.next.next.next.next.next.next.val);
        assertEquals(27, result.next.next.next.next.next.next.next.val);
        assertEquals(30, result.next.next.next.next.next.next.next.next.val);
    }

    @Test
    @DisplayName("merge k lists2")
    public void testMergeKLists2() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(30);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(13);
        l2.next.next = new ListNode(27);
        ListNode l3 = new ListNode(5);
        l3.next = new ListNode(15);
        l3.next.next = new ListNode(22);
        ListNode[] lists = new ListNode[]{l1, l2, l3};
        ListNode result = solution23.mergeKLists2(lists);
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(8, result.next.next.next.val);
        assertEquals(13, result.next.next.next.next.val);
        assertEquals(15, result.next.next.next.next.next.val);
        assertEquals(22, result.next.next.next.next.next.next.val);
        assertEquals(27, result.next.next.next.next.next.next.next.val);
        assertEquals(30, result.next.next.next.next.next.next.next.next.val);
    }
}
