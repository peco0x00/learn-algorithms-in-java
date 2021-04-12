package org.vny.leetcode.problems.p0062;

public class Solution01 implements Main {

  /*
  * using combination math
  * result = C(m - 1)(m + n - 2)
  * */
  @Override
  public int uniquePaths(int m, int n) {
    long ans = 1;
    for (int x = n, y = 1; y < m; ++x, ++y) {
      ans = ans * x / y;
    }
    return (int) ans;
  }
}
