package com.zd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengdai
 * @date 2020年03月09日
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int rest = target - nums[i];
            if (map.containsKey(rest)) {
                return new int[]{ map.get(rest), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
