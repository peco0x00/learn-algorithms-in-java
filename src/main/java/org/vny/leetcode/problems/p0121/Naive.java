package org.vny.leetcode.problems.p0121;

public class Naive implements Main {

  @Override
  public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n == 0) return 0;
    int max = 0, minPrice = Integer.MAX_VALUE;
    // assume 'price' is the sold out price
    // check if the profile is the max
    for (int price : prices) {
      if (price < minPrice) {
        minPrice = price;
      } else if (price - minPrice > max) {
        max = price - minPrice;
      }
    }
    return max;
  }
}
