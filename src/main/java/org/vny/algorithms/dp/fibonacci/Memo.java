package org.vny.algorithms.dp.fibonacci;

public class Memo implements Main {


  @Override
  public int fib(int n) {
    if (n < 1) return 0;
    int[] memo = new int[n + 1];
    return fib(memo, n);
  }

  private int fib(int[] memo, int n) {
    // base case
    if (n == 1 || n == 2) return 1;
    // already calculated
    if (memo[n] != 0) return memo[n];
    memo[n] = fib(memo, n - 1) + fib(memo, n - 2);
    return memo[n];
  }
}
