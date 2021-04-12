package org.vny.algorithms.linear.ADT;

import org.junit.Test;
import org.vny.algorithms.linear.ADT.DoublyLinkedList;
import org.vny.algorithms.linear.ADT.Node;

public class DoublyLinkedListTest {

  @Test
  public void test() {
    Node head = new Node(-1);
    Node tail = new Node(-1);
    head.next = tail;
    tail.prev = head;
    DoublyLinkedList main = new DoublyLinkedList();

    main.insert(head, tail, 0, 1);
    main.insert(head, tail, 0, 2);
    main.insert(head, tail, 0, 3);
    main.insert(head, tail, 0, 4);
    main.insert(head, tail, 0, 5);
    main.insert(head, tail, 0, 6);
    main.print(head, tail);
    main.remove(head, tail, 0);
    main.remove(head, tail, 5);
    main.remove(head, tail, 1);
    main.print(head, tail);
    main.reverse(head, tail);
    main.print(head, tail);
  }
}
