package org.vny.algorithms.dp.targetSum;

// 回溯法的另一种形式
public class Backtrack01 implements Main {

  int res = 0;

  @Override
  public int findTargetSumWays(int[] nums, int S) {
    backtrack(nums, S, 0);
    return res;
  }

  // rest = S - nums[idx]
  private void backtrack(int[] nums, int rest, int idx) {
    int n = nums.length;
    if (idx == n) {
      if (rest == 0) res++;
      return;
    }
    rest += nums[idx];
    backtrack(nums, rest, idx + 1);
    rest-= nums[idx];
    rest-= nums[idx];
    backtrack(nums, rest, idx + 1);
    rest += nums[idx];
  }
}
