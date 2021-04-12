package org.vny.leetcode.problems.p0150;

public class Solution03 implements Main {

  int index = 0;

  @Override
  public int evalRPN(String[] tokens) {
    index = tokens.length - 1;
    return helper(tokens);
  }

  private int helper(String[] tokens) {
    String token = tokens[index--];
    if (token.equals("+")) {
      int n1 = helper(tokens);
      int n2 = helper(tokens);
      return n1 + n2;
    }
    if (token.equals("-")) {
      int n1 = helper(tokens);
      int n2 = helper(tokens);
      return n2 - n1;
    }
    if (token.equals("*")) {
      int n1 = helper(tokens);
      int n2 = helper(tokens);
      return n1 * n2;
    }
    if (token.equals("/")) {
      int n1 = helper(tokens);
      int n2 = helper(tokens);
      return n2 / n1;
    }
    return Integer.parseInt(token);
  }
}
