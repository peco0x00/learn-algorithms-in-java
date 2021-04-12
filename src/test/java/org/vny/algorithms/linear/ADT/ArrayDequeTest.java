package org.vny.algorithms.linear.ADT;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDequeTest {

  @Test
  public void test() {
    ArrayDeque a = new ArrayDeque(5);
    a.addFirst(4);
    a.addFirst(3);
    a.addFirst(2);
    a.addFirst(1);
    a.addLast(5);
    a.print();
    a.removeFirst();
    a.removeLast();
    assertEquals(3, a.size());
    a.print();
  }
}
