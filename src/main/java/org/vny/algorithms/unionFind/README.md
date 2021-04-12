# union-find算法

[github](https://github.com/labuladong/fucking-algorithm/blob/master/%E7%AE%97%E6%B3%95%E6%80%9D%E7%BB%B4%E7%B3%BB%E5%88%97/UnionFind%E7%AE%97%E6%B3%95%E8%AF%A6%E8%A7%A3.md)

# 1. 动态连通性

问题的输入是一列整数对，其中每个整数都表示一个某种类型的对象，(p, q)可以理解为“p和q是相连的”

我们假设“相连“是一种等价关系，即：

- 自反性：p和p是相连的
- 对称性：若p和q是相连的，则q和p也是相连的
- 传递性：若p和q是相连的，且q和r是相连的，则p和r也是相连的

等价关系可以将对象分为多个等价类，本题中当且仅当两个对象相连时才属于同一个等价类

我们的目标是编写程序，过滤掉序列中所有无意义的整数对（两个整数均来自同一个等价类中）

换句话说，如果p和q来自同一个等价类(分量)，则将p和q忽略

术语：

- 分量：即一个等价类
- 触点：即一个基本元素

API:

```java
void union(int p, int q):         // 将p和q连接
int find(int p):                  // 返回p所在分量的标识符
boolean connected(int p, int q)   // 如果p和q存在于同一个分量则返回true
int count()                       // 返回连通分量的数量
```

# 2. 实现

讨论三种不同的实现，它们均根据以触点为索引的id[]数组来确定两个触点是否存在于相同的连通分量中

## 2.1 quick-find

1. 数据结构：

```java
// 以触点为索引，表示所有分量
// id[i] = p 表示包含触点i的分量为p
// id[i]保存了find(i)方法用来判断触点i所在的分量所需的信息
int[] id = new int[N];
// 一开始有N个分量，每个触点构成一个只包含自己的分量，因此初始化：
for (int i = 0; i < N; i++) {
  id[i] = i;
}
```

2. 基本内容

当且仅当`id[p] == id[q]`时，p和q是联通的，即在同一个连通分量中所有触点在`id[]`中的值必须相同

[QuickFindUF.java](./alg4/QuickFindUF.java)

3. 分析

显然这个方法中，find操作速度很快，时间复杂度为O(1)；union操作很慢，复杂度为O(N)

如果最后得到一个连通分量，则需要进行N-1次union操作，时间复杂度为O(N^2)

## 2.2 quick-union

1. 数据结构

仍然使用`id[]`且以触点为索引，但赋予这些值的意义不同。

每个触点对应的`id[]`元素都是同一个分量中的另一个触点的名称（也可能是它自己）

我们将这种联系称为**链接**

2. 基本内容

find方法的实现中，我们从给定触点开始，由它的链接得到另一个触点，以此类推直到到达一个根触点（即链接指向自己的触点）；当且仅当两个触点到达同一个根触点时，二者存在于同一个连通分量中

[QuickUnionUF.java](./alg4/QuickUnionUF.java)

3. 分析

实际上，`id[]`用父链接的方式表示了一片森林，一个分量的根触点就是一棵树的根节点

find方法返回的就是触点所在树的根节点，因此connected方法才可以确认两个触点是否位于同一棵树中

同样，如果最后只有一个分量，则算法的时间复杂度仍然为平方级

## 2.3 weighted-quick-union

1. 数据结构

```java
// 父链接数组（由触点索引）
int[] id = new int[N];
// (由触点索引的)各个根节点所对应的分量的大小
int[] sz = new int[N];
```

2. 基本内容

可以避免quick-union中的糟糕情况出现

在将一棵树链接到另一棵树时，我们进行选择，将小树链接到大树上

[WeightedQuickUnionUF.java](./alg4/WeightedQuickUnionUF.java)

3. 分析

降低了形成的树的高度，任意节点的深度最多为lg(N)，避免了链表的形成

是三种算法中唯一可以用于解决大型实际问题的算法

处理N个触点和M条链接时最多访问数组$cMlnN$次

## 2.4 path-compression quick-union

在find方法中，将指定触点到根节点的路径上的每个触点都链接到根节点

[CompressionQuickUnionUF.java](./alg4/CompressionQuickUnionUF.java)

## 2.5 path-compression weighted-quick-union

在find方法中，将指定触点到根节点的路径上的每个触点都链接到根节点

[CompressionWeightedQuickUnionUF.java](./alg4/CompressionWeightedQuickUnionUF.java)

## 2.6 height-quick-union

使用高度加权的quick-union算法

[HeightQuickUnionUF.java.java](./alg4/HeightQuickUnionUF.java.java)

## 2.7 dynamic-weighted quick-union

使用链表/大小可变的数组实现加权quick union算法

去掉需要预先知道对象数量的限制

[DynamicWeightedQuickUnionUF.java](./alg4/DynamicWeightedQuickUnionUF.java)


# 3. 应用

[leetcode 130](https://leetcode-cn.com/problems/surrounded-regions/)
[leetcode 990](https://leetcode-cn.com/problems/satisfiability-of-equality-equations)
