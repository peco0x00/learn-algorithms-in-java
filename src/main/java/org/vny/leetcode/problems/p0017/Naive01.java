package org.vny.leetcode.problems.p0017;

import java.util.ArrayList;
import java.util.List;

public class Naive01 implements Main {

  char[][] memo = {
      {'a', 'b', 'c'},
      {'d', 'e', 'f'},
      {'g', 'h', 'i'},
      {'j', 'k', 'l'},
      {'m', 'n', 'o'},
      {'p', 'q', 'r', 's'},
      {'t', 'u', 'v'},
      {'w', 'x', 'y', 'z'}
  };

  // also by myself, awesome!
  // running time beat 100% of users
  // using space beat 37.81 of users
  @Override
  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    char[] arr = digits.toCharArray();
    int n = arr.length;
    if (n == 0) return res;
    StringBuilder track = new StringBuilder();
    backtrack(res, arr, 0, track);
    return res;
  }

  private void backtrack(List<String> res, char[] arr, int idx, StringBuilder track) {
    int n = arr.length;
    if (idx == n) {
      res.add(track.toString());
      return;
    }
    char[] opt = memo[arr[idx] - '0' - 2];
    for (char c : opt) {
      track.append(c);
      backtrack(res, arr, idx + 1, track);
      track.deleteCharAt(track.length() - 1);
    }
  }
}
