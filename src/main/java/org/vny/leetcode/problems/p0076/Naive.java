package org.vny.leetcode.problems.p0076;

import java.util.HashMap;
import java.util.Map;

public class Naive implements Main {

  @Override
  public String minWindow(String s, String t) {
    int m = s.length(), n = t.length();
    char[] as = s.toCharArray(), at = t.toCharArray();
    int left = 0, right = 0;
    int start = 0, minLen = Integer.MAX_VALUE;
    int[] window = new int[128];
    Map<Character, Integer> map = new HashMap<>();
    for (char c : at) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    int match = 0;
    while (right < m) {
      char c1 = as[right];
      if (map.containsKey(c1)) {
        window[c1]++;
        if (window[c1] == map.get(c1)) match++;
      }
      right++;
      while (match == map.size()) {
        if (right - left < minLen) {
          start = left;
          minLen = right - left;
        }
        char c2 = as[left];
        if (map.containsKey(c2)) {
          window[c2]--;
          if (window[c2] < map.get(c2)) match--;
        }
        left++;
      }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, minLen + start);
  }
}
