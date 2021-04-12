package org.vny.leetcode.problems.p1047;

public class Sol03 implements Main {

  public String removeDuplicates(String S) {
    char[] ret = S.toCharArray();
    int top = -1;
    for (int i = 0; i < S.length(); i++) {
      if (top == -1 || ret[top] != ret[i]) ret[++top] = ret[i];
      else top--;
    }
    return String.valueOf(ret, 0, top + 1);
  }
}
