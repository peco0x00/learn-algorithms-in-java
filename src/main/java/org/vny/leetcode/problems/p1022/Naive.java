package org.vny.leetcode.problems.p1022;

import java.util.List;
import java.util.ArrayList;

public class Naive implements Main {

  // using backtrack
  // running time beat 23% of users
  // using space beat 21% of users
  // awful...
  @Override
  public int sumRootToLeaf(TreeNode root) {
    StringBuilder track = new StringBuilder();
    List<String> res = new ArrayList<>();
    track.append(root.val);
    backtrack(res, root, track);
    int sum = 0;
    for (String s : res) {
      sum += Integer.valueOf(s, 2);
    }
    return sum;
  }

  private void backtrack(List<String> res, TreeNode root, StringBuilder track) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
      res.add(track.toString());
      return;
    }
    if (root.left != null) {
      track.append(root.left.val);
      backtrack(res, root.left, track);
      track.deleteCharAt(track.length() - 1);
    }
    if (root.right != null) {
      track.append(root.right.val);
      backtrack(res, root.right, track);
      track.deleteCharAt(track.length() - 1);
    }
  }
}
