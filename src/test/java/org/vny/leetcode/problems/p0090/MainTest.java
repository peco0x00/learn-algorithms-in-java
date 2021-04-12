package org.vny.leetcode.problems.p0090;

import org.junit.Test;

import java.util.List;

public class MainTest {

  @Test
  public void subsetsWithDup() {
    Main main = new Naive();
    /*
    int[] nums1 = {1, 2, 2};
    List<List<Integer>> res1 = main.subsetsWithDup(nums1);
    for (List<Integer> nums : res1) {
      System.out.println(nums);
    }
    System.out.println("-----------------------------");

    int[] nums2 = {0};
    List<List<Integer>> res2 = main.subsetsWithDup(nums2);
    for (List<Integer> nums : res2) {
      System.out.println(nums);
    }
    System.out.println("-----------------------------");*/

    int[] nums3 = {1, 2, 3};
    List<List<Integer>> res3 = main.subsetsWithDup(nums3);
    for (List<Integer> nums : res3) {
      System.out.println(nums);
    }
    System.out.println("-----------------------------");
  }
}
