package org.vny.leetcode.problems.p0560;

public class Naive implements Main {

  @Override
  public int subarraySum(int[] nums, int k) {
    int n = nums.length;
    if (n == 0) return 0;
    int[] pf = new int[n + 1];
    int count = 0;
    for (int i = 0; i < n; i++) {
      pf[i + 1] = pf[i] + nums[i];
    }
    for (int i = 1; i < pf.length; i++) {
      for (int j = i; j < pf.length; j++) {
        if (pf[j] - pf[i - 1] == k) count++;
      }
    }
    return count;
  }
}
