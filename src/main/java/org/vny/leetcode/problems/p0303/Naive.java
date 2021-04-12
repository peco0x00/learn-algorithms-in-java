package org.vny.leetcode.problems.p0303;

public class Naive implements NumArray {

  private int[] nums;

  public Naive(int[] nums) {
    this.nums = nums;
  }

  @Override
  public int sumRange(int left, int right) {
    int res = 0;
    for (int i = left; i <= right; i++) {
      res += nums[i];
    }
    return res;
  }
}
