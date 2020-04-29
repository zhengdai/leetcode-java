package com.zd.leetcode;

import java.util.*;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution39 {
    private void dfs(int[] candidates, int len, int target, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; ++i) {
            if (target - candidates[i] < 0) {
                break;
            }
            path.addLast(candidates[i]);
            dfs(candidates, len, target - candidates[i], i, path, res);
            path.removeLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = candidates.length;
        Arrays.sort(candidates);
        dfs(candidates, len, target, 0, new ArrayDeque<>(), result);
        return result;
    }
}