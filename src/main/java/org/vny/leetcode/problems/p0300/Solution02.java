package org.vny.leetcode.problems.p0300;

public class Solution02 implements Main {

  /*
  * 贪心算法：如果要使得上升子序列尽可能长，则需要让序列上升尽可能慢
  * 因此需要在上升序列最后加上的那个数尽可能小
  * d[i] -> 长度为i的最长上升子序列的末尾元素的最小值
  * */
  @Override
  public int lengthOfLIS(int[] nums) {
    int len = 1, n = nums.length;
    if (n == 0) return 0;
    int[] d = new int[n + 1];
    d[len] = nums[0];
    for (int i = 1; i < n; i++) {
      if (nums[i] > d[len]) {
        d[++len] = nums[i];
      } else {
        int l = 1, r = len, pos = 0;
        while (l <= r) {
          int mid = (l + r) >> 1;
          if (d[mid] < nums[i]) {
            pos = mid;
            l = mid + 1;
          } else {
            r = mid - 1;
          }
        }
        d[pos + 1] = nums[i];
      }
    }
    return len;
  }
}
