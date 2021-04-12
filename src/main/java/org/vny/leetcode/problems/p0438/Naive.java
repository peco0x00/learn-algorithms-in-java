package org.vny.leetcode.problems.p0438;

import java.util.ArrayList;
import java.util.List;

public class Naive implements Main {

  // solve this by myself
  // running time beat 99% of users
  // using space beat 47% of users
  @Override
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    char[] as = s.toCharArray(), ap = p.toCharArray();
    int m = as.length, n = ap.length;
    int left = 0, right = 0, size = 0;
    int[] window = new int[128];
    int[] memo = new int[128];
    for (char c : ap) {
      memo[c]++;
      if (memo[c] == 1) size++;
    }
    int match = 0;
    while (right < m) {
      char c1 = as[right];
      if (memo[c1] > 0) {
        window[c1]++;
        if (memo[c1] == window[c1]) match++;
      }
      right++;
      while (match == size) {
        if (right - left == n) res.add(left);
        char c2 = as[left];
        if (memo[c2] > 0) {
          window[c2]--;
          if (window[c2] < memo[c2]) match--;
        }
        left++;
      }
    }
    return res;
  }
}
