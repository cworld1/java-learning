# 数组

## 一位数组

1. 数组的理解(Array)

   概念：是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。

   简称：多个数据的组合

   Java 中的容器：数组、集合框架（第 12 章）：在内存中对多个数据的存储。

2. 几个相关的概念

   - 数组名
   - 数组的元素（即内部存储的多个元素）
   - 数组的下标、角标、下角标、索引、index(即找到指定数组元素所使用的编号)
   - 数组的长度(即数组容器中存储的元素的个数)

3. 数组的特点：

   - 数组中的元素在内存中是依次紧密排列的，有序的。
   - 数组，属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以引用数据类型。
   - 数组，一旦初始化完成，其长度就确定了,并且其长度不可更改。
   - 创建数组对象会在内存中开辟一整块`连续的空间`。占据的空间的大小，取决于数组的长度和数组中元素的类型。

4. 复习：变量按照数据类型的分类

   4.1 基本数据类型：byte \ short \ int \ long ;float \ double ; char \ boolean
   4.2 引用数据类型：类、数组、接口、枚举、注解、记录

5. 数组的分类
   5.1 按照元素的类型：基本数据类型元素的数组；引用数据类型元素的数组
   5.2 按照数组的维数来分：一维数组；二维数组；.....

6. 一维数组的使用（6 个基本点）

   - 数组的声明和初始化
   - 调用数组的指定元素
   - 数组的属性：length,表示数组的长度
   - 数组的遍历
   - 数组元素的默认初始化值
   - 一维数组的内存解析（难）

7. 数组元素的默认初始化值的情况
   注意：以数组的动态初始化方式为例说明。

   - 整型数组元素的默认初始化值：0
   - 浮点型数组元素的默认初始化值：0.0
   - 字符型数组元素的默认初始化值：0 (或理解为'\u0000')
   - boolean 型数组元素的默认初始化值：false
   - 引用数据类型数组元素的默认初始化值：null

8. 一维数组的内存解析

   8.1 Java 中的内存结构是如何划分的？（主要关心 JVM 的运行时内存环境）

   - 将内存区域划分为 5 个部分：程序计数器、虚拟机栈、本地方法栈、堆、方法区

   - 与目前数组相关的内存结构： 比如：int[] arr = new int[]{1,2,3};
   - 虚拟机栈：用于存放方法中声明的变量。比如：arr
   - 堆：用于存放数组的实体（即数组中的所有元素）。比如：1,2,3

     8.2 举例：具体一维数组的代码的内存解析

## 二维数组

1. 二维数组的理解

   - 对于二维数组的理解，可以看成是一维数组 array1 又作为另一个一维数组 array2 的元素而存在。
   - 其实，从数组底层的运行机制来看，其实没有多维数组。
   - 概念：数组的外层元素；数组的内层元素

2. 二维数组的使用（6 个基本点）

   - 数组的声明和初始化
   - 调用数组的指定元素
   - 数组的属性：length,表示数组的长度
   - 数组的遍历
   - 数组元素的默认初始化值
   - 二维数组的内存解析（难）

3. 二维数组元素的默认初始化值

   动态初始化方式 1：(比如：`int[][] arr = new int[3][4]`)

   - 外层元素，默认存储地址值。
   - 内层元素，默认与一维数组元素的不同类型的默认值规定相同。

   具体值：参照一维数组的情况。

   - 整型数组元素的默认初始化值：0
   - 浮点型数组元素的默认初始化值：0.0
   - 字符型数组元素的默认初始化值：0 (或理解为'\u0000')
   - boolean 型数组元素的默认初始化值：false
   - 引用数据类型数组元素的默认初始化值：null

   动态初始化方式 2：(比如：`int[][] arr = new int[3][]`)

   - 外层元素，默认存储 null
   - 内层元素，不存在的。如果调用会报错（NullPointerException）

## 数组的常见算法 1

1. 数值型数组特征值统计

   这里的特征值涉及到：平均值、最大值、最小值、总和等

2. 数组元素的赋值（实际开发中，遇到的场景比较多）

3. 数组的复制

4. 数组的反转

## 数组的常见算法 2

1. 数组的扩容与缩容

2. 数组元素的查找

   顺序查找：

   - 优点：算法简单；
   - 缺点：执行效率低。执行的时间复杂度 O(N)

   二分法查找：

   - 优点：执行效率高。执行的时间复杂度 O(logN)
   - 缺点：算法相较于顺序查找难一点；前提：数组必须有序

3. 数组的排序

   排序算法的衡量标准：

   1. 时间复杂度（最重要）
   2. 空间复杂度
   3. 稳定性

   $$
   Ο(1)＜Ο(log_2n)＜Ο(n)＜Ο(nlog_2n)＜Ο(n^2)＜Ο(n^3)＜…＜Ο(2^n)＜Ο(n!)<O(n^n)
   $$

   排序的分类：

   1. 内部排序（内存中排序）
   2. 外部排序（外部存储设备+内存）

   内部排序的具体算法：10 种。具体的见课件

   我们需要关注的几个排序算法：

   - 冒泡排序：最简单，需要大家会手写。时间复杂度：$O(n^2)$
   - 快速排序：最快的，开发中默认选择的排序方式；掌握快速排序的实现思路；时间复杂度：$O(nlog_2n)$

## 数组工具类 Arrays 的使用

1. Arrays 类所在位置: 处在 java.util 包下

2. 作用：

   java.util.Arrays 类即为操作数组的工具类，包含了用来操作数组（比如排序和搜索）的各种方法。

## 数组的常见异常

1. 数组的使用中常见的异常小结

   - 数组角标越界的异常：ArrayIndexOutOfBoundsException
   - 空指针的异常：NullPointerException

2. 出现异常会怎样？如何处理？

   - 一旦程序执行中出现了异常，程序就会终止执行。
   - 针对异常提供的信息，修改对应的代码，避免异常再次出现。