package org.vny.leetcode.problems.p0128;

import java.util.HashSet;
import java.util.Set;

public class Solution03 implements Main {

  @Override
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    int n = nums.length, max = 1;
    Set<Integer> set = new HashSet<>();
    for (int v : nums) {
      set.add(v);
    }
    for (int v : nums) {
      // 如果有比自己小的，则自己不查，让小的去查
      if (set.contains(v - 1)) continue;
      int r = v;    // r表示以v开头的链长度
      while (set.contains(r + 1)) r++;
      max = Math.max(max, r - v + 1);
    }
    return max;
  }
}
