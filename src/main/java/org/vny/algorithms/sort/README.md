# 排序算法

# 1. selection sort

基本思路：对于A[i]，找到未排序的元素中最小的元素，将其放入A[i]

[SelectionSort.java](./SelectionSort.java)

当数组已经排好序时，排序时间仍然为O(n ^ 2)

# 2. insertion sort

基本思路： A[1..j - 1]为已经排好序的子数组，需要将A[j]元素插入到合适的位置

当数组已经排好序时，排序时间为线性O(n)

插入排序需要的交换次数和数组中的逆序对数量相等

[InsertionSort.java](./InsertionSort.java)

# 3. shell sort

基本思路：插入排序的一种，通过比较相距一定间隔的元素来进行，逐渐缩减距离，直到只比较相邻元素的最后一趟排序为止

插入排序的简单改进，实现h有序数组，不断缩减h直到整个数组完成排序

经过部分排序后，数组转化为对插入排序更有利的部分有序状态

希尔排序的内循环就是插入排序，只是通过外循环迭代了h的值

需要的内存很小，运行时间较为可观

[ShellSort.java](./ShellSort.java)

# 4. heap sort 

基本思路：将数组构建为一个最小堆，得到的数组即为结果

[HeapSort.java](./HeapSort.java)

# 5. merge sort

基本思路：递归地，将数组分为两部分，分别排序后合并

[MergeSort.java](./MergeSort.java)

## 5.1 原地归并的抽象方法

```java
private void merge(int[] a, int lo, int mid, int hi) {
  int[] aux = new int[hi - lo + 1];
  int i = lo, j = mid + 1;
  for (int k = lo; k <= hi; k++) {
    aux[k] = a[k];
  }
  for (int k = lo; k <= hi; k++) {
    if (j > mid) a[k] = aux[j++];               // 左半侧数组用尽，将右半侧数组直接放入a
    else if (j > hi) a[k] = aux[i++];           // 右半侧数组用尽，将左半侧数组直接放入a
    else if (aux[j] < aux[i]) a[k] = aux[j++];
    else a[k] = aux[i++];
  }
}
```

## 5.2 自顶向下的归并排序

应用了高效算法设计中分治思想的典型例子

[TopToBottomMergeSort.java](./TopToBottomMergeSort.java)

在一些小数组上插入排序会比归并排序更快

## 5.3 自底向上的归并排序

[BottomUpMergeSort.java](./BottomUpMergeSort.java)

## 5.4 对merge sort的改进

1. 测试数组是否已经有序

```java
private void merge(int[] a, int lo, int mid, int hi) {
  int i = lo, j = mid + 1;
  if (a[mid] <= a[mid + 1]) { // a[lo, hi] has been sorted
    return;
  }
  for (int k = lo; k <= hi; k++) {
    aux[k] = a[k];
  }
  for (int k = lo; k <= hi; k++) {
    if (i > mid) a[k] = aux[j++];
    else if (j > hi) a[k] = aux[i++];
    else if (aux[j] < aux[i]) a[k] = aux[j++];
    else a[k] = aux[i++];
  }
}
```

2. 对小数组使用插入排序

3. 不将元素复制到辅助数组

我们需要调用两种排序方法，一种将数据从输入数组排序到辅助数组，一种将数据从辅助数组排序到输入数组

# 6. quick sort 

基本思路：选取枢纽元，将数组以枢纽元大小分为两部分

## 6.1 基本算法

[QuickSort.java](./QuickSort.java)
[QuickSort1.java](./QuickSort1.java)

## 6.2 改进

1. 切换到插入排序

2. 三取样切分

3. 熵最优的排序





# 7. counting sort 

基本思路：对每一个输入元素x，确定小于x的元素个数
约束条件：
1. 没有重复元素
2. 所有元素小于一个指定值k

[CountingSort.java](./CountingSort.java)

# 8. radix sort

基本思路：对于n个三位数，分别按照第一位、第二位、第三位排序

# 9. bucket sort


# exercises

[leetcode 148](https://leetcode-cn.com/problems/sort-list/)
