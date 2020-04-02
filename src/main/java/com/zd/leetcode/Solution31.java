package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月01日
 */
public class Solution31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // 一直找到左边小于右边的一对，定位在左边这个元素，nums[i+1]开始时递减有序
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            // 再从定位的这个元素右边找比定位元素大的最小元素，与定位元素交换，交换之后nums[i+1]开始还是递减有序
            while (j >= 0 && nums[j] <= nums[i]) {
                --j;
            }
            swap(nums, i, j);
        }
        // 从定位元素下一个开始倒序
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            ++i;
            --j;
        }
    }
}
