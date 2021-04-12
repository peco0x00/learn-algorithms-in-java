package org.vny.leetcode.problems.p0115;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void numDistinct() {
    Main main = new Naive();
    String s1 = "rabbbit";
    String t1 = "rabbit";
    int res1 = main.numDistinct(s1, t1);
    int ans1 = 3;
    assertEquals(ans1, res1);

    String s2 = "bagbgbag";
    String t2 = "bag";
    int res2 = main.numDistinct(s2, t2);
    int ans2 = 5;
    assertEquals(ans2, res2);
  }
}
