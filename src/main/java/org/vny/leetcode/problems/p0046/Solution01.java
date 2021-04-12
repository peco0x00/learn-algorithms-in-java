package org.vny.leetcode.problems.p0046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution01 implements Main {

  // 将问题看作向n个空格中填入nums个数，且不能重复使用
  @Override
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> output = new ArrayList<>();
    for (int num : nums) {
      output.add(num);
    }
    int n = nums.length;
    backtrack(n, output, res, 0);
    return res;
  }

  // bt(first, output) -> 从左往右填到第first个位置，当前排列为output
  public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
    // 所有数都填完了
    if (first == n) {
      res.add(new ArrayList<>(output));
    }
    // 考虑第first个位置应该填哪个数
    // 可以将给定的n个数的数组nums划分为左右两部分，左边的表示已经填过，右边的是待填的
    // 我们需要在回溯时动态维护该数组即可
    // unused:  [0, first - 1]
    // used:    [first, n - 1]
    // i -> 待填的数
    for (int i = first; i < n; i++) {
      // 动态维护数组
      Collections.swap(output, first, i);
      // 继续递归填下一个数
      backtrack(n, output, res, first + 1);
      // 撤销操作
      Collections.swap(output, first, i);
    }
  }
}
