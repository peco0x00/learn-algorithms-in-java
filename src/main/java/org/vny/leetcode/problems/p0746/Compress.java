package org.vny.leetcode.problems.p0746;

public class Compress implements Main {

  // even much more awesome!
  // running time beat 99.46% of the users!
  // using space beat 81.59% of the users!
  @Override
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length; // n >= 2
    int n0 = cost[0], n1 = cost[1];
    for (int i = 2; i < n; i++) {
      int tmp = n0;
      n0 = n1;
      n1 = Math.min(tmp, n1) + cost[i];
    }
    return Math.min(n0, n1);
  }
}
