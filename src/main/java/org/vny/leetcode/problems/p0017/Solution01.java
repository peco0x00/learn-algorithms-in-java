package org.vny.leetcode.problems.p0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution01 implements Main {

  @Override
  public List<String> letterCombinations(String digits) {
    Map<Character, String> memo = new HashMap<>();
    memo.put('2', "abc");
    memo.put('3', "def");
    memo.put('4', "ghi");
    memo.put('5', "jkl");
    memo.put('6', "mno");
    memo.put('7', "qprs");
    memo.put('8', "tuv");
    memo.put('9', "wxyz");
    List<String> res = new ArrayList<>();
    if (digits.length() == 0) return res;
    StringBuilder track = new StringBuilder();
    backtrack(digits, res, memo, 0, track);
    return res;
  }

  private void backtrack(String digits, List<String> res, Map<Character, String> memo, int idx, StringBuilder track) {
    int n = digits.length();
    if (n == idx) {
      res.add(track.toString());
      return;
    }
    String opt = memo.get(digits.charAt(idx));
    int m = opt.length();
    for (int i = 0; i < m; i++) {
      track.append(opt.charAt(i));
      backtrack(digits, res, memo, idx + 1, track);
      track.deleteCharAt(track.length() - 1);
    }
  }
}
