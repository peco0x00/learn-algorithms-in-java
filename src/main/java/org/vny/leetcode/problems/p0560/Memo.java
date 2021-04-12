package org.vny.leetcode.problems.p0560;

import java.util.HashMap;
import java.util.Map;

public class Memo implements Main {

  @Override
  public int subarraySum(int[] nums, int k) {
    int n = nums.length;
    // <prefixSum, prefixSum count>
    Map<Integer, Integer> memo = new HashMap<>();
    memo.put(0, 1);
    int count = 0, pre = 0;
    // construct prefix sum
    // and calculate the count in the mean time
    for (int num : nums) {
      pre += num;           // sum[i]
      if (memo.containsKey(pre - k)) {
        count += memo.get(pre - k);
      }
      memo.put(pre, memo.getOrDefault(pre, 0) + 1);
    }
    return count;
  }
}
