package org.vny.leetcode.interview.p1716;

public class Compress implements Main {

  @Override
  public int massage(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    int n0 = 0, n1 = nums[0];
    for (int i = 1; i < n; i++) {
      int tmp = n0;
      n0 = Integer.max(n0, n1);
      n1 = tmp + nums[i];
    }
    return Integer.max(n0, n1);
  }
}
