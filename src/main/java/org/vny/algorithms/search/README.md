# searching 

# 1. linear search

[LinearSearch.java](./LinearSearch.java)

# 2. binary search 

[二分查找](https://mp.weixin.qq.com/s?__biz=MzAxODQxMDM0Mw==&mid=2247484507&idx=1&sn=36b8808fb8fac0e1906493347d3c96e6&source=41#wechat_redirect)

二分查找框架：

```java
int binarySearch(int[] nums, int target) {
  int left = 0, right = ...;
  while (...) {
    int mid = (right + left) / 2;
    if (nums[mid] == target) {
      ...
    } else if (nums[mid] < target) {
      left = ...
    } else if (nums[mid] > target) {
      right = ...
    }
  }
  return ...;
}
```

## 2.1 寻找一个数（基本的二分查找）

[BinarySearch.java](./BinarySearch.java)

查找的终止条件和搜索区间有关

该算法每次迭代的搜索区间为：`[left, right]`
结束条件为：找到target或left + 1 == right

该算法无法查找target的左侧边界和右侧边界，例如数组`[1, 2, 2, 2, 3]`，target=2的左侧边界为索引1，右侧边界为索引3

## 2.2 寻找左侧边界的二分搜索

[LeftBoundBinarySearch.java](./LeftBoundBinarySearch.java)

func(nums, target) 的含义是，查找在nums中小于target的元素有多少个

即相当于target在nums的左侧边界的索引值

```java
int left_bound(int[] nums, int target) {
  if (nums.length == 0) return 0;
  int left = 0, right = nums.length;
  while (left < right) {
    int mid = (right + left) / 2;
    if (nums[mid] == target) {
      right = mid;
    } else if (nums[mid] < target) {
      left = mid + 1;
    } else if (nums[mid] > target) {
      right = mid;
    }
  }
  return left;
}
```

该算法的每次迭代搜索区间为：[left, right)
算法的终止条件为：left == right 
因此最后返回值为left还是right都可以

## 2.3 寻找右侧边界的二分查找

[RightBoundBinarySearch.java](./RightBoundBinarySearch.java)

该算法的每次迭代搜索区间为：[left, right)
算法的终止条件为：left == right
因此最后返回值为left还是right都可以

# 总结

第一个，最基本的二分查找算法：

```
因为我们初始化 right = nums.length - 1
所以决定了我们的「搜索区间」是 [left, right]
所以决定了 while (left <= right)
同时也决定了 left = mid+1 和 right = mid-1

因为我们只需找到一个 target 的索引即可
所以当 nums[mid] == target 时可以立即返回
```

第二个，寻找左侧边界的二分查找：

```
因为我们初始化 right = nums.length
所以决定了我们的「搜索区间」是 [left, right)
所以决定了 while (left < right)
同时也决定了 left = mid+1 和 right = mid

因为我们需找到 target 的最左侧索引
所以当 nums[mid] == target 时不要立即返回
而要收紧右侧边界以锁定左侧边界
```

第三个，寻找右侧边界的二分查找：

```
因为我们初始化 right = nums.length
所以决定了我们的「搜索区间」是 [left, right)
所以决定了 while (left < right)
同时也决定了 left = mid+1 和 right = mid

因为我们需找到 target 的最右侧索引
所以当 nums[mid] == target 时不要立即返回
而要收紧左侧边界以锁定右侧边界

又因为收紧左侧边界时必须 left = mid + 1
所以最后无论返回 left 还是 right，必须减一
```
