package org.vny.algorithms.unionFind.alg4;

public class HeightQuickUnionUF implements UF {

  private int[] id;
  private int[] ht;
  private int count;

  public HeightQuickUnionUF(int N) {
    id = new int[N];
    ht = new int[N];
    count = N;
    for (int i = 0; i < N; i++) {
      id[i] = i;
      ht[i] = 0;
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
      p = id[p];
    }
    return p;
  }

  @Override
  public void union(int p, int q) {
    int i = find(p);
    int j = find(q);
    if (i == j) return;
    // 将高度小的树链接到高度高的树的根节点
    // 链接前后高树高度不变
    if (ht[i] < ht[j]) {
      id[i] = j;
    } else if (ht[i] > ht[j]) {
      id[j] = i;
    } else {
      // 当二者高度相同时，将一棵树链接到另一棵树的根节点
      // 此时被链接的树高度会+1
      id[j] = i;
      ht[i]++;
    }
    count--;
  }
}
