# 回溯算法

[回溯问题](https://github.com/labuladong/fucking-algorithm/blob/master/%E7%AE%97%E6%B3%95%E6%80%9D%E7%BB%B4%E7%B3%BB%E5%88%97/%E5%9B%9E%E6%BA%AF%E7%AE%97%E6%B3%95%E8%AF%A6%E8%A7%A3%E4%BF%AE%E8%AE%A2%E7%89%88.md)
[程小新同学的知乎专栏](https://zhuanlan.zhihu.com/p/51882471)

## 1. 基本内容

解决回溯问题，实际上就是一个决策树的遍历过程

**回溯问题的三个要素**

1. 路径：即已经做出的选择
2. 选择列表：当前可以做的选择
3. 结束条件：到达决策树的底层，无法再做选择的条件

可以将路径和选择列表作为决策树上每个节点的属性

backtrack函数就像一个指针，在决策树上游走，同时维护每个节点的属性

## 2. 算法框架

```
res = []
def backtrack(path, option_list):
  if satisfy_end_condition:
    result.add(path)
    return
  for option in option_list:
    make an option    # traverse towards current node's children
    backtrack(path, option_list)
    revoke option     # retreve from the nodes which has been visited
```

核心就是for里面的递归，在递归调用之前“做选择”，在递归调用之后“撤销选择”

[leetcode 46](https://leetcode-cn.com/problems/permutations/)
[leetcode 51](https://leetcode-cn.com/problems/n-queens)

## 3. 全排列问题

**assume there's no duplicate elements.**

```java
List<List<Integer>> res = new LinkedList<>();

public List<List<Integer>> permute(int[] nums){
  // record current path
  LinkedList<Integer> track = new LinkedList<>();
  backtrack(nums, track);
  return res;
}

// path: recorded in track
// option_list: nums's elements which are not exist in track
// end_condition: all elements in nums are existed in track
void backtrack(int[] nums, LinkedList<Integer> track) {
  // end condition
  if (track.size() == nums.length) {
    // current path has gone to an end
    res.add(new LinkedList<>(track));
    return;
  }
  for (int i = 0; i < nums.length; i++) {
    // execute illegal option
    if (track.contains(nums[i])) continue;
    // make an option
    track.add(nums[i]);
    // move to next decision tree level
    backtrack(nums, track);
    // revoke option
    track.removeLast();
  }
}
```

## 4. N皇后问题



