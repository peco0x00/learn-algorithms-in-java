package org.vny.leetcode.problems.p1047;

public class Sol02 implements Main {

  public String removeDuplicates(String S) {
    StringBuilder stack = new StringBuilder();
    int top = -1;
    for (int i = 0; i < S.length(); i++) {
      if (top >= 0 && stack.charAt(top) == S.charAt(i)) stack.deleteCharAt(top--);
      else {
        stack.append(S.charAt(i));
        top++;
      }
    }
    return stack.toString();
  }
}
