package org.vny.algorithms.linear.ADT;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedQueueTest {

  @Test
  public void test() {
    LinkedQueue q = new LinkedQueue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    System.out.println(q.size());
    q.print();
    q.dequeue();
    q.print();
  }
}
