package org.vny.algorithms.unionFind.alg4;

public class CompressionWeightedQuickUnionUF implements UF {

  private int[] id;
  private int[] sz;
  private int count;

  public CompressionWeightedQuickUnionUF(int N) {
    id = new int[N];
    sz = new int[N];
    count = N;
    for (int i = 0; i < N; i++) {
      id[i] = i;
      sz[i] = 1;
    }
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
    while (p != id[p]) {
      id[p] = id[id[p]];
      p = id[p];
    }
    return p;
  }

  @Override
  public void union(int p, int q) {
    int pr = find(p);
    int qr = find(q);
    if (pr == qr) return;
    if (sz[pr] > sz[qr]) {
      id[qr] = pr;
      sz[pr] += sz[qr];
    } else {
      id[pr] = id[qr];
      sz[qr] += sz[pr];
    }
    count--;
  }
}
