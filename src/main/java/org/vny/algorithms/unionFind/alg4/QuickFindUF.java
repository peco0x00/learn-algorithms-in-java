package org.vny.algorithms.unionFind.alg4;

public class QuickFindUF implements UF {

  // 分量id（以触点为索引）
  private int[] id;
  // 分量数量
  private int count;

  public QuickFindUF(int N) {
    count = N;
    id = new int[N];
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
    return id[p];
  }

  @Override
  public void union(int p, int q) {
    // 将p和q归并到相同的分量中
    int pID = find(p);
    int qID = find(q);
    // 如果p和q已经在相同分量中则不采取任何措施
    if (pID == qID) return;
    // 将p的分量重命名为q的名称
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pID) id[i] = qID;
    }
    // 两个分量合并后，总分量数量-1
    count--;
  }
}
