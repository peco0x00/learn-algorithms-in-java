package org.vny.algorithms.dp.LCS;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void longestCommonSubsequence() {
    String text1 = "abcde";
    String text2 = "ace";
    // Main main = new Naive();
    Main main = new Memo();
    int res = main.longestCommonSubsequence(text1, text2);
    int ans = 3;
    assertEquals(ans, res);
  }
}
