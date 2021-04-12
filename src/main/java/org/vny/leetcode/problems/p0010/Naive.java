package org.vny.leetcode.problems.p0010;

public class Naive implements Main {

  // failed
  @Override
  public boolean isMatch(String s, String p) {
    char[] as = s.toCharArray();
    char[] ap = p.toCharArray();
    int i = 0, j = 0, m = as.length, n = ap.length;
    char c;
    while (i < m && j < n) {
      if (as[i] == ap[j] || ap[j] == '.') {
        i++;
        if (j < n - 1 && ap[j + 1] == '*') {
          // p[j + 1] match multiple s[i]
          // or p[j] match s[i] but p[j + 1] match 0 s[i]
          // TODO 在这里发现可能存在两种情况，直接迭代显然难以解决
          // TODO 因此需要递归，构造树结构处理多种情况
          j += 2;
        } else {
          // match 1
          j++;
        }
      } else {
        if (j < n - 1 && ap[j + 1] == '*') {
          // match 0
          j += 2;
        } else {
          return false;
        }
      }
    }
    // p has done, if s is done too, then match
    if (j == n) return i == m;
    // when s has done, if p can match empty string, match
    // otherwise not match
    if (i == m) {
      // if p can match empty string
      // p must be the multiple '[char]*' pair
      if ((n - j) % 2 == 1) {   // if p's remain length is odd, not match
        return false;
      }
      // check if p is '[char]*[char]*...'
      for (; j + 1 < n; j += 2) {
        if (ap[j + 1] != '*') {
          return false;
        }
      }
      return true;
    }
    return i == j;
  }
}
