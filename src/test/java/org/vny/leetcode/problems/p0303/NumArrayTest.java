package org.vny.leetcode.problems.p0303;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumArrayTest {

  @Test
  public void sumRange() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    // NumArray na = new Naive(nums);
    NumArray na = new PrefixSum(nums);

    int l1 = 0, r1 = 2;
    int res1 = na.sumRange(l1, r1);
    int ans1 = 1;
    assertEquals(ans1, res1);

    int l2 = 2, r2 = 5;
    int res2 = na.sumRange(l2, r2);
    int ans2 = -1;
    assertEquals(ans2, res2);

    int l3 = 0, r3 = 5;
    int res3 = na.sumRange(l3, r3);
    int ans3 = -3;
    assertEquals(ans3, res3);
  }
}
