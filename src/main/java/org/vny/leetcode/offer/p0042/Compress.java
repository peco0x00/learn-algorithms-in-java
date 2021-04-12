package org.vny.leetcode.offer.p0042;

public class Compress implements Main {

  @Override
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    int pre = nums[0], cur = 0, res = pre;
    for (int i = 1; i < n; i++) {
      cur = Math.max(pre + nums[i], nums[i]);
      res = Math.max(res, cur);
      pre = cur;
    }
    return res;
  }
}
