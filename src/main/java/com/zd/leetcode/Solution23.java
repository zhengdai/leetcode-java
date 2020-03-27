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
}
