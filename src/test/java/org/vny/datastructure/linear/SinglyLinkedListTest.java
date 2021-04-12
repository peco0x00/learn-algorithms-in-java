package org.vny.datastructure.linear;

import org.junit.Test;

public class SinglyLinkedListTest {

  @Test
  public void test() {
    SinglyLinkedList<Integer> lst = new SinglyLinkedList<>();
    lst.add(1);
    lst.add(2);
    lst.add(3);
    lst.add(4);

    lst.add(0, 100);
    lst.add(lst.size(), 200);
    lst.add(1, 300);
    System.out.println(lst);

    lst.remove();
    lst.remove(0);
    lst.remove(lst.size() - 1);
    lst.remove(1);
    System.out.println(lst);
  }
}
