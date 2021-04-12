package org.vny.leetcode.problems.p1094;

public class Naive implements Main {

  @Override
  public boolean carPooling(int[][] trips, int capacity) {
    int[] diff = new int[1000];
    for (int[] trip : trips) {
      diff[trip[1]] += trip[0];
      diff[trip[2]] -= trip[0];
    }
    // get the passenger count
    int[] caps = new int[diff.length];
    caps[0] = diff[0];
    for (int i = 1; i < diff.length; i++) {
      caps[i] = diff[i] + caps[i - 1];
      if (caps[i] > capacity) return false;
    }
    return true;
  }
}
