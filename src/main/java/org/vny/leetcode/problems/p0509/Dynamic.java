package org.vny.leetcode.problems.p0509;

public class Dynamic implements Main {

  @Override
  public int fib(int n) {
    if (n == 0) return 0;
    int[] dpt = new int[n + 1];
    dpt[1] = dpt[2] = 1;
    for (int i = 3; i <= n; i++) {
      dpt[i] = dpt[i - 1] + dpt[i - 2];
    }
    return dpt[n];
  }
}
