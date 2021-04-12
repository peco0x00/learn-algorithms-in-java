package org.vny.leetcode.problems.p0003;

public class Sol02 implements Main{

  // using sliding window method
  @Override
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) return 0;
    int maxLen = 0;
    int left = 0, right = 0;
    int[] freq = new int[128];
    while (right < s.length()) {
      freq[s.charAt(right)]++;
      right++;
      // when duplicate letter appear, move the left pointer
      while (freq[s.charAt(right)] > 1) {
        char cleft = s.charAt(left);
        freq[cleft]--;
        left++;
      }
      if (right - left > maxLen) {
        maxLen = right - left;
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    String input1 = "abcabcbb";
    int ans1 = 3;
    Main main = new Sol02();
    int ret1 = main.lengthOfLongestSubstring(input1);
    System.out.println(ret1);

    String input2 = "pwwkew";
    int ans2 = 3;
    int ret2 = main.lengthOfLongestSubstring(input2);
    System.out.println(ret2);

    String input3 = "bbbbb";
    int ans3 = 1;
    int ret3 = main.lengthOfLongestSubstring(input3);
    System.out.println(ret3);
  }
}
