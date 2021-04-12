package org.vny.algorithms.linear.evalExpression;

import java.util.Deque;
import java.util.LinkedList;

public class Suffix {

  public String inFixToSuffix(String inFix) {
    Deque<Character> s1 = new LinkedList<>();
    Deque<Character> s2 = new LinkedList<>();
    char[] arr = inFix.toCharArray();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      char ch = arr[i];
      if (Character.isDigit(ch)) {
        s2.push(ch);
      } else if (ch == '(') {
        s1.push(ch);
      } else if (ch == ')') {
        char tmp;
        while ((tmp = s1.pop()) != '(') {
          s2.push(tmp);
        }
      } else if (s1.isEmpty() || s1.peek() == '(' || compare(ch, s1.peek()) > 0) {
        s1.push(ch);
      } else {
        s2.push(s1.pop());
        i--;
      }
    }
    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }
    StringBuilder res = new StringBuilder();
    while (!s2.isEmpty()) {
      res.append(s2.pop());
      if (!s2.isEmpty()) res.append(' ');
    }
    return res.reverse().toString();
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

  public int evalSuffix(String[] suffix) {
    Deque<Integer> sk = new LinkedList<>();
    for (String s : suffix) {
      if (isNumber(s)) sk.push(Integer.parseInt(s));
      else {
        int n2 = sk.pop();
        int n1 = sk.pop();
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
