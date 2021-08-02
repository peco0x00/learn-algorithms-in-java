package org.vny.leetcode.problems.p0128;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void longestConsecutive() {
    // Main main = new Naive();
    // Main main = new Naive01();
    Main main = new Solution02();
    int[] nums1 = {100, 4, 200, 1, 3, 2};
    int res1 = main.longestConsecutive(nums1);
    int ans1 = 4;
    assertEquals(ans1, res1);

    int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    int res2 = main.longestConsecutive(nums2);
    int ans2 = 9;
    assertEquals(ans2, res2);

    int[] nums3 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
    int res3 = main.longestConsecutive(nums3);
    int ans3 = 7;
    assertEquals(ans3, res3);
  }
}

