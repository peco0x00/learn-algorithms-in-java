package org.vny.algorithms.linear.evalExpression;

import java.util.Deque;
import java.util.LinkedList;

public class Infix {

  /**
   * @param tokens: the input expression
   *              assume not omit the '()'
   *              such as: (1 + (2 * 3))
   *              not (1 + 2 * 3)
   * @return the result of the expression
   * */
  public double evalInfix(String[] tokens) {
    Deque<String> ops = new LinkedList<>();
    Deque<Double> vals = new LinkedList<>();
    for (String token : tokens) {
      if (token.equals("(")) ;
      else if (token.equals("+")) ops.push(token);
      else if (token.equals("-")) ops.push(token);
      else if (token.equals("*")) ops.push(token);
      else if (token.equals("/")) ops.push(token);
      else if (token.equals("sqrt")) ops.push(token);
      else if (token.equals(")")) {
        String op = ops.pop();
        double v = vals.pop();
        if (op.equals("+")) v = vals.pop() + v;
        else if (op.equals("-")) v = vals.pop() - v;
        else if (op.equals("*")) v = vals.pop() * v;
        else if (op.equals("/")) v = vals.pop() / v;
        else if (op.equals("sqrt")) v = Math.sqrt(v);
        vals.push(v);
      } else vals.push(Double.parseDouble(token));
    }
    return vals.pop();
  }
}
