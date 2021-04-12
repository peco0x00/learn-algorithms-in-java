package org.vny.leetcode.problems.p0005;

public class Naive implements Main {

  // bruce force, too slow
  @Override
  public String longestPalindrome(String s) {
    char[] a = s.toCharArray();
    int n = a.length;
    int start = 0, maxLen = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        if (satisfied(a, j, i) && i - j + 1 > maxLen) {
          maxLen = i - j + 1;
          start = j;
        }
      }
    }
    return s.substring(start, maxLen + start);
  }

  public boolean satisfied(char[] a, int left, int right) {
    int n = right - left + 1;
    for (int i = left; i < left + n / 2; i++) {
      if (a[i] != a[right + left - i]) return false;
    }
    return true;
  }
}
