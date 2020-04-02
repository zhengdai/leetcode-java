package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月02日
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                int i = mid - 1;
                int j = mid + 1;
                while (i >= 0 && nums[i] == nums[mid]) {
                    i--;
                }
                while (j < nums.length && nums[j] == nums[mid]) {
                    j++;
                }
                result[0] = i + 1;
                result[1] = j - 1;
                return result;
            }
        }
        return result;
    }
}
