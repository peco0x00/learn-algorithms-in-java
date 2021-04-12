package org.vny.leetcode.problems.p0224;

import java.util.Deque;
import java.util.LinkedList;

public class Solution01 implements Main {

  @Override
  public int calculate(String s) {
    return helper(s, 0, s.length())[0];
  }

  private int[] helper(String s, int index, int len) {
    if (index == len) return new int[]{0, index};
    int sum = 0, digit = 0;
    boolean addOp = true;
    while (index < len) {
      char c = s.charAt(index);
      if (c == ' ') {
        index++;
        continue;
      }
      if (c >= '0' && c <= '9') {
        digit *= 10;
        digit += c - '0';
      } else {
        if (addOp) {
          sum += digit;
        } else {
          sum -= digit;
        }
        digit = 0;
        if (c == '+') {
          addOp = true;
        } else if (c == '-') {
          addOp = false;
        } else if (c == '(') {
          int[] ret = helper(s, index + 1, len);
          index = ret[1];
          if (addOp) {
            sum += ret[0];
          } else {
            sum -= ret[0];
          }
        } else {
          return new int[]{sum, index};
        }
      }
      index++;
    }
    if (addOp) {
      sum += digit;
    } else {
      sum -= digit;
    }
    return new int[]{sum, len};
  }
}
