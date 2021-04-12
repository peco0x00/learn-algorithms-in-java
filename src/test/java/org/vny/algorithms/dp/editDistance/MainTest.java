package org.vny.algorithms.dp.editDistance;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void minDistance() {
    // Main main = new Naive();
    // Main main = new Dynamic();
    Main main = new Compress();
    String word11 = "horse";
    String word21 = "ros";
    int res1 = main.minDistance(word11, word21);
    int ans1 = 3;
    assertEquals(ans1, res1);

    String word12 = "intention";
    String word22 = "execution";
    int res2 = main.minDistance(word12, word22);
    int ans2 = 5;
    assertEquals(ans2, res2);
  }
}
