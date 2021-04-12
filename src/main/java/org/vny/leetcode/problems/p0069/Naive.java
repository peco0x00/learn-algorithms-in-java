package org.vny.leetcode.problems.p0069;

public class Naive implements Main {

  // 袖珍计算器算法
  @Override
  public int mySqrt(int x) {
    if (x == 0) return 0;
    int ans = (int) Math.exp(0.5 * Math.log(x));
    return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
  }
}
