package org.vny.leetcode.offer.p0053;

public class Naive01 implements Main {

  // target = mid index, searching left bound
  // solve this by myself!
  // running time beat 100% of users
  // using space beat 42.90% of users
  @Override
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int left = 0, right = n;
    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] > mid) {
        right = mid;
      } else if (nums[mid] < mid) {
        left = mid + 1;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
