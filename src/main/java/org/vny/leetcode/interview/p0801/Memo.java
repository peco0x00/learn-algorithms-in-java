package org.vny.leetcode.interview.p0801;

public class Memo implements Main {

  @Override
  public int waysToStep(int n) {
    int[] memo = new int[n + 1];
    return dp(memo, n);
  }

  private int dp(int[] memo, int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (n == 3) return 4;
    if (memo[n] > 0) return memo[n];
    memo[n] = ((dp(memo, n - 1) + dp(memo, n - 2)) % 1000000007 + dp(memo, n - 3)) % 1000000007;
    return memo[n];
  }
}
