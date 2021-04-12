package org.vny.algorithms.unionFind.alg4;

import java.util.Arrays;

public class DynamicWeightedQuickUnionUF implements UF {

  private int[] id;
  private int[] sz;
  private int count;

  public DynamicWeightedQuickUnionUF() {
    this(10);
  }

  public DynamicWeightedQuickUnionUF(int N) {
    id = new int[N];
    sz = new int[N];
    count = N;
    for (int i = 0; i < N; i++) {
      id[i] = i;
      sz[i] = 1;
    }
  }

  private void ensureCapacity(int newSize) {
    if (newSize < id.length) return;
    int oldSz = id.length;
    id = Arrays.copyOf(id, newSize);
    sz = Arrays.copyOf(sz, newSize);
    for (int i = oldSz; i < newSize; i++) {
      id[i] = i;
      sz[i] = 1;
    }
    count += newSize - oldSz;
  }

  public int newSite(int[] site) {
    return id.length;
  }

  @Override
  public int count() {
    return count;
  }

  @Override
  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }

  @Override
  public int find(int p) {
    if (p < 0 || p >= id.length) {
      ensureCapacity(2 * p + 1);
    }
    while (p != id[p]) {
      id[p] = id[id[p]];
      p = id[p];
    }
    return p;
  }

  @Override
  public void union(int p, int q) {
    int i = find(p);
    int j = find(q);
    if (i == j) return;
    if (sz[i] < sz[j]) {
      id[i] = j;
      sz[j] += sz[i];
    } else {
      id[j] = i;
      sz[i] += sz[j];
    }
  }
}
