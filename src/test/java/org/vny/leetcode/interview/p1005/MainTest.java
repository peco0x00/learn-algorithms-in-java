package org.vny.leetcode.interview.p1005;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void findString() {
    Main main = new Naive01();
    String[] words =
        {"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""};
    String s1 = "ta";
    int res1 = main.findString(words, s1);
    int ans1 = -1;
    assertEquals(ans1, res1);

    String s2 = "ball";
    int res2 = main.findString(words, s2);
    int ans2 = 4;
    assertEquals(ans2, res2);

    String[] words1 = {"DirNnILhARNS hOYIFB", "SM ", "YSPBaovrZBS", "evMMBOf", "mCrS", "oRJfjw gwuo", "xOpSEXvfI"};
    String s3 = "mCrS";
    int res3 = main.findString(words1, s3);
    int ans3 = 4;
    assertEquals(ans3, res3);
  }
}


