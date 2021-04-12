package org.vny.leetcode.problems.p0005;

public class Solution01 implements Main {

  // expand from every center
  @Override
  public String longestPalindrome(String s) {
    int n = s.length();
    if (n == 0) return "";
    char[] a = s.toCharArray();
    int start = 0, end = 0;
    for (int i = 0; i < n; i++) {
      // "bab" type
      int len1 = expandAroundCenter(a, i, i);
      // "baab" type
      int len2 = expandAroundCenter(a, i, i + 1);
      int len = Math.max(len1, len2);
      if (len > end - start) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }
    return s.substring(start, end + 1);
  }

  public int expandAroundCenter(char[] s, int left, int right) {
    while (left >= 0 && right < s.length && s[left] == s[right]) {
      --left;
      ++right;
    }
    return right - left - 1;
  }
}
