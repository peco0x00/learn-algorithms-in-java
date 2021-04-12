package org.vny.leetcode.problems.p1025;

public class Solution01 implements Main {

  @Override
  public boolean divisorGame(int n) {
    return (n & 1) == 0;
  }
}
