package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年04月02日
 */
public class Solution33 {
    /*
    nums[0] <= nums[mid] （0 - mid不包含旋转）
        target在0到mid之间   high向前规约
        target大于mid  low向后规约
    nums[mid] < nums[0] （0 - mid包含旋转）mid到high有序
        target在mid到0之间  low向后规约
        target小于mid或者大于0  high向前规约
     */
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if ((nums[0] > target) ^ (nums[0] > nums[mid]) ^ (target > nums[mid])) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return (lo == hi && nums[lo] == target) ? lo : -1;
    }

    public int search2(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                //前半部分有序
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                //后半部分有序
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    private int findRotateIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] < nums[right]) {
            return 0;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else {
                if (nums[left] > nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return 0;
    }
}
