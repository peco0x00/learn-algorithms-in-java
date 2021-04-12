package org.vny.leetcode.problems.p0034;

public class Solution01 implements Main {

  // lower =  true -> searching for element >= target
  //          false -> searching for element > target
  private int bs(int[] nums, int target, boolean lower) {
    int n = nums.length;
    int left = 0, right = n - 1, ans = n;
    while (left <= right) {
      int mid = (left + right) >> 1;
      if (nums[mid] > target || (lower && nums[mid] >= target)) {
        right = mid - 1;
        ans = mid;
      } else {
        left = mid + 1;
      }
    }
    return ans;
  }

  // leftIdx: the first target index
  // rightIdx: the first element's index which is larger than targetD
  @Override
  public int[] searchRange(int[] nums, int target) {
    int leftIdx = bs(nums, target, true);
    int rightIdx = bs(nums, target, false) - 1;
    if (leftIdx <= rightIdx && rightIdx < nums.length
        && nums[leftIdx] == target && nums[rightIdx] == target) {
      return new int[]{leftIdx, rightIdx};
    }
    return new int[]{-1, -1};
  }
}
