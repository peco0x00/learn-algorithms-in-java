package org.vny.algorithms.linear.ADT;

import org.junit.Test;
import org.vny.algorithms.linear.ADT.ArrayStack;

public class ArrayStackTest {

  @Test
  public void test() {
    ArrayStack sk = new ArrayStack(5);
    sk.push(10);
    sk.push(9);
    sk.push(8);
    sk.push(7);
    sk.push(6);
    sk.print();
    sk.pop();
    sk.print();
  }
}
