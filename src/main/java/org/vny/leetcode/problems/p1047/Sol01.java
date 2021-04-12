package org.vny.leetcode.problems.p1047;

import java.util.Stack;

public class Sol01 implements Main {

  public String removeDuplicates(String S) {
    Stack<Character> stack = new Stack<>();
    stack.push(S.charAt(0));
    for (int i = 1; i < S.length(); i++) {
      if (stack.isEmpty()) stack.push(S.charAt(i));
      else if (stack.peek() == S.charAt(i)) stack.pop();
      else stack.push(S.charAt(i));
    }
    StringBuilder ret = new StringBuilder();
    while (!stack.isEmpty()) {
      ret.append(stack.pop());
    }
    return ret.reverse().toString();
  }
}
