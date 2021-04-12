package org.vny.leetcode.problems.p0010;

public class Recursive implements Main {

  @Override
  public boolean isMatch(String s, String p) {
    return dp(s.toCharArray(), 0, p.toCharArray(), 0);
  }

  // dp函数的含义
  // if dp() = true, then s[i..] can match p[j..]
  // else s[i..] cannot match p[j..]
  // res = dp(s, 0, p, 0)
  private boolean dp(char[] s, int i, char[] p, int j) {
    // base case
    if (j == p.length) return i == s.length;
    if (i == s.length) {
      if ((p.length - j) % 2 == 1) return false;
      for (; j + 1 < p.length; j += 2) {
        if (p[j + 1] != '*') return false;
      }
      return true;
    }
    if (s[i] == p[j] || p[j] == '.') {
      if (j < p.length - 1 && p[j + 1] == '*') {
        return dp(s, i, p, j + 2) ||  // p[j + 1] match zero s[i]
            dp(s, i + 1, p, j);       // or p[j + 1] match multiple s[i]
      } else {
        // p[j] match s[i] once, such as "b" and "b"
        return dp(s, i + 1, p, j + 1);
      }
    } else {
      if (j < p.length - 1 && p[j + 1] == '*') {
        // p[j + 1] match zero s[i]
        return dp(s, i, p, j + 2);
      } else {
        return false;
      }
    }
  }
}
