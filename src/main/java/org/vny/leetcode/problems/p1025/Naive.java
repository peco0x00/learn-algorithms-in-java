package org.vny.leetcode.problems.p1025;

public class Naive implements Main {

  /*
  * if n == 1, return false
  * dp[3] = !dp[3 - 1] = !dp[2]
  * dp[4] = !dp[4 - 1] || !dp[4 - 2]
  *       = !dp[3] || !dp[2]
  * */
  @Override
  public boolean divisorGame(int n) {
    boolean[] dp = new boolean[n + 1];
    dp[0] = false;
    dp[1] = false;
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          dp[i] |= !dp[i - j];
        }
      }
    }
    return dp[n];
  }
}
