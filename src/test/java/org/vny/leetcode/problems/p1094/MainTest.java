package org.vny.leetcode.problems.p1094;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void carPooling() {
    Main main = new Naive();
    int[][] trips1 = {{2, 1, 5}, {3, 3, 7}};
    int capacity1 = 4;
    boolean res1 = main.carPooling(trips1, capacity1);
    boolean ans1 = false;
    assertEquals(ans1, res1);

    int[][] trips2 = {{2, 1, 5}, {3, 3, 7}};
    int capacity2 = 5;
    boolean res2 = main.carPooling(trips2, capacity2);
    boolean ans2 = true;
    assertEquals(ans2, res2);

    int[][] trips3 = {{2, 1, 5}, {3, 5, 7}};
    int capacity3 = 3;
    boolean res3 = main.carPooling(trips3, capacity3);
    boolean ans3 = true;
    assertEquals(ans3, res3);

    int[][] trips4 = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
    int capacity4 = 11;
    boolean res4 = main.carPooling(trips4, capacity4);
    boolean ans4 = true;
    assertEquals(ans4, res4);
  }
}
