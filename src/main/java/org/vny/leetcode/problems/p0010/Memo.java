package org.vny.leetcode.problems.p0010;

import java.util.HashMap;
import java.util.Map;

public class Memo implements Main {

  @Override
  public boolean isMatch(String s, String p) {
    Map<String, Boolean> memo = new HashMap<>();
    return dp(s.toCharArray(), 0, p.toCharArray(), 0, memo);
  }

  // top-bottom dynamic programming
  private boolean dp(char[] s, int i, char[] p, int j,
      Map<String, Boolean> memo) {
    int m = s.length, n = p.length;
    if (j == n) return i == m;
    if (i == m) {
      if ((n - j) % 2 == 1) return false;
      for (; j + 1 < n; j += 2) {
        if (p[j + 1] != '*') return false;
      }
      return true;
    }
    // record status (i, j)
    String key = "" + i + "," + j;
    if (memo.containsKey(key)) return memo.get(key);
    boolean res;
    if (s[i] == p[j] || p[j] == '.') {
      if (j < n - 1 && p[j + 1] == '*') {
        res = dp(s, i + 1, p, j, memo) ||   // p[j + 1] match multiple s[i]
            dp(s, i, p, j + 2, memo);       // or p[j + 1] match zero s[i]
      } else {                              // p[j] match s[i]
        res = dp(s, i + 1, p, j + 1, memo);
      }
    } else {
      if (j < n - 1 && p[j + 1] == '*') {
        // p[j + 1] match zero s[i]
        res = dp(s, i, p, j + 2, memo);
      } else {
        res = false;
      }
    }
    memo.put(key, false);
    return res;
  }
}
