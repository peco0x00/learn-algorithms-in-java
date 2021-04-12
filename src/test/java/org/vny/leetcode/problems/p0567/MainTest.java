package org.vny.leetcode.problems.p0567;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void checkInclusion() {
    // Main main = new Naive();
    Main main = new Naive01();
    String s1 = "ab", s2 = "eidbaooo";
    boolean res = main.checkInclusion(s1, s2);
    boolean ans = true;
    assertEquals(ans, res);
  }
}
