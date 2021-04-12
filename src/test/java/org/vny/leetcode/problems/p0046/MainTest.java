package org.vny.leetcode.problems.p0046;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void permute() {
    // Main main = new Naive();
    Main main = new Solution01();
    int[] nums = {1, 2, 3};
    List<List<Integer>> res = main.permute(nums);
    System.out.println(res);
  }
}
