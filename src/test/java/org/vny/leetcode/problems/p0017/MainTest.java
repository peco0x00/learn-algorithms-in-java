package org.vny.leetcode.problems.p0017;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void letterCombinations() {
    // Main main = new Naive();
    // Main main = new Naive01();
    Main main = new Solution01();
    String d1 = "23";
    List<String> res1 = main.letterCombinations(d1);
    System.out.println(res1);

    String d2 = "";
    List<String> res2 = main.letterCombinations(d2);
    System.out.println(res2);

    String d3 = "2";
    List<String> res3 = main.letterCombinations(d3);
    System.out.println(res3);

    String d4 = "22";
    List<String> res4 = main.letterCombinations(d4);
    System.out.println(res4);
  }
}
