package com.zd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution15 {
    public List<List<Integer>> threeSum(final int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (n < 3) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; ++i) {
            if (nums[i] > 0) {
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[left]);
                    item.add(nums[right]);
                    res.add(item);
                    while (left < right && nums[left] == nums[++left]) {

                    }
                    while ( left < right && nums[right] == nums[--right]) {

                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
