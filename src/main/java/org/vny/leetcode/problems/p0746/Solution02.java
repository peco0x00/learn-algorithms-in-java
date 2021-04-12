package org.vny.leetcode.problems.p0746;

public class Solution02 implements Main {

  @Override
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int pre = 0, cur = 0;
    for (int i = 2; i <= n; i++) {
      int next = Math.min(cur + cost[i - 1], pre + cost[i - 2]);
      pre = cur;
      cur = next;
    }
    return cur;
  }
}
