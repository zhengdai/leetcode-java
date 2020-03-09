package com.zd.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution2Test {
    private static Solution2 solution2;
    private static Solution2.ListNode l1;
    private static Solution2.ListNode l2;

    @BeforeAll
    static void initAll() {
        solution2 = new Solution2();
        l1 = new Solution2.ListNode(2);
        l1.next = new Solution2.ListNode(4);
        l1.next.next = new Solution2.ListNode(3);
        l2 = new Solution2.ListNode(5);
        l2.next = new Solution2.ListNode(6);
        l2.next.next = new Solution2.ListNode(4);
    }

    @Test
    @DisplayName("add two numbers")
    public void testAddTwoNumbers() {
        String errorMessage = "两链表相加方法1测试不通过";
        Solution2.ListNode sum = solution2.addTwoNumbers(l1, l2);
        assertEquals(sum.val, 7, errorMessage);
        assertEquals(sum.next.val, 0, errorMessage);
        assertEquals(sum.next.next.val, 8, errorMessage);
    }

    @Test
    @DisplayName("add two numbers2")
    public void testAddTwoNumbers2() {
        String errorMessage = "两链表相加方法2测试不通过";
        Solution2.ListNode sum = solution2.addTwoNumbers2(l1, l2);
        assertEquals(sum.val, 7, errorMessage);
        assertEquals(sum.next.val, 0, errorMessage);
        assertEquals(sum.next.next.val, 8, errorMessage);
    }

    @Test
    @DisplayName("add two numbers3")
    public void testAddTwoNumbers3() {
        String errorMessage = "两链表相加方法3测试不通过";
        Solution2.ListNode sum = solution2.addTwoNumbers3(l1, l2);
        assertEquals(sum.val, 7);
        assertEquals(sum.next.val, 0);
        assertEquals(sum.next.next.val, 8);
    }
}
