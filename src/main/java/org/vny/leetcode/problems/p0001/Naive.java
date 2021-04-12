package org.vny.leetcode.problems.p0001;

import java.util.HashMap;
import java.util.Map;

public class Naive implements Main {

  @Override
  public int[] twoSum(int[] nums, int target) {
    // Map<remain, remain_index>
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return new int[] {map.get(nums[i]), i};
      } else {
        map.put(target - nums[i], i);
      }
    }
    return null;
  }
}
