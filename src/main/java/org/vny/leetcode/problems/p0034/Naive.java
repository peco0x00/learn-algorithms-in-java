package org.vny.leetcode.problems.p0034;

public class Naive implements Main {

  @Override
  public int[] searchRange(int[] nums, int target) {
    int n = nums.length;
    int[] res = new int[2];
    int left = 0, right = n;
    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid;
      } else {
        right = mid;
      }
    }
    if (left == n) res[0] = -1;
    else res[0] = nums[left] == target ? left : -1;
    left = 0;
    right = n;
    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    if (left == 0) res[1] = -1;
    else res[1] = nums[left - 1] == target ? (left - 1) : -1;
    return res;
  }
}
