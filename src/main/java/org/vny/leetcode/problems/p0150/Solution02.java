package org.vny.leetcode.problems.p0150;

public class Solution02 implements Main {

  // using array to simulate stack
  // we need to ensure the init size of the array
  /*
  * for a polish notation which length = n:
  * count(operator) == count(number) + 1
  * count(operator) = (n + 1) / 2, count(number) = (n - 1) / 2
  * if (token is operator): stack.size + 1
  * if (token is number): stack.size - 2 + 1 => stack.size - 1
  * */
  @Override
  public int evalRPN(String[] tokens) {
    int n = tokens.length;
    int[] stack = new int[(n + 1) / 2];
    int idx = - 1;
    for (String token : tokens) {
      switch (token) {
        case "+":
          idx--;
          stack[idx] += stack[idx + 1];
          break;
        case "-":
          idx--;
          stack[idx] -= stack[idx + 1];
          break;
        case "*":
          idx--;
          stack[idx] *= stack[idx + 1];
          break;
        case "/":
          idx--;
          stack[idx] /= stack[idx + 1];
          break;
        default:
          idx++;
          stack[idx] = Integer.parseInt(token);
      }
    }
    return stack[idx];
  }
}
