package org.vny.leetcode.problems.p0062;

import java.util.ArrayList;
import java.util.List;

public class Naive implements Main {

  // using space too much
  // also too slow
  @Override
  public int uniquePaths(int m, int n) {
    List<List<int[]>> res = new ArrayList<>();
    List<int[]> track = new ArrayList<>();
    backtrack(res, track, 0, 0, m - 1, n - 1);
    return res.size();
  }

  private void backtrack(List<List<int[]>> res, List<int[]> track, int x, int y, int m, int n) {
    if (x == m && y == n) {
      res.add(new ArrayList<>(track));
      return;
    }
    if (x < m) {
      int[] right = new int[]{x + 1, y};
      if (!track.contains(right)) {
        track.add(right);
        backtrack(res, track, x + 1, y, m, n);
        track.remove(track.size() - 1);
      }
    }
    if (y < n) {
      int[] down = new int[]{x, y + 1};
      if (!track.contains(down)) {
        track.add(down);
        backtrack(res, track, x, y + 1, m, n);
        track.remove(track.size() - 1);
      }
    }
  }
}
