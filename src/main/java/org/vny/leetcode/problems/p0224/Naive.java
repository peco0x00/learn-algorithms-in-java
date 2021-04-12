package org.vny.leetcode.problems.p0224;

import java.util.Deque;
import java.util.LinkedList;

public class Naive implements Main {

  /*
  * because the operator has only '+' and '-'
  * so if unfold all the brackets, numbers won't change
  * just the sign before numbers will change
  * for example: 1 - (1 + 2) => 1 - 1 - 2
  * so, we can use an integer sign {1, -1} to replace the operator
  * */
  @Override
  public int calculate(String s) {
    Deque<Integer> ops = new LinkedList<>();
    ops.push(1);
    int sign = 1, res = 0, n = s.length(), i = 0;
    while (i < n && !ops.isEmpty()) {
      if (s.charAt(i) == ' ') i++;
      else if (s.charAt(i) == '+') {
        sign = ops.peek();
        i++;
      } else if (s.charAt(i) == '-') {
        sign = -ops.peek();
        i++;
      } else if (s.charAt(i) == '(') {
        ops.push(sign);
        i++;
      } else if (s.charAt(i) == ')') {
        ops.pop();
        i++;
      } else {
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
          num = num * 10 + s.charAt(i) - '0';
          i++;
        }
        res += sign * num;
      }
    }
    return res;
  }
}
