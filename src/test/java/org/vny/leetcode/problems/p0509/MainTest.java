package org.vny.leetcode.problems.p0509;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void fib() {
    // Main main = new Naive();
    // Main main = new Recursive();
    // Main main = new Dynamic();
    Main main = new DynamicSpace();
    int n = 4;
    int res = main.fib(n);
    int ans = 3;
    assertEquals(ans, res);
  }
}
