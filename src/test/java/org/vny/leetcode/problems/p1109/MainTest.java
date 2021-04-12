package org.vny.leetcode.problems.p1109;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void corpFlightBookings() {
    Main main = new Naive();
    int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
    int n = 5;
    int[] res = main.corpFlightBookings(bookings, n);
    int[] ans = {10, 55, 45, 25, 25};
    System.out.println(Arrays.toString(res));
    assertArrayEquals(ans, res);
  }
}
