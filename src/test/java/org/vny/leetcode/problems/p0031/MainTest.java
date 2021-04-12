package org.vny.leetcode.problems.p0031;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void nextPermutation() {
    Main main = new Naive();
    int[] nums1 = {1, 2, 3};
    main.nextPermutation(nums1);
    int[] ans1 = {1, 3, 2};
    assertArrayEquals(ans1, nums1);

    int[] nums2 = {3, 2, 1};
    main.nextPermutation(nums2);
    int[] ans2 = {1, 2, 3};
    assertArrayEquals(ans2, nums2);

    int[] nums3 = {1, 1, 5};
    main.nextPermutation(nums3);
    int[] ans3 = {1, 5, 1};
    assertArrayEquals(ans3, nums3);
  }
}
