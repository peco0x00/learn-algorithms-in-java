package org.vny.algorithms.linear.ADT;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

  @Test
  public void test() {
    ArrayQueue q =  new ArrayQueue(5);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    assertEquals(5, q.size());
    q.print();
    q.dequeue();
    assertEquals(4, q.size());
    q.print();
  }
}
