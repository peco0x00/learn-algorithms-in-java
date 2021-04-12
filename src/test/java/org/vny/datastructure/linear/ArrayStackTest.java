package org.vny.datastructure.linear;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

  @Test
  public void test() {
    ArrayStack<Integer> sk = new ArrayStack<>();
    sk.push(1);
    sk.push(2);
    sk.push(3);
    sk.push(4);
    sk.push(5);
    for (Integer i : sk) {
      System.out.println(i);
    }
  }
}
