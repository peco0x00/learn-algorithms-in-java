package org.vny.algorithms.linear.ADT;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedDequeTest {

  @Test
  public void test() {
    LinkedDeque q = new LinkedDeque();
    q.addLast(2);
    q.addLast(3);
    q.addLast(4);
    q.addLast(5);
    q.addFirst(1);
    System.out.println(q.size());
    q.print();
    q.printReverse();
    q.removeFirst();
    q.removeLast();
    q.print();
  }
}
