package org.vny.leetcode.problems.p0053;

public class Naive implements Main {

  @Override
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    int pre = nums[0], res = pre;
    for (int i = 1; i < n; i++) {
      pre = Math.max(pre + nums[i], nums[i]);
      res = Math.max(res, pre);
    }
    return res;
  }
}
