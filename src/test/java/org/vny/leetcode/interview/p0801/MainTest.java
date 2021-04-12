package org.vny.leetcode.interview.p0801;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void waysToStep() {
    // Main main = new Naive();
    // Main main = new Memo();
    // Main main = new Compress();
    Main main = new Solution01();
    // Main main = new Dynamic();
    int n1 = 3;
    int res1 = main.waysToStep(n1);
    int ans1 = 4;
    assertEquals(ans1, res1);

    int n2 = 5;
    int res2 = main.waysToStep(n2);
    int ans2 = 13;
    assertEquals(ans2, res2);

    int n3 = 76;
    int res3 = main.waysToStep(n3);
    int ans3 = 176653584;
    assertEquals(ans3, res3);
  }
}
