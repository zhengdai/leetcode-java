package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int carry;

    private void handleSum(int sum) {
        int val = sum % 10;
        if (sum >= 10) {
            carry = 1;
        } else {
            carry = 0;
        }
        if (head == null) {
            head = tail = new ListNode(val);
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        carry = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        head = null;
        tail = null;
        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val + carry;
            handleSum(sum);
            p1 = p1.next;
            p2 = p2.next;
        }
        ListNode left = p1;
        if (left == null) {
            left = p2;
        }
        while (left != null) {
            int sum = left.val + carry;
            handleSum(sum);
            left = left.next;
        }
        if (carry == 1) {
            tail.next = new ListNode(carry);
            tail = tail.next;
        }
        return head;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while (p1 != null || p2 != null || carry != 0) {
            int val1 = p1 != null ? p1.val : 0;
            int val2 = p2 != null ? p2.val : 0;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        return head.next;
    }

    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private ListNode add(ListNode p1, ListNode p2, int carry) {
        if (p1 == null && p2 == null && carry == 0) {
            return null;
        }
        int val1 = p1 != null ? p1.val : 0;
        int val2 = p2 != null ? p2.val : 0;
        int sum = carry + val1 + val2;
        ListNode result = new ListNode(sum % 10);
        result.next = add(p1 != null ? p1.next : null, p2 != null ? p2.next : null, sum / 10);
        return result;
    }

}
