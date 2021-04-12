package org.vny.leetcode.problems.p0051;

import java.util.*;

public class Naive implements Main {

  @Override
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<>();
    char[][] board = new char[n][n];
    for (char[] chars : board) {
      Arrays.fill(chars, '.');
    }
    backtrack(board, 0, res);
    return res;
  }

  private List<String> convert(char[][] array) {
    List<String> res = new ArrayList<>();
    for (char[] chars : array) {
      res.add(String.valueOf(chars));
    }
    return res;
  }

  private void backtrack(char[][] board, int row, List<List<String>> res) {
    if (row == board.length) {
      res.add(convert(board));
      return;
    }
    int n = board[row].length;
    for (int col = 0; col < n; col++) {
      if (!isValid(board, row, col)) continue;
      board[row][col] = 'Q';
      backtrack(board, row + 1, res);
      board[row][col] = '.';
    }
  }

  // check if board[row][col] can place the queen
  private boolean isValid(char[][] board, int row, int col) {
    int n = board.length;
    // check the column
    for (int i = 0; i < n; i++) {
      if (board[i][col] == 'Q') return false;
    }
    // check the right upper
    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
      if (board[i][j] == 'Q') return false;
    }
    // check the left upper
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') return false;
    }
    return true;
  }
}
