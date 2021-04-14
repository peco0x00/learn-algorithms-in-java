package org.vny.leetcode.problems.p0128;

import java.util.Arrays;

public class Naive01 implements Main {

  // solve this by myself
  // running time beat 99.5% of users
  // using space beat 42% of users
  @Override
  public int longestConsecutive(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    int max = 0, i = 0, left = 0;
    Arrays.sort(nums);
    for (i = 1, left = 0; i < n; i++) {
      if (nums[i - 1] == nums[i]) {
        left++;
      } else if (nums[i - 1] + 1 != nums[i]){
        max = Math.max(max, i - left);
        left = i;
      }
    }
    max = Math.max(max, i - left);
    return max;
  }
}
