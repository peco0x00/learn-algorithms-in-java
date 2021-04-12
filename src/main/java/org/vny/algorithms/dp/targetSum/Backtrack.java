package org.vny.algorithms.dp.targetSum;

public class Backtrack implements Main {

  /*
  * solve this by myself but...
  * running time beats only 5.03%
  * O(2^n)... really bad
  * can be optimized by using dynamic programming
  * */
  int res = 0, sum = 0;

  @Override
  public int findTargetSumWays(int[] nums, int S) {
    backtrack(nums, S, 0);
    return res;
  }

  private void backtrack(int[] nums, int S, int idx) {
    int n = nums.length;
    if (idx == n) {
      if (sum == S) {
        res++;
      }
      return;
    }
    sum += nums[idx];
    backtrack(nums, S, idx + 1);
    sum -= nums[idx];
    sum -= nums[idx];
    backtrack(nums, S, idx + 1);
    sum += nums[idx];
  }
}
