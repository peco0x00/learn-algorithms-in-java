package org.vny.leetcode.problems.p0150;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void evalRPN() {
    // Main main = new Naive();
    Main main = new Solution01();
    String[] tokens1 = {"2", "1", "+", "3", "*"};
    int res1 = main.evalRPN(tokens1);
    int ans1 = 9;
    assertEquals(ans1, res1);
  }
}
