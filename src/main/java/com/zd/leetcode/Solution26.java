package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月30日
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int empty = 0;
        int pre = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] != pre) {
                nums[++empty] = nums[i];
                pre = nums[i];
            }
        }
        return empty + 1;
    }
}
