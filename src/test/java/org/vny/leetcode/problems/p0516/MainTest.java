package org.vny.leetcode.problems.p0516;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void longestPalindromeSubseq() {
    Naive main = new Naive();
    String s1 = "bbbab";
    int res1 = main.longestPalindromeSubseq(s1);
    int ans1 = 4;
    assertEquals(ans1, res1);
  }
}
