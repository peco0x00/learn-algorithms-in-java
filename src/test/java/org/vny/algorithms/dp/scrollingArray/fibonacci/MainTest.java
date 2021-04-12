package org.vny.algorithms.dp.scrollingArray.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void fib() {
    // Main main = new Naive();
    Main main = new Compress();
    int n = 5;
    int res = main.fib(n);
    int ans = 5;
    assertEquals(ans, res);
  }
}
