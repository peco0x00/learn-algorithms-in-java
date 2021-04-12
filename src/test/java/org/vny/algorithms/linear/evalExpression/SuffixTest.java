package org.vny.algorithms.linear.evalExpression;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuffixTest {

  @Test
  public void evalSuffix() {
    Suffix main = new Suffix();
    String[] input = {"3", "4", "+", "5", "*", "6", "-"};
    int res = main.evalSuffix(input);
    int ans = 29;
    assertEquals(ans, res);
  }

  @Test
  public void inFixToSuffix() {
    Suffix main = new Suffix();
    String input = "1+((2+3)*4)-5";
    String res = main.inFixToSuffix(input);
    String ans = "1 2 3 + 4 * + 5 -";
    assertEquals(ans, res);
  }
}
