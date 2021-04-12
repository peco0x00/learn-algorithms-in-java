package org.vny.leetcode.problems.p0010;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void test() {
    // Main main = new Naive();
    // Main main = new Recursive();
    // Main main = new Memo();
    Main main = new Dynamic();

    String s1 = "mississippi";
    String p1 = "mis*is*p*.";
    boolean res1 = main.isMatch(s1, p1);
    boolean ans1 = false;
    assertEquals(ans1, res1);

    String s2 = "aab";
    String p2 = "c*a*b";
    boolean res2 = main.isMatch(s2, p2);
    boolean ans2 = true;
    assertEquals(ans2, res2);

    String s3 = "ab";
    String p3 = ".*";
    boolean res3 = main.isMatch(s3, p3);
    boolean ans3 = true;
    assertEquals(ans3, res3);
    // assertEquals(1, 12);

    System.out.println("hello test!!!");
  }
}
