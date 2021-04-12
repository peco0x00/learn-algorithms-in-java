package org.vny.leetcode.problems.p0712;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void minimumDeleteSum() {
    // Main main = new Naive();
    // Main main = new Dynamic();
    Main main = new Compress();
    String s1 = "sea";
    String t1 = "eat";
    int res1 = main.minimumDeleteSum(s1, t1);
    int ans1 = 231;
    assertEquals(ans1, res1);

    String s2 = "delete";
    String t2 = "leet";
    int res2 = main.minimumDeleteSum(s2, t2);
    int ans2 = 403;
    assertEquals(ans2, res2);
  }
}
