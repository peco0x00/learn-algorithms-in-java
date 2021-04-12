package org.vny.leetcode.problems.p0063;

public class Compress implements Main {

  @Override
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[] dp = new int[n + 1];
    return dp[n - 1];
  }
}
