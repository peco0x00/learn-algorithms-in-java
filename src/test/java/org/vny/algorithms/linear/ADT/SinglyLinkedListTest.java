package org.vny.algorithms.linear.ADT;

import org.junit.Test;
import org.vny.algorithms.linear.ADT.LinkedList;
import org.vny.algorithms.linear.ADT.Node;

public class SinglyLinkedListTest {

  @Test
  public void test() {
    Node head = new Node(-1);
    head.next = new Node(1);
    head.next.next = new Node(2);
    head.next.next.next = new Node(3);
    head.next.next.next.next = new Node(4);

    LinkedList main = new LinkedList();
    main.insert(head, 0, 100);
    main.insert(head, 4, 200);
    main.insert(head, 1, 300);
    main.print(head);
    main.remove(head, 0);
    main.remove(head, 5);
    main.remove(head, 2);
    main.print(head);
    main.reverse(head);
    main.print(head);
  }
}

