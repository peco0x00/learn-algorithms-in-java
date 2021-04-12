package org.vny.leetcode.problems.p0392;

public class Naive implements Main {

  // solve this by myself using double pointer!
  // running time beat 100% of the users!
  // using space beat 68.34% of the users!
  // awesome!
  @Override
  public boolean isSubsequence(String s, String t) {
    char[] as = s.toCharArray(), at = t.toCharArray();
    int m = as.length, n = at.length;
    if (m == 0 && n == 0) return true;
    if (n == 0) return false;
    if (m == 0) return true;
    int i = 0, j = 0;
    while (j < n && i < m) {
      if (as[i] == at[j]) i++;
      j++;
    }
    return i == m;
  }
}
