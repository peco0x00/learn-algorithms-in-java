package org.vny.leetcode.problems.p1658;

public class Naive implements Main {

  @Override
  public int minOperations(int[] nums, int x) {
    int n = nums.length;
    int left = 0, right = 0, sum = 0;
    while (right < n) {
      sum += nums[right];
      right++;
    }
    return -1;
  }
}
