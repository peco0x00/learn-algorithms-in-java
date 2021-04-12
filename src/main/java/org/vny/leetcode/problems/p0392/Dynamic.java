package org.vny.leetcode.problems.p0392;

public class Dynamic implements Main {

  // using double pointer, we need to spend a lot of time
  // on finding the next match char in t
  // so, we can pre-process every position in t
  // dp[i][j] -> char j's first appear position in t[i..]
  // if t[i] == j, dp[i][j] = i
  // if t[i] != j, dp[i][j] = dp[i + 1][j]
  // so, we need to iterate dp array reversely, from n to 0
  @Override
  public boolean isSubsequence(String s, String t) {
    char[] as = s.toCharArray(), at = t.toCharArray();
    int m = as.length, n = at.length;
    // ************** pre-processing **************
    int[][] dp = new int[n + 1][26];
    // base case
    // dp[i][j] = n represents t[i..] don't have char j
    for (int i = 0; i < 26; i++) {
      dp[n][i] = n;
    }
    // reversely iterate dp
    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < 26; j++) {
        if (at[i] == j + 'a') dp[i][j] = i;
        else dp[i][j] = dp[i + 1][j];
      }
    }
    // ************** pre-process done **************
    // calculate the particular string s
    // 'add' is the pointer on t
    int add = 0;
    for (char ch : as) {
      // if there is no char ch in t, not match
      if (dp[add][ch - 'a'] == n) return false;
      // if match, move the pointer to the next position
      add = dp[add][ch - 'a'] + 1;
    }
    return true;
  }
}
