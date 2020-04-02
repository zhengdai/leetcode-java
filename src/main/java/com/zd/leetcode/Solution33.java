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
}
