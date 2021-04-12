package org.vny.leetcode.problems.p0150;

import java.util.Stack;

public class Naive implements Main {

  // running time beat 5% of users
  // using space beat 5% of users
  // awful...
  // learning something new:
  // we should use Deque instead of Stack when we need a LIFO structure
  // because Stack is implementation of Vector, which has a bad performance
  @Override
  public int evalRPN(String[] tokens) {
    Stack<String> sk = new Stack<>();
    for (String s : tokens) {
      if (s.chars().allMatch(Character::isDigit) || s.charAt(0) == '-' && s.length() > 1) {
        sk.push(s);
      } else {
        String s1 = sk.pop();
        String s2 = sk.pop();
        sk.push(eval(s2, s1, s));
      }
    }
    return Integer.parseInt(sk.pop());
  }

  private String eval(String s1, String s2, String opt) {
    int n1 = Integer.parseInt(s1);
    int n2 = Integer.parseInt(s2);
    int res = 0;
    char o = opt.charAt(0);
    switch (o) {
      case '+':
        res = n1 + n2;
        break;
      case '-':
        res = n1 - n2;
        break;
      case '*':
        res = n1 * n2;
        break;
      case '/':
        res = n1 / n2;
        break;
    }
    return "" + res;
  }
}
