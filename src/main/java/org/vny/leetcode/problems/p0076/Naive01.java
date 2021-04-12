package org.vny.leetcode.problems.p0076;

public class Naive01 implements Main {

  // solve this by myself!
  // running time beat 100% of users
  // using space beat 95% of users;
  @Override
  public String minWindow(String s, String t) {
    char[] as = s.toCharArray(), at = t.toCharArray();
    int m = s.length(), n = t.length();
    int left = 0, right = 0;
    int start = 0, minLen = Integer.MAX_VALUE;
    int tot = 0;
    int[] window = new int[128];
    int[] memo = new int[128];
    for (char c : at) {
      memo[c]++;
      tot++;
      if (memo[c] > 1) tot--;
    }
    int match = 0;
    while (right < m) {
      char c1 = as[right];
      if (memo[c1] > 0) {
        window[c1]++;
        if (window[c1] == memo[c1]) match++;
      }
      right++;
      while (match == tot) {
        if (right - left < minLen) {
          minLen = right - left;
          start = left;
        }
        char c2 = as[left];
        if (memo[c2] > 0) {
          window[c2]--;
          if (window[c2] < memo[c2]) match--;
        }
        left++;
      }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
  }
}
