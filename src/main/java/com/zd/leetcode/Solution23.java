package com.zd.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author zhengdai
 * @date 2020年03月27日
 * 最小堆实现
 */
public class Solution23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n;
        if (lists == null || (n = lists.length) == 0) {
            return null;
        }
        if (n == 1) {
            return lists[0];
        }
        ListNode preHead = new ListNode(-1);
        ListNode cur = preHead;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(n, Comparator.comparingInt(n2 -> n2.val));
        for (ListNode list: lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }
        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            cur.next = minNode;
            cur = cur.next;
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }
        return preHead.next;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (p != null && q != null) {
            if (p.val < q.val) {
                cur.next = p;
                p = p.next;
            } else {
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        if (p != null) {
            cur.next = p;
        } else {
            cur.next = q;
        }
        return head.next;
    }
}
