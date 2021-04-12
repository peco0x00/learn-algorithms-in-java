package org.vny.leetcode.interview.p0801;

public class Compress implements Main {

  @Override
  public int waysToStep(int n) {
    int N = 1000000007;
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (n == 3) return 4;
    int n0 = 1, n1 = 2, n2 = 4;
    int res = 0;
    for (int i = 4; i <= n; i++) {
      res = ((n2 + n1) % N + n0) % N;
      n0 = n1;
      n1 = n2;
      n2 = res;
    }
    return res;
  }
}
