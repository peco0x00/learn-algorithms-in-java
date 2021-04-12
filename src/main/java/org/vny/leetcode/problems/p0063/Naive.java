package org.vny.leetcode.problems.p0063;

public class Naive implements Main {

  @Override
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    return recur(obstacleGrid, m, n);
  }

  // dp(i, j) -> i * j
  private int recur(int[][] a, int m, int n) {
    if (m == 1) {
      for (int i = 0; i < n; i++) {
        if (a[m - 1][i] == 1) return 0;
      }
      return 1;
    }
    if (n == 1) {
      for (int i = 0; i < m; i++) {
        if (a[i][n - 1] == 1) return 0;
      }
      return 1;
    }
    if (a[m - 1][n - 1] == 1) return 0;
    return recur(a, m - 1, n) + recur(a, m, n - 1);
  }

  private int func(int[][] a, int i, int j) {
    if (i == 1) {
      for (int k = 0; k < j; k++) {
        if (a[i - 1][k] == 1) return 0;
      }
      return 1;
    }
    if (j == 1) {
      for (int k = 0; k < i; k++) {
        if (a[k][j - 1] == 1) return 0;
      }
      return 1;
    }
    if (a[i - 1][j - 1] == 1) return 0;
    return func(a, i - 1, j) + func(a, i, j - 1);
  }
}
