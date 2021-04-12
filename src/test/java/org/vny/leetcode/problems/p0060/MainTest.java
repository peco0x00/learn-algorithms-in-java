package org.vny.leetcode.problems.p0060;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void getPermutation() {
    // Main main = new Naive();
    Main main = new Solution01();
    int n = 3, k = 3;
    String res = main.getPermutation(n, k);
    String ans = "213";
    assertEquals(ans, res);
  }
}
