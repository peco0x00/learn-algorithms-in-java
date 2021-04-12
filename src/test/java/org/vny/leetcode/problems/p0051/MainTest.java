package org.vny.leetcode.problems.p0051;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void solveNQueens() {
    // Main main = new Naive();
    // Main main = new Solution01();
    Main main = new Solution02();
    int n1 = 4;
    List<List<String>> res1 = main.solveNQueens(n1);
    System.out.println(res1);

    int n2 = 1;
    List<List<String>> res2 = main.solveNQueens(n2);
    System.out.println(res2);
  }
}
