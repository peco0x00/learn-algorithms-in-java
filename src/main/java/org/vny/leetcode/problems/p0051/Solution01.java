package org.vny.leetcode.problems.p0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution01 implements Main {

  @Override
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<>();
    char[][] board = new char[n][n];
    for (char[] chars : board) {
      Arrays.fill(chars, '.');
    }
    // 不能放置皇后的列（被占用)
    boolean[] usedCol = new boolean[n];
    // 不能放置皇后的正斜线（右上角到左下角，共2n-1条）
    boolean[] usedSlash = new boolean[n * 2 - 1];
    // 不能放置皇后的反斜线（左上角到右下角，共2n-1条）
    boolean[] usedBackSlash = new boolean[n * 2 - 1];
    backtrack(board, 0, usedCol, usedSlash, usedBackSlash, res);
    return res;
  }

  private void backtrack(char[][] board, int row, boolean[] usedCol, boolean[] usedSlash, boolean[] usedBackSlash,
      List<List<String>> res) {
    int n = board.length;
    if (row == n) {
      res.add(convert(board));
      return;
    }
    for (int col = 0; col < n; col++) {
      if (!usedCol[col] && !usedSlash[row - col + n - 1] && !usedBackSlash[col + row]) {
        board[row][col] = 'Q';
        usedCol[col] = true;
        usedSlash[row - col + n - 1] = true;
        usedBackSlash[col + row] = true;
        backtrack(board, row + 1, usedCol, usedSlash, usedBackSlash, res);
        board[row][col] = '.';
        usedCol[col] = false;
        usedSlash[row - col + n - 1] = false;
        usedBackSlash[col + row] = false;
      }
    }
  }

  private List<String> convert(char[][] array) {
    List<String> res = new ArrayList<>();
    for (char[] chars : array) {
      res.add(new String(chars));
    }
    return res;
  }
}
