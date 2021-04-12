package org.vny.leetcode.offer.p0053;

public class Naive implements Main {

  // ??? what the hell?
  // running time is O(n), but beat 100% of users?
  // should not this need to be solved by using binary search?
  @Override
  public int missingNumber(int[] nums) {
    int n = nums.length;
    if (nums[0] == 1) return 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] != i) return nums[i]- 1;
    }
    return n;
  }
}
