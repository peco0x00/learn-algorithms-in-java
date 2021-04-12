package org.vny.algorithms.unionFind.alg4;

import org.junit.Test;

import static org.junit.Assert.*;

public class UFTest {

  @Test
  public void test() {
    int N = 10;
    // UF uf = new QuickFindUF(N);
    // UF uf = new QuickUnionUF(N);
    // UF uf = new WeightedQuickUnionUF(N);
    // UF uf = new CompressionQuickUnionUF(N);
    UF uf = new CompressionWeightedQuickUnionUF(N);
    int[][] input = {
        {4, 3}, {3, 8}, {6, 5}, {9, 4}, {2, 1},
        {8, 9}, {5, 0}, {7, 2}, {6, 1}, {1, 0}, {6, 7},
    };
    for (int[] in : input) {
      int p = in[0];
      int q = in[1];
      if (uf.connected(p, q)) continue;
      uf.union(p, q);
      System.out.println(p + " " + q);
    }
    System.out.println(uf.count() + "components");
  }
}
