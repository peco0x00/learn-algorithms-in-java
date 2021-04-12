package org.vny.leetcode.problems.p0121;

public class Compress implements Main {

  @Override
  public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n == 0 || n == 1) return 0;
    for (int i = n - 1; i > 0; i--) {
      prices[i] -= prices[i - 1];
    }
    int pre = prices[1], res = pre;
    for (int i = 2; i < n; i++) {
      pre = Math.max(pre + prices[i], prices[i]);
      res = Math.max(res, pre);
    }
    return Math.max(res, 0);
  }
}
