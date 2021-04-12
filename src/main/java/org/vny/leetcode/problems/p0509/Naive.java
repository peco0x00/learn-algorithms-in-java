package org.vny.leetcode.problems.p0509;

public class Naive implements Main {

  @Override
  public int fib(int n) {
    if (n == 0) return 0;
    if (n == 1 || n == 2) return 1;
    return fib(n - 1) + fib(n - 2);
  }
}
