package org.vny.leetcode.problems.p0051;

import java.util.*;

public class Solution02 implements Main {

  // 更进一步压缩空间：位运算
  @Override
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<>();
    int[] board = new int[n];
    Arrays.fill(board, -1);
    Set<Integer> usedCol = new HashSet<>();
    Set<Integer> usedSlash = new HashSet<>();
    Set<Integer> usedBackSlash = new HashSet<>();
    backtrack(res, board, 0, usedCol, usedSlash, usedBackSlash);
    return res;
  }

  private void backtrack(List<List<String>> res, int[] board, int row, Set<Integer> usedCol, Set<Integer> usedSlash,
      Set<Integer> usedBackSlash) {
    int n = board.length;
    if (row == n) {
      res.add(convert(board));
      return;
    }
    for (int i = 0; i < n; i++) {
      if (usedCol.contains(i)) continue;
      if (usedSlash.contains(row - i)) continue;
      if (usedBackSlash.contains(row + i)) continue;
      board[row] = i;
      usedCol.add(i);
      usedSlash.add(row - i);
      usedBackSlash.add(row + i);
      backtrack(res, board, row + 1, usedCol, usedSlash, usedBackSlash);
      board[row] = -1;
      usedCol.remove(i);
      usedSlash.remove(row - i);
      usedBackSlash.remove(row + i);
    }
  }

  private List<String> convert(int[] board) {
    List<String> res = new ArrayList<>();
    int n = board.length;
    for (int i : board) {
      char[] row = new char[n];
      Arrays.fill(row, '.');
      row[board[i]] = 'Q';
      res.add(new String(row));
    }
    return res;
  }
}
