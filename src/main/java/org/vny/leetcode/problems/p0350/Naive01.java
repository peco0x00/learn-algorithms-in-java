package org.vny.leetcode.problems.p0350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Naive01 implements Main {

  @Override
  public int[] intersect(int[] nums1, int[] nums2) {
    int m = nums1.length, n = nums2.length;
    if (m < n) return intersect(nums2, nums1);
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int[] res = new int[n];
    int idx = 0;
    int i = 0, j = 0;
    while (i < m && j < n) {
      if (nums1[i] == nums2[j]) {
        res[idx++] = nums1[i];
        i++;
        j++;
      } else if (nums1[i] > nums2[j]){
        j++;
      } else {
        i++;
      }
    }
    return Arrays.copyOf(res, idx);
  }
}
