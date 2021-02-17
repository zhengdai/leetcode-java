package com.zd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; ++i) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            searchPair(arr, -arr[i], i + 1, triplets);
        }
        return triplets;
    }

    private void searchPair(int[] arr, int target, int startIdx, List<List<Integer>> triplets) {
        int high = arr.length - 1;
        int low = startIdx;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum > target) {
                high--;
            } else if (sum < target) {
                low++;
            } else {
                triplets.add(Arrays.asList(-target, arr[low], arr[high]));
                low++;
                high--;
                while (low < high && arr[low] == arr[low - 1]) {
                    low++;
                }
                while (low < high && arr[high] == arr[high + 1]) {
                    high--;
                }
            }
        }
    }
}
