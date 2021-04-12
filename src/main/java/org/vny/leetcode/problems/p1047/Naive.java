package org.vny.leetcode.problems.p1047;

public class Naive implements Main{

  public String removeDuplicates(String S) {
    int pos = index(S);
    if (pos == -1) return S;
    return removeDuplicates(S.substring(0, pos) + S.substring(pos + 2));
  }

  private int index(String S) {
    for (int i = 0; i < S.length() - 1; i++) {
      if (S.charAt(i) == S.charAt(i + 1)) return i;
    }
    return -1;
  }
}
