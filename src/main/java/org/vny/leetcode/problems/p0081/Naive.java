package org.vny.leetcode.problems.p0081;

public class Naive implements Main {

  @Override
  public boolean search(int[] nums, int target) {
    for (int num : nums) {
      if (num == target) return true;
    }
    return false;
  }
}
