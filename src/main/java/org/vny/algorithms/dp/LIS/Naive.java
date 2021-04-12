package org.vny.algorithms.dp.LIS;

import java.util.Arrays;

public class Naive implements Main {

  @Override
  public int lengthOfLIS(int[] nums) {
    int[] dpt = new int[nums.length];
    Arrays.fill(dpt, 1);
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[i]) {
          dpt[i] = Integer.max(dpt[i], dpt[j] + 1);
        }
      }
    }
    int res = 0;
    for (int i : dpt) {
      res = Integer.max(res, i);
    }
    return res;
  }
}
