package org.vny.leetcode.problems.p0017;

import java.util.ArrayList;
import java.util.List;

public class Naive implements Main {

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

  // solve this by myself!
  // running time beat 83.47% of users
  // using space beat 32.97% of users
  @Override
  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    char[] arr = digits.toCharArray();
    int n = arr.length;
    if (n == 0) return res;
    List<Character> track = new ArrayList<>();
    backtrack(res, arr, 0, track);
    return res;
  }

  private void backtrack(List<String> res, char[] arr, int idx, List<Character> track) {
    int n = arr.length;
    if (idx == n) {
      res.add(convert(track));
      return;
    }
    char[] opt = memo[arr[idx] - '0' - 2];
    for (char c : opt) {
      track.add(c);
      backtrack(res, arr, idx + 1, track);
      track.remove(track.size() - 1);
    }
  }

  private String convert(List<Character> lst) {
    StringBuilder res = new StringBuilder();
    for (Character c : lst) {
      res.append(c);
    }
    return res.toString();
  }
}
