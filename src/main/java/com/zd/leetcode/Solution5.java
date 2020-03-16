package com.zd.leetcode;

/**
 * @author zhengdai
 * @date 2020年03月13日
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        if ("".equals(s)) {
            return "";
        }
        String reverse = new StringBuffer(s).reverse().toString();
        int len = s.length();
        int[][] arr = new int[len][len];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                if (arr[i][j] > maxLen) {
                    int beforeRev = len - 1 - j;
                    if (beforeRev + arr[i][j] - 1 == i) {
                        maxLen = arr[i][j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }

    public String longestPalindrome1(String s) {
        if ("".equals(s)) {
            return "";
        }
        String reverse = new StringBuffer(s).reverse().toString();
        int len = s.length();
        int[] arr = new int[len];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = len - 1; j >= 0; --j) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[j] = 1;
                    } else {
                        arr[j] = arr[j - 1] + 1;
                    }
                } else {
                    arr[j] = 0;
                }
                if (arr[j] > maxLen) {
                    int beforeRev = len - 1 - j;
                    if (beforeRev + arr[j] - 1 == i) {
                        maxLen = arr[j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }

    public String longestPalindrome2(String s) {
        int len = s.length();
        boolean[][] p = new boolean[len][len];
        int maxLen = 0;
        String maxPal = "";
        for (int i = 1; i <= len; ++i) {
            for (int j = 0; j < len; ++j) {
                int end = j + i - 1;
                if (end >= len) {
                    break;
                }
                p[j][end] = (i == 1 || i == 2 || p[j + 1][end - 1]) && s.charAt(j) == s.charAt(end);
                if (p[j][end] && i > maxLen) {
                    maxPal = s.substring(j, end + 1);
                    maxLen = i;
                }
            }
        }
        return maxPal;
    }

    public String longestPalindrome3(String s) {
        int len = s.length();
        boolean[] p = new boolean[len];
        String maxPal = "";
        for (int i = len - 1; i >= 0; --i) {
            for (int j = len - 1; j >= i; --j) {
                p[j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || p[j - 1]);
                if (p[j] && j - i + 1 >= maxPal.length()) {
                    maxPal = s.substring(i, j + 1);
                }
            }
        }
        return maxPal;
    }

    public String longestPalindrome4(String s) {
        int len = s.length();
        if (len == 0) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < len; ++i) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int l = Math.max(len1, len2);
            if (l > end - start) {
                start = i - (l - 1) / 2;
                end = i + l / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    public String longestPalindrome5(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        String str = addBoundaries(s, '#');
        int sLen = str.length();
        int maxLen = 1;
        int start = 0;
        for (int i = 0; i < sLen; ++i) {
            int curLen = centerSpread(str, i);
            if (curLen > maxLen) {
                maxLen = curLen;
                start = (i - maxLen) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    private int centerSpread(String s, int center) {
        int len = s.length();
        int i = center - 1;
        int j = center + 1;
        int step = 0;
        while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            step++;
        }
        return step;
    }

    private String addBoundaries(String s, char c) {
        StringBuffer sb = new StringBuffer();
        sb.append(c);
        for (char t: s.toCharArray()) {
            sb.append(t);
            sb.append(c);
        }
        return sb.toString();
    }

    public String longestPalindrome6(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        String str = addBoundaries(s, '#');
        int sLen = str.length();
        int[] p = new int[sLen];
        int maxRight = 0;
        int center = 0;
        int maxLen = 1;
        int start = 0;
        for (int i = 0; i < sLen; ++i) {
            if (i < maxRight) {
                int mirror = 2 * center - i;
                p[i] = Math.min(maxRight - i, p[mirror]);
            }
            int left = i - (1 + p[i]);
            int right = i + (1 + p[i]);
            while (left >= 0 && right < sLen && str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
                p[i]++;
            }
            if (i + p[i] > maxRight) {
                maxRight = i + p[i];
                center = i;
            }
            if (p[i] > maxLen) {
                maxLen = p[i];
                start = (i - maxLen) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
