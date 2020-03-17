package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月17日
 * (j - i) * min(a[i], a[j])
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int cur = (j - i) * Math.min(height[i], height[j]);
                if (cur > max) {
                    max = cur;
                }
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            int cur = (j - i) * Math.min(height[i], height[j]);
            if (cur > max) {
                max = cur;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
