package org.vny.leetcode.problems.p0047;

import java.util.*;

public class Naive implements Main {

  @Override
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int n = nums.length;
    List<Integer> output = new ArrayList<>();
    for (int i : nums) {
      output.add(i);
    }
    backtrack(res, output, 0, n);
    // 简单将结果去重，效果很差
    LinkedHashSet<List<Integer>> r = new LinkedHashSet<>(res);
    res.clear();
    res.addAll(r);
    return res;
  }

  private void backtrack(List<List<Integer>> res, List<Integer> output, int first, int n) {
    if (first == n) {
      res.add(new ArrayList<>(output));
      return;
    }
    for (int i = first; i < n; i++) {
      Collections.swap(output, i, first);
      backtrack(res, output, first + 1, n);
      Collections.swap(output, i, first);
    }
  }
}
