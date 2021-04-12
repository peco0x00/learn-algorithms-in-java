package org.vny.algorithms.search;

public class BinarySearch implements Search {

  @Override
  public int search(int[] array, int key) {
    int left = 0, right = array.length - 1;
    while (left <= right) {
      int mid = (right + left) / 2;
      if (array[mid] == key) {
        return mid;
      } else if (array[mid] > key) {
        right = mid - 1;
      } else if (array[mid] < key) {
        left = mid + 1;
      }
    }
    return -1;
  }

  /*
   * 1. the right's init value and the while condition
   *   because right's max is arr.length - 1 so
   *   search interval: [left, right]
   *   so end condition:
   *     1. find the target
   *     2. left > right
   *   that's why while exiting condition is (left <= right)
   *     not (left < right)
   *   when left == right + 1, the search interval is [right + 1, right],
   *     which is empty, so we need to exit
   *
   *   if search interval is [left, right)
   *   then while condition is: (left < right)
   *   and when left == right, we need to check if arr[left] == target
   *
   * 2. the left and right's value during iteration
   *   why left = mid + 1, right = mid - 1?
   *   because search interval is [left, right], so if arr[mid] < target,
   *   the next larger interval should be: [mid + 1, right]
   *   the next smaller interval should be: [left, mid - 1]
   *   because the close interval, [mid] has been searched
   *   it should be dropped from interval
   * */
  private int binarySearch(int[] arr, int target) {
    int n = arr.length;
    int left = 0, right = n - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] < target) {
        left = mid + 1;
      } else if (arr[mid] > target) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  // search for the count of numbers which smaller than target
  /*
   * 1. why while condition is left < right?
   *   because the search interval is [left, right)
   *   but why right's init value is n, not n - 1?
   *   both value is right, this is an option
   * 2. why not returning -1? what if there's no target in arr?
   *   if return 0, it means no element is smaller than target
   *   if return arr.length, it means all the elements is smaller than target
   *   thus, we can change the code if you want to return -1:
   *   if (left == nums.length) return -1;
   *   return nums[left] == target ? left : -1;
   * 3. why left = mid + 1, right = mid?
   *   because the search interval is [left, right)
   *   [left, right) -> [left, mid), [mid + 1, right)
   * 4. why it can search the left bound
   *   the key is:
   *   if (nums[mid] == target) right = mid
   *   when it finds target, it shrink the right bound, continue
   *   searching in [left, mid)
   * 5. why return left not right?
   *   it's the same... after searching, left == right
   * */
  private int leftBound(int[] arr, int target) {
    int n = arr.length;
    int left = 0, right = n;
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        right = mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else if (arr[mid] > target) {
        right = mid;
      }
    }
    return left;
  }

  private int anotherLeftBound(int[] arr, int target) {
    int n = arr.length;
    int left = 0, right = n - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        right = mid - 1;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else if (arr[mid] > target) {
        right = mid - 1;
      }
    }
    // because after searching, left = right + 1
    // so left may out of the bound
    if (left >= n || arr[left] != target) return -1;
    return left;
  }

  /*
   * return the right bound of value target
   * 1. why returning left - 1?
   *   first, left still equals to right after searching
   *   so can be replaced by right - 1
   *   why - 1?
   *   because if (nums[mid] == target), left = mid + 1
   *   so nums[left] cannot equals to target, but nums[left - 1] might be
   * */
  private int rightBound(int[] arr, int target) {
    int n = arr.length;
    int left = 0, right = n;
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        left = mid + 1;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else if (arr[mid] > target) {
        right = mid;
      }
    }
    return left - 1;
  }
}
