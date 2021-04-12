package org.vny.leetcode.interview.p1005;

public class Naive01 implements Main {

  // solve this by myself! (kind of)
  // running time beat 100% of users
  // using space beat 88.97% of users
  @Override
  public int findString(String[] words, String s) {
    int n = words.length;
    int left = 0, right = n - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      int tmp = mid;
      // pay attention to the order of two conditions
      while (mid <= right && "".equals(words[mid])) mid++;
      if (mid > right) {
        right = tmp - 1;
        continue;
      }
      if (words[mid].compareTo(s) < 0) {
        left = mid + 1;
      } else if (words[mid].compareTo(s) > 0) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
