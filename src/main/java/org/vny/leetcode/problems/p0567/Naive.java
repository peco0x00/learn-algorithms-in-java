package org.vny.leetcode.problems.p0567;

public class Naive implements Main {

  // solve this by myself!
  // running time beat 92% of users
  // using space beat 93% of users
  @Override
  public boolean checkInclusion(String s1, String s2) {
    char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
    int m = a1.length, n = a2.length;
    int left = 0, right = 0, size = 0;
    int[] window = new int[128];
    int[] memo = new int[128];
    for (char c : a1) {
      memo[c]++;
      if (memo[c] == 1) size++;
    }
    int match = 0;
    while (right < n) {
      char c1 = a2[right];
      if (memo[c1] > 0) {
        window[c1]++;
        if (window[c1] == memo[c1]) match++;
      }
      right++;
      while (match == size) {
        if (right - left == m) return true;
        char c2 = a2[left];
        if (memo[c2] > 0) {
          window[c2]--;
          if (window[c2] < memo[c2]) match--;
        }
        left++;
      }
    }
    return false;
  }
}
