package org.vny.leetcode.problems.p0069;

public class Solution02 implements Main {

  @Override
  public int mySqrt(int x) {
    if (x == 0) return 0;
    double C = x, x0 = x;
    while (true) {
      double xi = 0.5 * (x0 + C / x0);
      if (Math.abs(x0 - xi) < 1e-7) break;
      x0 = xi;
    }
    return (int) x0;
  }
}
