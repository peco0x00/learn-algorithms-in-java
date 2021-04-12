package org.vny.leetcode.problems.p0063;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void uniquePathsWithObstacles() {
    // Main main = new Naive();
    // Main main = new Dynamic();
    // Main main = new Dynamic01();
    Main main = new Compress();
    // Main main = new Solution01();
    int[][] o1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    int res1 = main.uniquePathsWithObstacles(o1);
    int ans1 = 2;
    assertEquals(ans1, res1);

    int[][] o2 = {{0, 0}, {0, 1}};
    int res2 = main.uniquePathsWithObstacles(o2);
    int ans2 = 0;
    assertEquals(ans2, res2);

    int[][] o3 = {{0, 1}, {0, 0}};
    int res3 = main.uniquePathsWithObstacles(o3);
    int ans3 = 1;
    assertEquals(ans3, res3);

    int[][] o4 = {{0, 0}, {1, 1}, {0, 0}};
    int res4 = main.uniquePathsWithObstacles(o4);
    int ans4 = 0;
    assertEquals(ans4, res4);

    int[][] o5 = {{0}, {1}};
    int res5 = main.uniquePathsWithObstacles(o5);
    int ans5 = 0;
    assertEquals(ans5, res5);

    int[][] o6 = {{1}, {0}};
    int res6 = main.uniquePathsWithObstacles(o6);
    int ans6 = 0;
    assertEquals(ans6, res6);
  }
}
