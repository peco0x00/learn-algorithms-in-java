package org.vny.leetcode.problems.p0990;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void equationsPossible() {
    // Main main = new Naive();
    Main main = new Naive01();
    String[] input1 = {"a==b", "a!=b"};
    boolean res1 = main.equationsPossible(input1);
    boolean ans1 = false;
    assertEquals(ans1, res1);

    String[] input2 = {"b==a", "a==b"};
    boolean res2 = main.equationsPossible(input2);
    boolean ans2 = true;
    assertEquals(ans2, res2);

    String[] input3 = {"a==b", "b==c", "a==c"};
    boolean res3 = main.equationsPossible(input3);
    boolean ans3 = true;
    assertEquals(ans3, res3);

    String[] input4 = {"f==a","a==b","f!=e","a==c","b==e","c==f"};
    boolean res4 = main.equationsPossible(input4);
    boolean ans4 = false;
    assertEquals(ans4, res4);
  }
}
