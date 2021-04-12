package org.vny.algorithms.unionFind.alg4;

public class WeightedQuickUnionUF implements UF {

  // 父链接数组（由触点索引）
  private int[] id;
  // (由触点索引的)各个根节点所对应的分量的大小
  private int[] sz;
  // 连通分量的数量
  private int count;

  public WeightedQuickUnionUF(int N) {
    count = N;
    id = new int[N];
    sz = new int[N];
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
    while (p != id[p]) p = id[p];
    return p;
  }

  @Override
  public void union(int p, int q) {
    int i = find(p);
    int j = find(q);
    if (i == j) return;
    // 将小树的根节点链接到大树的根节点
    if (sz[i] < sz[j]) {
      id[i] = j;
      sz[j] += sz[i];
    } else {
      id[j] = i;
      sz[i] += sz[j];
    }
    count--;
  }
}
