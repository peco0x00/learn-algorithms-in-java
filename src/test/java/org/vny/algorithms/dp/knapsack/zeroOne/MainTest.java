package org.vny.algorithms.dp.knapsack.zeroOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void maxValue() {
    Main main = new Naive();
    int W = 4, N = 3;
    int[] wt = {2, 1, 3};
    int[] val = {4, 2, 3};
    int res = main.maxValue(W, N, wt, val);
    int ans = 6;
    assertEquals(ans, res);
  }
}
