package org.vny.leetcode.problems.p0354;

import java.util.Arrays;

public class Naive implements Main {

  @Override
  public int maxEnvelops(int[][] envelops) {
    int n = envelops.length;
    Arrays.sort(envelops, (a, b) ->
        a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
    int[] height = new int[n];
    for (int i = 0; i < n; i++) {
      height[i] = envelops[i][1];
    }
    return lengthOfLIS(height);
  }

  private int lengthOfLIS(int[] nums) {
    int piles = 0, n = nums.length;
    int[] top = new int[n];
    for (int poker : nums) {
      int left = 0, right = piles;
      while (left < right) {
        int mid = (left + right) / 2;
        if (top[mid] >= poker)
          right = mid;
        else
          left = mid + 1;
      }
      if (left == piles) piles++;
      top[left] = poker;
    }
    return piles;
  }
}
