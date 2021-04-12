package org.vny.leetcode.problems.p0509;

public class DynamicSpace implements Main {

  @Override
  public int fib(int n) {
    if (n == 0) return 0;
    int pre = 1, cur = 1, sum = 0;
    for (int i = 3; i <= n; i++) {
      // pre = dpt[n - 1], cur = dpt[n - 2], sum = dpt[n];
      sum = pre + cur;
      pre = cur;
      cur = sum;
    }
    return cur;
  }
}
