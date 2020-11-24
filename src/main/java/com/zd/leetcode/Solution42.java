package com.zd.leetcode;

import java.util.Stack;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution42 {

    //按行求
    public int trapWithRow(int[] height) {
        int sum = 0;
        int max = getMax(height);
        for (int i = 1; i <= max; ++i) {
            boolean isStart = false;
            int temp_sum = 0;
            for (int j = 0; j <height.length; ++j) {
                if (isStart && height[j] < i) {
                    temp_sum++;
                }
                if (height[j] >= i) {
                    sum += temp_sum;
                    temp_sum = 0;
                    isStart = true;
                }
            }
        }
        return sum;
    }

    private int getMax(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; ++i) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }

    // 动态规划
    public int trap(int[] height) {
        if (height == null) {
            return 0;
        }
        int ans = 0;
        int len = height.length;
        if (len  == 0) {
            return 0;
        }
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        leftMax[0] = height[0];
        for (int i = 1; i < len; ++i) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; --i) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // len - 2次循环
        for (int i = 1; i < len - 1; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    // 动态规划优化
    public int trap1(int[] height) {
        if (height == null) {
            return 0;
        }
        int sum = 0;
        int len = height.length;
        if (len == 0) {
            return sum;
        }
        int max_left = 0;
        int[] max_right = new int[len];
        for (int i = len - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 1; i < len - 1; ++i) {
            max_left = Math.max(max_left, height[i - 1]);
            int min = Math.min(max_left, max_right[i]);
            if (min > height[i]) {
                sum += min - height[i];
            }
        }
        return sum;
    }

    // 动态规划优化
    public int trap2(int[] height) {
        int sum = 0;
        int max_left = 0;
        int max_right = 0;
        int left = 1;
        // 加右指针进去
        int right = height.length - 2;
        for (int i = 1; i < height.length - 1; i++) {
            //从左到右更
            if (height[left - 1] < height[right + 1]) {
                max_left = Math.max(max_left, height[left - 1]);
                int min = max_left;
                if (min > height[left]) {
                    sum = sum + (min - height[left]);
                }
                left++;
                //从右到左更
            } else {
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }

    public int trap3(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current < height.length) {
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                int h = height[stack.peek()];
                stack.pop();
                if (stack.empty()) {
                    break;
                }
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + distance * (min - h);
            }
            stack.push(current);
            current++;
        }
        return sum;
    }

}