package org.vny.algorithms.dp.targetSum;

import java.util.HashMap;
import java.util.Map;

public class Memo implements Main {

  Map<String, Integer> memo = new HashMap<>();

  @Override
  public int findTargetSumWays(int[] nums, int S) {
    if (nums.length == 0) return 0;
    return dp(nums, 0, S);
  }

  private int dp(int[] nums, int idx, int rest) {
    // base case
    if (idx == nums.length) {
      if (rest == 0) return 1;
      return 0;
    }
    String key = idx + "," + rest;
    if (memo.containsKey(key)) return memo.get(key);
    int res = dp(nums, idx + 1, rest - nums[idx]) +
        dp(nums, idx + 1, rest + nums[idx]);
    memo.put(key, res);
    return res;
  }
}
