package org.vny.leetcode.problems.p0350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Naive implements Main {

  // solve this by myself, just so so...
  // running time beat 69% of users
  // using space beat 63% of users
  @Override
  public int[] intersect(int[] nums1, int[] nums2) {
    int m = nums1.length, n = nums2.length;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    List<Integer> vec = new ArrayList<>();
    int i = 0, j = 0;
    while (i < m && j < n) {
      if (nums1[i] == nums2[j]) {
        vec.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] > nums2[j]){
        j++;
      } else {
        i++;
      }
    }
    int[] res = new int[vec.size()];
    int idx = 0;
    for (Integer val : vec) {
      res[idx++] = val;
    }
    return res;
  }
}
