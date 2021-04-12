package org.vny.algorithms.linear.evalExpression;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixTest {

  @Test
  public void infixToPrefix() {
    Prefix main = new Prefix();
    String input = "1+((2+3)*4)-5";
    String res = main.infixToPrefix(input);
    String ans = "- + 1 * + 2 3 4 5";
    assertEquals(ans, res);
  }

  @Test
  public void evalPrefix() {
    Prefix main = new Prefix();
    String[] input = {"-", "*", "+", "3", "4", "5", "6"};
    int res = main.evalPrefix(input);
    int ans = 29;
    assertEquals(ans, res);
  }
}
