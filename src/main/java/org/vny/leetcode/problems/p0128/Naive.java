package org.vny.leetcode.problems.p0128;

import java.util.Map;
import java.util.TreeMap;

public class Naive implements Main {

  int count = 0;

  // didn't solve this by using union-find
  // so sad...
  @Override
  public int longestConsecutive(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    count = n;
    Map<Integer, Integer> id = new TreeMap<>();
    for (int num : nums) {
      id.put(num, num);
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (Math.abs(nums[i] - nums[j]) == 1) {
          union(id, nums[i], nums[j]);
        }
      }
    }
    int max = 0, pre = Integer.MIN_VALUE, i = 0;
    int[] a = new int[n];
    for (Integer key : id.keySet()) {
      if (pre == Integer.MIN_VALUE || find(id, key) != find(id, pre)) {
        a[i++]++;
      } else {
        a[i - 1]++;
      }
      pre = key;
    }
    for (int j : a) {
      max = Math.max(max, j);
    }
    return max;
  }

  private int find(Map<Integer, Integer> id, int p) {
    while (p != id.get(p)) {
      id.put(id.get(p), id.get(id.get(p)));
      p = id.get(p);
    }
    return p;
  }

  private void union(Map<Integer, Integer> id, int p, int q) {
    int i = find(id, p);
    int j = find(id, q);
    if (i == j) return;
    id.put(i, j);
    count--;
  }
}
