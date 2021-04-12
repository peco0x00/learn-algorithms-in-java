package org.vny.leetcode.problems.p0130;

import org.vny.algorithms.unionFind.alg4.CompressionWeightedQuickUnionUF;
import org.vny.algorithms.unionFind.alg4.UF;

public class UnionFind implements Main {

  /*
  * |x x x x|
  * |x o o x|
  * |x x o x|
  * |x o x x|
  * if 'o' not on the edge or
  *     not connected with other 'o' on edge:
  *    'o' -> 'x'
  **/
  @Override
  public void solve(char[][] board) {
    int m = board.length;
    int n = board[0].length;
    UF uf = new CompressionWeightedQuickUnionUF(m * n + 1);
    int root = m * n;
    // connect the first col and last col's O with root
    for (int i = 0; i < m; i++) {
      if (board[i][0] == 'O') {
        uf.union(i * n, root);
      }
      if (board[i][n - 1] == 'O') {
        uf.union(i * n + n - 1, root);
      }
    }
    // connect the first row and last row's O with root
    for (int j = 0; j < n; j++) {
      if (board[0][j] == 'O') {
        uf.union(j, root);
      }
      if (board[m - 1][j] == 'O') {
        uf.union(n * (m - 1) + j, root);
      }
    }
    // direction array, offen used in searching problems
    int[][] d = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    for (int i = 1; i < m - 1; i++) {
      for (int j = 1; j < n - 1; j++) {
        if (board[i][j] == 'O') {
          // connect current 'O' with four-way 'O's
          for (int k = 0; k < 4; k++) {
            int x = i + d[k][0];
            int y = j + d[k][1];
            if (board[x][y] == 'O') {
              uf.union(x * n + y, i * n + j);
            }
          }
        }
      }
    }
    // all the 'O's that are not connected with root
    // need to be replaced by 'X'
    for (int i = 1; i < m - 1; i++) {
      for (int j = 1; j < n - 1; j++) {
        if (!uf.connected(root, i * n + j)) {
          board[i][j] = 'X';
        }
      }
    }
  }
}
