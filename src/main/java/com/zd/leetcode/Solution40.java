package com.zd.leetcode;

import java.util.*;

/**
 * @author zhengdai
 * @date 2020年04月29日
 */
public class Solution40 {
    private void bfs(int[] candidates, int len, int begin, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
        }
        for (int i = begin; i < len; ++i) {
            if (target - candidates[i] < 0) {
                break;
            }
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.addLast(candidates[i]);
            bfs(candidates, len, i + 1, target - candidates[i], path, res);
            path.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        int len = candidates.length;
        bfs(candidates, len, 0, target, new ArrayDeque<>(), result);
        return result;
    }
}
