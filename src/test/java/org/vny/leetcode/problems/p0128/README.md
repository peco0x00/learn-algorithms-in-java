# 1. 数据类型

## 1.1 基本类型

byte-8
char-16
short-16
int-32
float-32
long-64
double-64
boolean-?

JVM没有规定boolean的具体大小，会在编译期将boolean转化为int


## 1.2 包装类型

编译器自动进行基本类型和封装类的转换

## 1.3 缓存池

- new Integer(n)每次都会新建一个对象
- Integer.valueOf(n)会使用缓存池中的对象，多次调用会获得同一个对象的引用

java8中，Integer缓存池的默认大小为`-128~127`

编译器会在自动装箱过程中自动调用valueOf方法，因此多个值相同且在缓存池范围内的Integer实例使用自动装箱创建，则会引用相同的对象

```java
Integer a = 12;
Integer b = 12;
Integer c = Integer.valueOf(12);
System.out.println(a == b && a == c);   // true
```

基本类型对应的缓存池：

- boolean   true/false
- byte      all byte values
- short     -128~127
- int       ~128-127
- char      \u0001~\u007F

Integer的缓存池上界可调整，启动JVM时通过`-XX:AutoBoxCacheMax=<size>`参数来指定缓冲池的大小

- 系统属性 `java.lang.IntegerCache.high`决定上界

# 2. String

- String类声明为final，不可被继承(包装类也不可继承)
- java8中，String内部使用char[]存储数据
- java9之后，String类的实现改用byte[]存储字符串，并使用coder标识使用了哪种编码
- 存储数组被声明为final，因此String对象不可变

## 2.1 不可变的好处

1. 可以缓存hash，不需要重复计算
2. String pool

如果一个String对象已经被创建，就会从String Pool中取得引用

```java
String a = "123";
String b = "123";
System.out.println(a == b);   // true
```

3. 安全性

String作为参数，在不可变时可以确保参数不可变

4. 线程安全

不可变特性天生具备线程安全性

## 2.2 String, StringBuilder和StringBuffer

String和StringBuffer线程安全，StringBuilder线程不安全

## 2.3 String Pool

字符串常量池，保存着所有字符串字面量，在编译期就已经确定

还可以使用String的`intern()`方法在运行过程中添加到String Pool中，返回其在常量池中的引用

字面量形式创建字符串会自动放入常量池

java7之前常量池被放在运行时常量池中，之后则被移入堆中

## 2.4 new String("abc")

这种方式一共会创建两个String对象（如果常量池中还没有"abc"字符串对象）

- "abc"是字面量，因此编译期会在常量池中创建一个对象
- 使用new方式会在堆中创建一个对象

`java -verbose`反编译命令

String构造函数中传入另一个字符串时，不会完全复制value数组，而是指向同一个value数组

# 3. 运算

## 3.1 参数传递

通过值传递，而不是引用传递；如果参数是类类型则将对象地址以值的方式传递

## 3.2 float和double

浮点数字面量属于double类型，不能直接赋值给float，向下转型会造成精度丢失

## 3.3 隐式类型转换

直接赋值不可以，但是使用`+=`或`++`运算符会执行隐式类型转换

```java
short s1 = 1;   // compile error
s1 += 1;
s1++;           // equals to:
s1 = (short) (s1 + 1);
```

## 3.4 switch

java7开始可以在switch中使用String对象

支持：

- int/Integer
- char/Character
- byte/Byte
- short/Short
- String
- enum

# 4. 关键字

非静态内部类依赖于外部类的实例，即需要先创建外部类实例，才能用这个实例创建非静态内部类

而静态内部类则不需要

存在继承的情况下，初始化顺序为：

父类（静态变量、静态语句块）
子类（静态变量、静态语句块）
父类（实例变量、普通语句块）
父类（构造函数）
子类（实例变量、普通语句块）
子类（构造函数)

# 5. Object通用方法

- hashcode
- equals
- clone
- toString
- getClass
- finalize
- notify
- notifyAll
- wait(long timeout)
- wait(long timeout, nanos)
- wait

1. equals

等价关系

基本类型：`==`判断两个值是否相等
引用类型：`==`判断两个变量是否引用同一个对象，`equals`判断引用对象是否等价


