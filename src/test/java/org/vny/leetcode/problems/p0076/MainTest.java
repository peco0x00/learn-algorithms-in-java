package org.vny.leetcode.problems.p0076;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void minWindow() {
    // Main main = new Naive();
    // Main main = new Naive01();
    Main main = new Solution01();
    String s1 = "ADOBECODEBANC", t1 = "ABC";
    String res1 = main.minWindow(s1, t1);
    String ans1 = "BANC";
    assertEquals(ans1, res1);

    String s2 = "aa", t2 = "aa";
    String res2 = main.minWindow(s2, t2);
    String ans2 = "aa";
    assertEquals(ans2, res2);
  }
}
