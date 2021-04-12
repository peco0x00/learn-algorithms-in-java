package org.vny.leetcode.problems.p0392;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void isSubsequence() {
    Main main = new Dynamic();
    String s = "abc";
    String t = "ahbgdc";
    boolean res = main.isSubsequence(s, t);
    boolean ans = true;
    assertEquals(ans, res);
  }
}
