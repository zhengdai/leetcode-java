package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // 先把非范围内的数都重置为n+1
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        // 将范围内的数对应的下标的数改成负数，但是不影响取idx
        for (int i = 0; i < n; ++i) {
            int idx = Math.abs(nums[i]) - 1;
            if (idx < n) {
                nums[idx] = - Math.abs(nums[idx]);
            }
        }
        int k;
        for (k = 0; k < n; ++k) {
            if (nums[k] > 0) {
                break;
            }
        }
        return k + 1;
    }
}
