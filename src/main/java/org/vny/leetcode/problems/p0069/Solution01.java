package org.vny.leetcode.problems.p0069;

public class Solution01 implements Main {

  // find k, let k * k == x
  @Override
  public int mySqrt(int x) {
    int left = 0, right = x, res = -1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if ((long) mid * mid <= x) {
        res = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return res;
  }
}
