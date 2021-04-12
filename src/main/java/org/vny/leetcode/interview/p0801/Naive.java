package org.vny.leetcode.interview.p0801;

public class Naive implements Main {

  @Override
  public int waysToStep(int n) {
    return (int) (dp(n) % 1000000007);
  }

  // arrive dp(i)'s way：
  // 1. jump one step to arrive dp(i)
  // 2. jump two step to arrive dp(i)
  // 3. jump three step to arrive dp(i)
  // so, dp(i) = dp(i - 1) + dp(i - 2) + dp(i - 3)
  private long dp(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (n == 3) return 4;
    return ((dp(n - 1) + dp(n - 2)) % 1000000007 + dp(n - 3)) % 1000000007;
  }
}
