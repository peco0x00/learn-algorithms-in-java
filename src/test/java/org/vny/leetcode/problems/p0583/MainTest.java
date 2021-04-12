package org.vny.leetcode.problems.p0583;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void minDistance() {
    // Main main = new Naive();
    // Main main = new Dynamic();
    Main main = new Compress();
    String s1 = "sea";
    String t1 = "eat";
    int res1 = main.minDistance(s1, t1);
    int ans1 = 2;
    assertEquals(ans1, res1);

    String s2 = "a";
    String t2 = "b";
    int res2 = main.minDistance(s2, t2);
    int ans2 = 2;
    assertEquals(ans2, res2);
  }
}

/*
不是Java垃圾回收算法：空间分配算法
不是JVM构成的是：码流分析器
Java语言是面向对象的、解释执行的网络编程语言
判断一个对象是否可以被垃圾回收的条件为是否还有该对象的引用 (x)
java中的集合类可以用来存储任何类型的对象……(y）
java接口包含函数声明和常量声明 (y)
java源程序可以在各类平台上运行 (x)
*/
