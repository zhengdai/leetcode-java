package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int empty = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] != val) {
                nums[empty++] = nums[i];
            }
        }
        return empty;
    }
}
