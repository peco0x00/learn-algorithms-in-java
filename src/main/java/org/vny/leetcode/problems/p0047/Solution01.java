package org.vny.leetcode.problems.p0047;

import java.util.*;

public class Solution01 implements Main {

  /*
  * 分析问题时：画出决策树，且在每个节点上标注状态
  * */
  @Override
  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int n = nums.length;
    // vis[i] -> nums[i] has been used on a branch of the tree
    boolean[] vis = new boolean[n];
    Arrays.sort(nums);
    List<Integer> track = new ArrayList<>();
    backtrack(nums, res, track, vis, 0);
    return res;
  }

  private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> track, boolean[] vis, int idx) {
    int n = nums.length;
    if (idx == n) {
      res.add(new ArrayList<>(track));
      return;
    }
    for (int i = 0; i < n; i++) {
      // the only situation nums[i] can be used when nums[i] == nums[i - 1] is:
      // nums[i - 1] has been used
      if (vis[i] || ((i > 0) && nums[i] == nums[i - 1] && !vis[i - 1])) {
        continue;
      }
      track.add(nums[i]);
      vis[i] = true;
      backtrack(nums, res, track, vis, idx + 1);
      vis[i] = false;
      track.remove(idx);
    }
  }
}
