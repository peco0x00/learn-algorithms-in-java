package org.vny.leetcode.problems.p0128;

import java.util.HashSet;
import java.util.Set;

public class Solution01 implements Main {

  // 对于数组中的每个不存在num - 1的数num进行枚举
  // 检查num + 1, num + 2...是否存在于数组中
  @Override
  public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    int max = 0;
    for (Integer num : set) {
      if (!set.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;
        while (set.contains(currentNum + 1)) {
          currentNum++;
          currentStreak++;
        }
        max = Math.max(max, currentStreak);
      }
    }
    return max;
  }
}
