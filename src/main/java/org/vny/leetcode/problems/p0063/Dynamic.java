package org.vny.leetcode.problems.p0063;

public class Dynamic implements Main {

  // dp[i][j] -> i * j
  @Override
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
      dp[i][1] = 1;
      for (int k = 0; k < i; k++) {
        if (obstacleGrid[k][0] == 1) {
          dp[i][1] = 0;
          break;
        }
      }
    }
    for (int j = 1; j <= n; j++) {
      dp[1][j] = 1;
      for (int k = 0; k < j; k++) {
        if (obstacleGrid[0][k] == 1) {
          dp[1][j] = 0;
          break;
        }
      }
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
