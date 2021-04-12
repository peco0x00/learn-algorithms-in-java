package org.vny.leetcode.problems.p0224;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void calculate() {
    Main main = new Naive();
    String s = "(1+(4+5+2)-3)+(6+8)";
    int res = main.calculate(s);
    int ans = 23;
    assertEquals(ans, res);
  }

  @Test
  public void test() {
  }
}
