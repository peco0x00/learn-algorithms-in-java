package org.vny.leetcode.problems.p0474;

public class Naive implements Main {

  /*
  * dp[i][j]: the max subset size that contains i zeros and j ones
  * dp[i][j] = dp[i - 1][j - 1]
  * */
  @Override
  public int findMaxForm(String[] strs, int m, int n) {
    if (m == 0 && n == 0) return 0;
    int[][] dp = new int[m + 1][n + 1];
    dp[0][0] = 0;
    return 0;
  }
}
