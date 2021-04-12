package org.vny.leetcode.problems.p0003;

import java.util.Set;
import java.util.HashSet;

public class Naive{

  // using sliding window method
  // solve this by myself! (kind of)
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) return 0;
    int maxLen = 0;
    int left = 0, right = 0;
    int[] freq = new int[128];
    while (right < s.length()) {
      freq[s.charAt(right)]++;
      right++;
      while (freq[s.charAt(right - 1)] > 1) {
        freq[s.charAt(left)]--;
        left++;
      }
      if (right - left > maxLen) {
        maxLen = right - left;
      }
    }
    return maxLen;
  }

  // still using sliding windows
  public int official(String s) {
    Set<Character> freq = new HashSet<>();
    int n = s.length();
    int r = -1, ans = 0;
    // [i, r] is the window
    for (int i = 0; i < n; i++) {
      if (i != 0) freq.remove(s.charAt(i - 1));
      while (r + 1 < n && !freq.contains(s.charAt(r + 1))) {
        freq.add(s.charAt(r + 1));
        ++r;
      }
      ans = Math.max(ans, r - i + 1);
    }
    return ans;
  }

  public static void main(String[] args) {
    Naive main = new Naive();

    String input1 = "abcabcbb";
    int ans1 = 3;
    int ret1 = main.lengthOfLongestSubstring(input1);
    System.out.printf("answer 1 is %d\n", ret1);

    String input2 = "pwwkew";
    int ans2 = 3;
    int ret2 = main.lengthOfLongestSubstring(input2);
    System.out.printf("answer 2 is %d\n", ret2);

    String input3 = "bbbbb";
    int ans3 = 1;
    int ret3 = main.lengthOfLongestSubstring(input3);
    System.out.printf("answer 3 is %d\n", ret3);

    String input4 = "";
    int ans4 = 0;
    int ret4 = main.lengthOfLongestSubstring(input4);
    System.out.printf("answer 4 is %d\n", ret4);
  }
}
