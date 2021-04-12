package org.vny.algorithms.linear.evalExpression;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Prefix {

  public String infixToPrefix(String infix) {
    int n = infix.length();
    char[] arr = infix.toCharArray();
    Stack<Character> s1 = new Stack<>();
    Stack<Character> s2 = new Stack<>();
    for (int i = n - 1; i >= 0; i--) {
      char ch = arr[i];
      if (Character.isDigit(ch)) {
        s2.push(ch);
      } else if (ch == ')') {
        s1.push(ch);
      } else if (ch == '(') {
        char tmp;
        while ((tmp = s1.pop()) != ')') {
          s2.push(tmp);
        }
      } else if (s1.isEmpty() || compare(ch, s1.peek()) >= 0) {
        s1.push(ch);
      } else {
        s2.push(s1.pop());
        i++;
      }
    }
    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }
    StringBuilder r = new StringBuilder();
    while (!s2.isEmpty()) {
      r.append(s2.pop());
      if (!s2.isEmpty()) r.append(' ');
    }
    return r.toString();
  }

  public int compare(char o1, char o2) {
    switch (o1) {
      case '+':
      case '-':
        return (o2 == '*' || o2 == '/' ? -1 : 0);
      case '*':
      case '/':
        return (o2 == '+' || o2 == '-' ? -1 : 0);
    }
    return 1;
  }

  public int evalPrefix(String[] prefix) {
    Deque<Integer> sk = new LinkedList<>();
    int n = prefix.length;
    for (int i = n - 1; i >= 0; i--) {
      String s = prefix[i];
      if (isNumber(s)) sk.push(Integer.parseInt(s));
      else {
        int n1 = sk.pop();
        int n2 = sk.pop();
        switch (s) {
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
    return !(s.equals("+") || s.equals("-")
        || s.equals("*") || s.equals("/"));
  }
}
