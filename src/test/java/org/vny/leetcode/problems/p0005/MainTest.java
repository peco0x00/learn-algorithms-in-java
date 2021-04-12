package org.vny.leetcode.problems.p0005;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void longestPalindrome() {
    // Main main = new Naive();
    // Main main = new Naive01();
    Main main = new Solution02();
    String s1 = "babad";
    String res1 = main.longestPalindrome(s1);
    String ans1 = "bab";
    assertEquals(ans1, res1);

    String s2 = "cbbd";
    String res2 = main.longestPalindrome(s2);
    String ans2 = "bb";
    assertEquals(ans2, res2);

    String s3 = "a";
    String res3 = main.longestPalindrome(s3);
    String ans3 = "a";
    assertEquals(ans3, res3);

    String s4 = "abb";
    String res4 = main.longestPalindrome(s4);
    String ans4 = "bb";
    assertEquals(ans4, res4);
  }

  @Test
  public void test() {
    Naive main = new Naive();
    String s1 = "abbd";
    String s2 = "abaab";
    System.out.println(main.satisfied(s1.toCharArray(), 1, s1.length() - 1));
    System.out.println(main.satisfied(s2.toCharArray(), 1, s2.length() - 1));
  }
}
