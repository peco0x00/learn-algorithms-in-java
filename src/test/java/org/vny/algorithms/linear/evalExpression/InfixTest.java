package org.vny.algorithms.linear.evalExpression;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InfixTest {

  @Test
  public void evalInfix() {
    Infix main = new Infix();
    String[] tokens = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )".split("\\s");
    double res = main.evalInfix(tokens);
    double ans = 101;
    assertEquals(ans, res, 0.1);
  }
}
