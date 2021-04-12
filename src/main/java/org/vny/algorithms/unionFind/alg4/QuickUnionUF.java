package org.vny.algorithms.unionFind.alg4;

public class QuickUnionUF implements UF {

  private int[] id;
  private int count;

  public QuickUnionUF(int N) {
    id = new int[N];
    count = N;
    for (int i = 0; i < N; i++) {
      id[i] = i;
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
    // 找出根触点
    while (p != id[p]) p = id[p];
    return p;
  }

  @Override
  public void union(int p, int q) {
    int pRoot = find(p);
    int qRoot = find(q);
    if (pRoot == qRoot) return;
    // 将一个根触点链接到另一个根触点
    id[pRoot] = qRoot;
    count--;
  }
}
