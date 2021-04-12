package org.vny.leetcode.problems.p0438;

import java.util.ArrayList;
import java.util.List;

public class Naive01 implements Main {

  @Override
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    char[] as = s.toCharArray(), ap = p.toCharArray();
    int m = as.length, n = ap.length;
    int[] hash = new int[128];
    for (char c : ap) hash[c]--;
    for (int left = 0, right = 0, cnt = 0; right < m; right++) {
      hash[as[right]]++;
      if (hash[as[right]] <= 0) cnt++;
      while (cnt == n && hash[as[left]] > 0) hash[as[left++]]--;
      if (cnt == n && right - left + 1 == n) res.add(left);
    }
    return res;
  }
}
