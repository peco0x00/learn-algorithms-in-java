package org.vny.leetcode.problems.p0060;

public class Naive implements Main {

  // crap...
  @Override
  public String getPermutation(int n, int k) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
    }
    for (int i = 0; i < k - 1; i++) {
      nextPermutation(arr);
    }
    StringBuilder res = new StringBuilder();
    for (int i : arr) {
      res.append(i);
    }
    return res.toString();
  }

  public void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }
    // if i < 0, the sequence 'nums' has been desc
    if (i >= 0) {
      int j = nums.length - 1;
      while (j >= 0 && nums[i] >= nums[j]) {
        j--;
      }
      swap(nums, i, j);
    }
    reverse(nums, i + 1);
  }

  private void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  private void reverse(int[] a, int start) {
    int left = start, right = a.length - 1;
    while (left < right) {
      swap(a, left++, right--);
    }
  }
}
