package org.vny.leetcode.problems.p0062;

public class Naive01 implements Main {

  // too slow
  @Override
  public int uniquePaths(int m, int n) {
    if (m == 1 || n == 1) return 1;
    return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
  }
}
