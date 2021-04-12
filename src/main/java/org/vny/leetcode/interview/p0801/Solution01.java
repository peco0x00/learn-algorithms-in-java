package org.vny.leetcode.interview.p0801;

public class Solution01 implements Main {

  @Override
  public int waysToStep(int n) {
    if (n < 3) return n;
    int d0 = 1, d1 = 2, d2 = 4, base = 1000000007;
    while (--n >= 3) {
      int t1 = d1;
      int t2 = d2;
      d2 = (((d0 + d1) % base) + d2) % base;
      d0 = t1;
      d1 = t2;
    }
    return d2;
  }
}
