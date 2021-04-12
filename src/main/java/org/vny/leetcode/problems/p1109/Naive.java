package org.vny.leetcode.problems.p1109;

public class Naive implements Main {

  @Override
  public int[] corpFlightBookings(int[][] bookings, int n) {
    int[] diff = new int[n + 1];
    for (int[] nums : bookings) {
      diff[nums[0] - 1] += nums[2];
      diff[nums[1]] -= nums[2];
    }
    int[] ans = new int[n];
    ans[0] = diff[0];
    for (int i = 1; i < n; i++) {
      ans[i] = diff[i] + ans[i - 1];
    }
    return ans;
  }
}
