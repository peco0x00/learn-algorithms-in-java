package org.vny.leetcode.problems.p0062;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void uniquePaths() {
    // Main main = new Naive();
    // Main main = new Naive01();
    // Main main = new Dynamic();
    // Main main = new Compress();
    Main main = new Solution01() ;
    int m = 3, n = 7;
    int res = main.uniquePaths(m, n);
    int ans = 28;
    assertEquals(ans, res);
  }
}
