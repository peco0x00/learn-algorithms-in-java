package org.vny.leetcode.problems.p0031;

public class Naive implements Main {

  /*
  * 1. reversely find (i, i + 1), which a[i] < a[i + 1]
  *    and now a[i + 1..n] is the desc sequence
  * 2. if we find i, then reversely find the first element j in a[i + 1..n]
  *    which a[i] < a[j]
  * 3. swap a[i] and a[j], and now a[i + 1..n] is the desc sequence,
  *    then we reverse a[i + 1..n]
  * */
  @Override
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
