package org.vny.leetcode.problems.p0063;

public class Dynamic01 implements Main {

  // solve this by myself!
  // running time beat 100% of users
  // using space beat 60% of users
  @Override
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
      if (obstacleGrid[i - 1][0] == 1) break;
      dp[i][1] = 1;
    }
    for (int j = 1; j <= n; j++) {
      if (obstacleGrid[0][j - 1] == 1) break;
      dp[1][j] = 1;
    }
    for (int i = 2; i <= m; i++) {
      for (int j = 2; j <= n; j++) {
        if (obstacleGrid[i - 1][j - 1] == 1) dp[i][j] = 0;
        else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[m][n];
  }
}
