package org.vny.datastructure.linear;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {

  @Test
  public void test() {
    ArrayList<Integer> lst = new ArrayList<>();
    lst.add(10);
    lst.add(9);
    lst.add(0, 100);
    lst.add(3, 200);
    lst.add(1);
    lst.add(2);
    lst.add(3);
    for (Integer integer : lst) {
      System.out.printf("%d, ", integer);
    }
    System.out.println();
    lst.remove();
    lst.remove(0);
    lst.remove(2);
    for (Integer integer : lst) {
      System.out.printf("%d, ", integer);
    }
    System.out.println(lst);
  }
}
