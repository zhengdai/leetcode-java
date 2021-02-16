package com.zd.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWindow {
    public double[] findAverage(int k, int[] arr) {
        double[] results = new double[arr.length - k + 1];
        for (int i = 0; i < results.length; ++i) {
            double total = 0.0;
            for (int j = 0; j< k; ++j) {
                total += arr[i + j];
            }
            results[i] = total / k;
        }
        return results;
    }

    public double[] findAverage2(int k, int[] arr) {
        double[] results = new double[arr.length - k + 1];
        double sum = 0.0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; ++windowEnd) {
            sum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                results[windowStart] = sum / k;
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return results;
    }

    public int findMaxSubArray(int k, int[] arr) {
        int max = 0;
        int sum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; ++windowEnd) {
            sum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                if (sum > max) {
                    max = sum;
                }
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return max;
    }

    public int findMinSubArray(int s, int[] arr) {
        int windowStart = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int windowEnd = 0; windowEnd < arr.length; ++windowEnd) {
            windowSum += arr[windowEnd];
            while (windowSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public int findLength(String s, int k) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); ++windowEnd) {
            char r = s.charAt(windowEnd);
            frequencyMap.put(r, frequencyMap.getOrDefault(r, 0) + 1);
            while (frequencyMap.size() > k) {
                char l = s.charAt(windowStart);
                frequencyMap.put(l, frequencyMap.get(l) - 1);
                if (frequencyMap.get(l) == 0) {
                    frequencyMap.remove(l);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public int findNoRepeatSubstr(String s) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); ++windowEnd) {
            char r = s.charAt(windowEnd);
            if (indexMap.containsKey(r)) {
                windowStart = Math.max(windowStart, indexMap.get(r) + 1);
            }
            indexMap.put(r, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public int findReplaceLength(String s, int k) {
        int windowStart = 0;
        int maxLength = 0;
        int maxRepeatCount = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < s.length(); ++windowEnd) {
            char r = s.charAt(windowEnd);
            frequencyMap.put(r, frequencyMap.getOrDefault(r, 0) + 1);
            maxRepeatCount = Math.max(maxRepeatCount, frequencyMap.get(r));
            if (windowEnd - windowStart + 1 - maxRepeatCount > k) {
                char l = s.charAt(windowStart);
                frequencyMap.put(l, frequencyMap.get(l) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public int findReplaceOneLength(int[] arr, int k) {
        int windowStart = 0;
        int maxLength = 0;
        int maxOneCount = 0;
        for (int windowEnd = 0; windowEnd < arr.length; ++windowEnd) {
            if (arr[windowEnd] == 1) {
                maxOneCount++;
            }
            if (windowEnd - windowStart + 1 - maxOneCount > k) {
                if (arr[windowStart] == 1) {
                    maxOneCount--;
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public boolean findPermutation(String str, String pattern) {
        int windowStart = 0;
        int matched = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); ++windowEnd) {
            char r = str.charAt(windowEnd);
            if (frequencyMap.containsKey(r)) {
                frequencyMap.put(r, frequencyMap.get(r) - 1);
                if (frequencyMap.get(r) == 0) {
                    matched++;
                }
            }
            if (matched == frequencyMap.size()) {
                return true;
            }
            if (windowEnd - windowStart + 1 >= pattern.length()) {
                char l = str.charAt(windowStart++);
                if (frequencyMap.containsKey(l)) {
                    if (frequencyMap.get(l) == 0) {
                        matched--;
                    }
                    frequencyMap.put(l, frequencyMap.get(l) + 1);
                }
            }
        }
        return false;
    }

    public List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> resultIndices = new ArrayList<>();
        int windowStart = 0;
        int matched = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); ++windowEnd) {
            char r = str.charAt(windowEnd);
            if (frequencyMap.containsKey(r)) {
                frequencyMap.put(r, frequencyMap.get(r) - 1);
                if (frequencyMap.get(r) == 0) {
                    matched++;
                }
            }
            if (matched == frequencyMap.size()) {
                resultIndices.add(windowStart);
            }
            if (windowEnd - windowStart + 1 >= pattern.length()) {
                char l = str.charAt(windowStart++);
                if (frequencyMap.containsKey(l)) {
                    if (frequencyMap.get(l) == 0) {
                        matched--;
                    }
                    frequencyMap.put(l, frequencyMap.get(l) + 1);
                }
            }
        }
        return resultIndices;
    }

    public String findSubstring(String str, String pattern) {
        int windowStart = 0;
        int matched = 0;
        int minLength = str.length() + 1;
        int subStrStart = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c: pattern.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); ++windowEnd) {
            char r = str.charAt(windowEnd);
            if (frequencyMap.containsKey(r)) {
                frequencyMap.put(r, frequencyMap.get(r) - 1);
                if (frequencyMap.get(r) >= 0) {
                    matched++;
                }
            }
            while (matched == pattern.length()) {
                if (minLength > windowEnd - windowStart + 1) {
                    minLength = windowEnd - windowStart + 1;
                    subStrStart = windowStart;
                }
                char l = str.charAt(windowStart++);
                if (frequencyMap.containsKey(l)) {
                    if (frequencyMap.get(l) == 0) {
                        matched--;
                    }
                    frequencyMap.put(l, frequencyMap.get(l) + 1);
                }
            }
        }
        return minLength > str.length() ? "" : str.substring(subStrStart, subStrStart + minLength);
    }

    public List<Integer> findWordConcatenation(String str, String[] words) {
        List<Integer> resultIndices = new ArrayList<>();
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word: words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        int wordCount = words.length;
        int wordLength = words[0].length();
        for (int i = 0; i <= str.length() - wordLength * wordCount; ++i) {
            Map<String, Integer> wordsSeen = new HashMap<>();
            for (int j = 0; j < wordCount; ++j) {
                int nextWordIndex = i + j * wordLength;
                String word = str.substring(nextWordIndex, nextWordIndex + wordLength);
                if (!frequencyMap.containsKey(word)) {
                    break;
                }
                wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);
                if (wordsSeen.get(word) > frequencyMap.get(word)) {
                    break;
                }
                if (j + 1 == wordCount) {
                    resultIndices.add(i);
                }
            }
        }
        return resultIndices;
    }
}
