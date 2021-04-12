package org.vny.leetcode.problems.p0150;

import java.util.Deque;
import java.util.LinkedList;

public class Solution01 implements Main {

  @Override
  public int evalRPN(String[] tokens) {
    Deque<Integer> sk = new LinkedList<>();
    int n = tokens.length;
    for (String token : tokens) {
      if (isNumber(token)) {
        sk.push(Integer.parseInt(token));
      } else {
        int n2 = sk.pop();
        int n1 = sk.pop();
        switch (token) {
          case "+":
            sk.push(n1 + n2);
            break;
          case "-":
            sk.push(n1 - n2);
            break;
          case "*":
            sk.push(n1 * n2);
            break;
          case "/":
            sk.push(n1 / n2);
            break;
        }
      }
    }
    return sk.pop();
  }

  private boolean isNumber(String s) {
    return !("+".equals(s) || "-".equals(s)
        || "*".equals(s) || "/".equals(s));
  }
}
