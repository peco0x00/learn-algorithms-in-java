package org.vny.datastructure.linear;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {

  @Test
  public void test() {
    DoublyLinkedList<Integer> lst = new DoublyLinkedList<>();
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);
    lst.add(0, 100);
    lst.add(lst.size(), 200);
    System.out.println(lst);
    lst.remove();
    lst.remove(0);
    lst.remove(1);
    System.out.println(lst);
    lst.reverse();
    System.out.println("----");
    System.out.println(lst);
  }
}
