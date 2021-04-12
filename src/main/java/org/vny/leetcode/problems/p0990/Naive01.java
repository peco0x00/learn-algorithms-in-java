package org.vny.leetcode.problems.p0990;

public class Naive01 implements Main {

  @Override
  public boolean equationsPossible(String[] equations) {
    int[] parent = new int[26];
    int[] sz = new int[26];
    for (int i = 0; i < 26; i++) {
      parent[i] = i;
      sz[i] = 1;
    }
    for (String s : equations) {
      if (s.charAt(1) == '=') {
        int x = s.charAt(0) - 'a';
        int y = s.charAt(3) - 'a';
        union(parent, sz, x, y);
      }
    }
    for (String s : equations) {
      if (s.charAt(1) == '!') {
        int x = s.charAt(0) - 'a';
        int y = s.charAt(3) - 'a';
        if (find(parent, x) == find(parent, y)) {
          return false;
        }
      }
    }
    return true;
  }

  private int find(int[] parent, int p) {
    while (p != parent[p]) {
      parent[p] = parent[parent[p]];
      p = parent[p];
    }
    return p;
  }

  private void union(int[] parent, int[] sz, int p, int q) {
    int i = find(parent, p);
    int j = find(parent, q);
    if (i == j) return;
    if (sz[i] < sz[j]) {
      parent[i] = j;
      sz[j] += sz[i];
    } else {
      parent[j] = i;
      sz[i] += j;
    }
  }
}
