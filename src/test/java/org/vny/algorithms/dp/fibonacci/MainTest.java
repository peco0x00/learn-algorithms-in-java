package org.vny.algorithms.dp.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void fib() {
    int n = 5;
    Main main = new DynamicSpace();
    int res = main.fib(n);
    int ans = 5;
    assertEquals(res, ans);
  }
}
