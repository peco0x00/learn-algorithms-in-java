package org.vny.leetcode.problems.p0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Naive implements Main {

  @Override
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int n = nums.length;
    if (n == 0) return res;
    res.add(new ArrayList<>());
    List<Integer> self = new ArrayList<>();
    for (int i : nums) {
      self.add(i);
    }
    res.add(self);
    if (n == 1) return res;
    res.remove(self);
    boolean[] vis = new boolean[n];
    List<Integer> track = new ArrayList<>();
    backtrack(nums, res, vis, 0, track);
    return res;
  }

  private void backtrack(int[] nums, List<List<Integer>> res, boolean[] vis, int idx, List<Integer> track) {
    int n = nums.length;
    if (n == idx) return;
    for (int i = idx; i < n; i++) {
      if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
        continue;
      }
      track.add(nums[i]);
      vis[i] = true;
      res.add(new ArrayList<>(track));
      backtrack(nums, res, vis, idx + 1, track);
      vis[i] = false;
      track.remove(track.size() - 1);
    }
  }
}
