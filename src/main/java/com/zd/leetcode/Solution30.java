package com.zd.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhengdai
 * @date 2020年04月01日
 */
public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int m = words.length;
        if (m > 0) {
            Map<String, Integer> map = initMap(words);
            int wordLen = words[0].length();
            int total = s.length();
            int wordCharLen = wordLen * m;
            for (int i = 0; i < total - wordCharLen + 1; ++i) {
                String sub = s.substring(i, i + wordCharLen);
                Map<String, Integer> tmpMap = new HashMap<>();
                for (int j = 0; j < m; ++j) {
                    String word = sub.substring(j * wordLen, (j + 1) * wordLen);
                    tmpMap.put(word, tmpMap.getOrDefault(word, 0) + 1);
                }
                if (tmpMap.equals(map)) {
                    result.add(i);
                }
            }
        }

        return result;
    }

    private Map<String, Integer> initMap(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public List<Integer> findSubstring2(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int m = words.length;
        if (m > 0) {
            int wordLen = words[0].length();
            int total = s.length();
            Map<String, Integer> allWords = initMap(words);
            for (int i = 0; i < wordLen; ++i) {
                int left = i;
                int right = i;
                int count = 0;
                Map<String, Integer> tmpMap = new HashMap<>();
                while (right + wordLen <= total) {
                    String w = s.substring(right, right + wordLen);
                    right += wordLen;
                    if (!allWords.containsKey(w)) {
                        count = 0;
                        left = right;
                        tmpMap.clear();
                    } else {
                        tmpMap.put(w, tmpMap.getOrDefault(w, 0) + 1);
                        count++;
                        while(tmpMap.getOrDefault(w, 0) > allWords.getOrDefault(w, 0)) {
                            String tw = s.substring(left, left + wordLen);
                            count--;
                            tmpMap.put(tw, tmpMap.get(tw) - 1);
                            left += wordLen;
                        }
                        if (count == m) {
                            result.add(left);
                        }
                    }
                }
            }
        }
        return result;
    }
}
