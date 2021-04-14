package org.vny.leetcode.problems.p0128;

import java.util.HashMap;
import java.util.Map;

public class Solution02 implements Main {

  int count = 0;

  @Override
  public int longestConsecutive(int[] nums) {
    int n = nums.length;
    Map<Integer, Integer> id = new HashMap<>();
    for (int val : nums) {
      id.put(val, val);
    }
    count = id.size();
    for (int v : nums) {
      union(id, v, v + 1);
    }
    int max = 1;
    for (int v : nums) {
      // find(v) - v + 1 -> 在一个链中的每个元素与根节点的距离，最大值即为该链长度
      max = Math.max(max, find(id, v) - v + 1);
    }
    return max;
  }

  private Integer find(Map<Integer, Integer> id, int p) {
    if (!id.containsKey(p)) return null;
    while (p != id.get(p)) {
      id.put(id.get(p), id.get(id.get(p)));
      p = id.get(p);
    }
    return p;
  }

  private void union(Map<Integer, Integer> id, int p, int q) {
    Integer i = find(id, p);
    Integer j = find(id, q);
    if (i == null || j == null) return;
    if (i.equals(j)) return;
    id.put(i, j);
    count--;
  }
}
