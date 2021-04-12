package org.vny.leetcode.problems.p0081;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void search() {
    Main main = new Naive();
    int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
    int target1 = 0;
    boolean res1 = main.search(nums1, target1);
    boolean ans1 = true;
    assertEquals(ans1, res1);

    int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
    int target2 = 3;
    boolean res2 = main.search(nums2, target2);
    boolean ans2 = false;
    assertEquals(ans2, res2);

    int[] nums3 = {1, 0, 1, 1, 1};
    int target3 = 0;
    boolean res3 = main.search(nums3, target3);
    boolean ans3 = true;
    assertEquals(ans3, res3);

    int[] nums4 = {1, 1, 1, 0, 1};
    int target4 = 0;
    boolean res4 = main.search(nums4, target4);
    boolean ans4 = true;
    assertEquals(ans4, res4);
  }
}
