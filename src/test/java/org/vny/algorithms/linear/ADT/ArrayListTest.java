package org.vny.algorithms.linear.ADT;

import org.junit.Test;
import org.vny.algorithms.linear.ADT.ArrayList;

public class ArrayListTest {

  @Test
  public void test() {
    ArrayList lst = new ArrayList();
    lst.insert(0, 1);
    lst.insert(1, 2);
    lst.insert(2, 3);
    lst.insert(0, 100);
    lst.insert(3, 200);
    lst.insert(1, 300);
    lst.print();

    lst.remove(0);
    lst.remove(4);
    lst.remove(1);
    lst.print();
    lst.reverse();
    lst.print();
  }
}
