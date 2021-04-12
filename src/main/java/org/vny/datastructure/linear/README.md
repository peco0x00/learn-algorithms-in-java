# 表

# 1. 线性表

## 1.1 Array

Java中的数组是Java内置的一个基本容器，是多个相同类型的数据按照一定顺序排列的集合，并使用一个名字命名，通过编号的方式对这些数据进行统一管理

在java中，数组是一种效率最高的存储和随机访问对象引用序列的方式

数组标识符只是一个引用，指向在堆中创建的一个真实对象，这个对象用以保存指向其他对象的引用。可以作为数组初始化语法的一部分隐式地创建此对象，或者用new表达式显式创建

只读成员length是数组对象的一部分（这也是唯一一个可以访问的字段或方法）

因为Java没有指针只有引用，因此数组标识符表示的就是数组本身，而不是数组首元素的地址

Java数组字面量：

```java
new int[]{1,2,3};
    new String[]{"this","is","a","test"};
```

## 1.2 ArrayList 

即可以自动扩容的线性表的数组实现

特点：

1. 随机访问，访问元素速度快
2. 插入/删除需要移动元素，速度慢

[ArrayList.java](./ArrayList.java)

## 1.3 SinglyLinkedList

单链表

特点：

1. 具有头节点，在链表首尾操作时可以一般化
  - 尾节点之后的null相当于一个哨兵
2. 插入/删除速度快
3. 访问需要查找，速度慢

[SinglyLinkedList.java](./SinglyLinkedList.java)

## 1.4 DoublyLinkedList

双链表

特点：

1. 具有头尾节点
2. 节点具有双指针
3. 可以进行双向遍历，修正了单链表逆向遍历的低效率

[DoublyLinkedList.java](./DoublyLinkedList.java)

## 1.5 StaticLinkedList

静态链表

对于没有指针的编程语言，可以使用数组代替指针，来描述链表

让数组的每个元素由data和cur两部分组成，其中cur相当于链表的Node指针

通常把未使用的数组元素称为备用链表

对数组的第一个和最后一个元素特殊处理，不存储数据

数组的第一个元素的cur存放备用链表的第一个节点的下标

数组的最后一个元素的cur存放第一个有数值的元素的下标，相当于链表中的头节点

[StaticLinkedList.java](./StaticLinkedList.java)

## 1.6 CircularSinglyLinkedList

单向循环链表

循环链表的元素都有一个前驱和后继，所有数据元素在关系上构成逻辑上的环

循环链表是一种特殊的单链表，尾节点的指针指向首节点的地址

[CircularSinglyLinkedList.java](./CircularSinglyLinkedList.java)



# 2. 栈

## 2.1 ArrayStack

[ArrayStack.java](./ArrayStack.java)

## 2.2 LinkedStack

[LinkedStack.java](./LinkedStack.java)

# 3. 队列

## 2.1 ArrayQueue

[ArrayQueue.java](./ArrayQueue.java)

## 2.2 ArrayDeque


## 2.3 LinkedQueue

## 2.4 LinkedDeque
