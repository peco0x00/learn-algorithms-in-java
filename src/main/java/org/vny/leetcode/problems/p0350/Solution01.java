package org.vny.leetcode.problems.p0350;

import java.util.*;

public class Solution01 implements Main {

  @Override
  public int[] intersect(int[] nums1, int[] nums2) {
    int m = nums1.length, n = nums2.length;
    if (m > n) return intersect(nums2, nums1);
    Map<Integer, Integer> memo = new HashMap<>();
    for (int val : nums1) {
      int count = memo.getOrDefault(val, 0) + 1;
      memo.put(val, count);
    }
    int[] res = new int[nums1.length];
    int idx = 0;
    for (int num : nums2) {
      int count = memo.getOrDefault(num, 0);
      if (count > 0) {
        res[idx++] = num;
        count--;
        if (count > 0) {
          memo.put(num, count);
        } else {
          memo.remove(num);
        }
      }
    }
    return Arrays.copyOfRange(res, 0, idx);
  }
}
