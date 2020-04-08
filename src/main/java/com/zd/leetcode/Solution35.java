package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月03日
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + ((hi - lo) >> 1);
            if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        if (lo < nums.length && target > nums[lo]) {
            return lo + 1;
        } else if (hi >= 0 && target < nums[hi]) {
            return hi;
        } else {
            return lo;
        }
    }
}
