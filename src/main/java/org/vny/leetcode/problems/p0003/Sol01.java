package org.vny.leetcode.problems.p0003;

public class Sol01 implements Main {

  // using bitmap
  @Override
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) return 0;
    boolean[] map = new boolean[256];
    int ret = 0, left = 0, right = 0;
    while (left < s.length()) {
      // 右侧字符对应的bitSet被标记true，说明此字符在X位置重复，需要左侧向前移动，直到将X标记为false
      if (map[s.charAt(right)]) {
        map[s.charAt(left)] = false;
        left++;
      } else {
        map[s.charAt(right)] = true;
        right++;
      }
      if (ret < right - left) {
        ret = right - left;
      }
      if (left + ret >= s.length() || right >= s.length()) {
        break;
      }
    }
    return ret;
  }
}
