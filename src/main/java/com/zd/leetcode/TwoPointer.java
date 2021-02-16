package com.zd.leetcode;

public class TwoPointer {
    public int[] search(int[] arr, int targetSum) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum > targetSum) {
                high--;
            } else if (sum < targetSum) {
                low++;
            } else {
                return new int[]{low, high};
            }
        }
        return new int[]{-1, -1};
    }

    public int remove(int[] arr) {
        int nextDuplicate = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[nextDuplicate - 1]) {
                arr[nextDuplicate] = arr[i];
                nextDuplicate++;
            }
        }
        return nextDuplicate;
    }

    public int[] makeSquares(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        int highestIdx = n - 1;
        int left = 0, right = n - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare > rightSquare) {
                squares[highestIdx--] = leftSquare;
                left++;
            } else {
                squares[highestIdx--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}
