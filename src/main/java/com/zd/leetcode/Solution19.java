package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月26日
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        while (n > 0) {
            tail = tail.next;
            --n;
        }
        if (tail == null) {
            return head.next;
        }
        ListNode pre = head;
        while (tail.next != null) {
            pre = pre.next;
            tail = tail.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
