package org.vny.leetcode.problems.p1025;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void divisorGame() {
    Main main = new Naive();
    int n1 = 2;
    boolean res1 = main.divisorGame(n1);
    boolean ans1 = true;
    assertEquals(ans1, res1);

    int n2 = 2;
    boolean res2 = main.divisorGame(n2);
    boolean ans2 = true;
    assertEquals(ans2, res2);
  }
}
