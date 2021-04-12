package org.vny.leetcode.problems.p0567;

public class Naive01 implements Main {

  // running time beat 99% of users
  // using space beat 86% of users
  @Override
  public boolean checkInclusion(String s1, String s2) {
    char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
    int m = a1.length, n = a2.length;
    int[] hash = new int[128];
    for (char c : a1) {
      hash[c]--;
    }
    for (int left = 0, right = 0, cnt = 0; right < n; right++) {
      hash[a2[right]]++;
      if (hash[a2[right]] <= 0) cnt++;
      while (cnt == m && hash[a2[left]] > 0) hash[a2[left++]]--;
      if (cnt == m && right - left + 1 == m) return true;
    }
    return false;
  }
}
