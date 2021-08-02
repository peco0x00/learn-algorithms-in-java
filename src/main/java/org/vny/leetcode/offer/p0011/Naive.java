package org.vny.leetcode.offer.p0011;

public class Naive implements Main {

  /*
  if a[mid] < a[right], then min is in [left, mid]
  if a[mid] > a[right], then min is in [mid, rihgt]
  if a[mid] == a[right]:
    because the exists of duplicate elements, we cannot sure where the min is
    the only thing we know is that whether or not the a[right] is the min, there is always a substitution of it, which is a[mid], so we can shrink down the interval, then right--

  the search interval is [left, right]
  when left == right, a[left] is the result
  because there is always be a result
  if a[mid] < a[right], we cannot sure if a[mid] is the min
    so right = mid, not right = mid - 1
  if a[mid] > a[right], we can be sure that a[mid] is not the min
    so left = mid + 1
   */
  public int minArray(int[] numbers) {
    int n = numbers.length;
    int left = 0, right = n - 1;
    while (left < right) {
      int mid = (left + right) / 2;
      if (numbers[mid] < numbers[right]) {
        right = mid;
      } else if (numbers[mid] > numbers[right]) {
        left = mid + 1;
      } else {
        right--;
      }
    }
    return numbers[left];
  }
}
