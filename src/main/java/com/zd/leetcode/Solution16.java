package com.zd.leetcode;

import java.util.Arrays;

/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; ++i) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int total = nums[i] + nums[l] + nums[r];
                int abs = Math.abs(total - target);
                if (abs < min) {
                    min = abs;
                    sum = total;
                }
                if (total > target) {
                    r--;
                } else if (total < target) {
                    l++;
                } else {
                    return sum;
                }
            }
        }
        return sum;
    }
}
