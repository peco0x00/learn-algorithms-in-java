package org.vny.leetcode.problems.p0046;

import java.util.LinkedList;
import java.util.List;

public class Naive implements Main {

  List<List<Integer>> res = new LinkedList<>();

  @Override
  public List<List<Integer>> permute(int[] nums) {
    LinkedList<Integer> track = new LinkedList<>();
    backtrack(nums, track);
    return res;
  }

  private void backtrack(int[] nums, LinkedList<Integer> track) {
    if (track.size() == nums.length) {
      res.add(new LinkedList<>(track));
      return;
    }
    for (int num : nums) {
      if (track.contains(num)) continue;
      track.add(num);
      backtrack(nums, track);
      track.removeLast();
    }
  }
}
