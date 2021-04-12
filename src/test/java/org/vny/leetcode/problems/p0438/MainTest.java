package org.vny.leetcode.problems.p0438;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void findAnagrams() {
    // Main main = new Naive();
    Main main = new Naive01();
    String s = "cbaebabacd", p = "abc";
    List<Integer> res = main.findAnagrams(s, p);
    List<Integer> ans = Arrays.asList(0, 6);
    assertEquals(ans, res);
  }
}
