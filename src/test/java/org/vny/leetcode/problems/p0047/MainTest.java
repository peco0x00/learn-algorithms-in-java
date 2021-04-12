package org.vny.leetcode.problems.p0047;

import org.junit.Test;

import java.util.List;

public class MainTest {

  @Test
  public void permuteUnique() {
    // Main main = new Naive();
    Main main = new Solution01();
    // Main main = new Solution02();
    int[] nums1 = {1, 1, 2};
    List<List<Integer>> res1 = main.permuteUnique(nums1);
    System.out.println(res1);

    /*
    int[] nums2 = {1, 2, 3};
    List<List<Integer>> res2 = main.permuteUnique(nums2);
    System.out.println(res2);
    */
  }
}
