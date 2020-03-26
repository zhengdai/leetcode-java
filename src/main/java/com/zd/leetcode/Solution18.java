package com.zd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhengdai
 * @date 2020年03月20日
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 4; ++i) {
            for (int j = i + 1; j < n - 3; ++j) {
                int l = j + 1;
                int r = n - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum > target) {
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        List<Integer> item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[l]);
                        item.add(nums[r]);
                        result.add(item);
                        while (l < r && nums[l] == nums[++l]) {
                        }
                        while (l < r && nums[r] == nums[--r]) {
                        }
                    }
                }
            }
        }
        return result;
    }
}
