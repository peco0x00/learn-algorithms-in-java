package org.vny.leetcode.problems.p0076;

public class Solution01 implements Main {

  @Override
  public String minWindow(String s, String t) {
    char[] as = s.toCharArray(), at = t.toCharArray();
    int m = as.length, n = at.length;
    int[] hash = new int[128];
    for (char c : at) {
      hash[c]--;
    }
    int start = 0, minLen = Integer.MAX_VALUE;
    for (int i = 0, j = 0, cnt = 0; i < m; i++) {
      hash[as[i]]++;
      if (hash[as[i]] <= 0) cnt++;
      while (cnt == n && hash[as[j]] > 0) hash[as[j++]]--;
      if (cnt == n && i - j + 1 < minLen) {
          minLen = i - j + 1;
          start = j;
      }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
  }
}
