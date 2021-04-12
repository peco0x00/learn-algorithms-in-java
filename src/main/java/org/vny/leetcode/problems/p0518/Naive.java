package org.vny.leetcode.problems.p0518;

public class Naive implements Main {

  /*
  * knapsack's capacity is [amount], how many ways to fill it?
  *
  * 1. status: coins waiting to be chosen; knapsack's weight
  *    option: pack or not pack
  * 2. dp table:
  *    dp[i][w]: using A[1..i]'s thing, when knapsack's capacity is w,
  *    there are dp[i][w] ways to fill the knapsack
  *    result = dp[N][amount]
  * 3. base case:
  *    dp[0][w] = 0
  *    dp[i][0] = 1
  * 4. transmission:
  *    if (w - coins[i - 1] >= 0):
  *      dp[i][w] = dp[i - 1][w] + dp[i - 1][w - coins[i - 1]];
  * */
  @Override
  public int change(int amount, int[] coins) {
    int n = coins.length;
    if (n == 0) return amount == 0 ? 1 : 0;
    int[][] dp = new int[n + 1][amount + 1];
    for (int i = 1; i <= n; i++) dp[i][0] = 1;
    for (int i = 1; i <= n; i++) {
      for (int w = 1; w <= amount; w++) {
        if (w - coins[i - 1] >= 0) {
          dp[i][w] = dp[i - 1][w] + dp[i][w - coins[i - 1]];
        } else {
          dp[i][w] = dp[i - 1][w];
        }
      }
    }
    return dp[n][amount];
  }
}
