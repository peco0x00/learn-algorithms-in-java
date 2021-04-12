# 排序算法

# 1. selection sort

基本思路：对于A[i]，找到未排序的元素中最小的元素，将其放入A[i]

[SelectionSort.java](./SelectionSort.java)

# 2. insertion sort

基本思路： A[1..j - 1]为已经排好序的子数组，需要将A[j]元素插入到合适的位置

[InsertionSort.java](./InsertionSort.java)

# 3. shell sort

基本思路：插入排序的一种，通过比较相距一定间隔的元素来进行，逐渐缩减距离，直到只比较相邻元素的最后一趟排序为止

[ShellSort.java](./ShellSort.java)

# 4. heap sort 

基本思路：将数组构建为一个最小堆，得到的数组即为结果

[HeapSort.java](./HeapSort.java)

# 5. merge sort

基本思路：递归地，将数组分为两部分，分别排序后合并

[MergeSort.java](./MergeSort.java)

# 6. quick sort 

基本思路：选取枢纽元，将数组以枢纽元大小分为两部分

[QuickSort.java](./QuickSort.java)

# 7. counting sort 

基本思路：对每一个输入元素x，确定小于x的元素个数
约束条件：
1. 没有重复元素
2. 所有元素小于一个指定值k

[CountingSort.java](./CountingSort.java)

# 8. radix sort

基本思路：对于n个三位数，分别按照第一位、第二位、第三位排序

# 9. bucket sort

