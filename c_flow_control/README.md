# 流程控制语句

## if-else 条件判断结构

格式：

- 格式 1：

  ```java
  if(条件表达式){
      语句块;
  }
  ```

- 格式 2："二选一"

  ```java
  if(条件表达式) {
      语句块1;
  }else{
      语句块2;
  }
  ```

- 格式 3："多选一"

  ```java
  if (条件表达式1) {
      语句块1;
  } else if (条件表达式2) {
      语句块2;
  }
  ...
  else if (条件表达式n) {
      语句块n;
  } else {
      语句块n+1;
  }
  ```

## switch-case 分支结构

1. 语法格式

   ```java
   switch(表达式) {
       case 常量1:
           //执行语句1
           //break;
       case 常量2:
           //执行语句2
           //break;
       ...
       default:
           //执行语句2
           //break;
   }
   ```

2. 执行过程：

   根据表达式中的值，依次匹配 case 语句。一旦与某一个 case 中的常量相等，那么就执行此 case 中的执行语句。

   执行完此执行语句之后：

   - 情况 1：遇到 break，则执行 break 后，跳出当前的 switch-case 结构
   - 情况 2：没有遇到 break，则继续执行其后的 case 中的执行语句。 ---> case 穿透

   直到遇到 break 或者执行完所有的 case 及 default 中的语句，退出当前的 switch-case 结构。

3. 说明：

   - switch 中的表达式只能是特定的数据类型。如下：byte \ short \ char \ int \ 枚举(JDK5.0 新增) \ String(JDK7.0 新增)
   - case 后都是跟的常量，使用表达式与这些常量做相等的判断，不能进行范围的判断。
   - 开发中，使用 switch-case 时，通常 case 匹配的情况都有限。
   - `break`：可以使用在 switch-case 中。一旦执行此 break 关键字，就跳出当前的 switch-case 结构
   - `default`：类似于 if-else 中的 else 结构。
     default 是可选的，而且位置是灵活的。

4. switch-case 与 if-else 之间的转换

   - 开发中凡是可以使用 switch-case 结构的场景，都可以改写为 if-else。反之，不成立
   - 开发中，如果一个具体问题既可以使用 switch-case，又可以使用 if-else 的时候，推荐使用 switch-case。

   为什么？switch-case 相较于 if-else 效率稍高。

## for 循环

1. Java 中规范了 3 种循环结构：for、while、do-while
2. 凡是循环结构，就一定会有 4 个要素：

   - 循环条件 ---> 一定是 boolean 类型的变量或表达式
   - 循环体
   - 迭代部分

3. for 循环的格式

   ```java
   for(①;②;④){
       ③
   }
   ```

   执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

## while 循环

1. 凡是循环结构，就一定会有 4 个要素：

   - 初始化条件
   - 循环条件 ---> 一定是 boolean 类型的变量或表达式
   - 循环体
   - 迭代部分

2. while 的格式

   ```java
   ①
   while(②){
       ③
       ④
   }
   ```

3. 执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

4. for 循环与 while 循环可以相互转换！

5. for 循环和 while 循环的小区别：初始化条件的作用域范围不同。while 循环中的初始化条件在 while 循环结束后，依然有效。

## do-while 循环

1. 凡是循环结构，就一定会有 4 个要素：
   ① 初始化条件
   ② 循环条件 ---> 一定是 boolean 类型的变量或表达式
   ③ 循环体
   ④ 迭代部分

2. 格式

   ```java
   ①
   do{
       ③
       ④
   }while(②);
   ```

   执行过程：① - ③ - ④ - ② - ③ - ④ - .... - ②

3. 说明：

   - do-while 循环至少执行一次循环体。
   - for、while、do-while 循环三者之间是可以相互转换的。
   - do-while 循环结构，在开发中，相较于 for、while 循环来讲，使用的较少。

## break 和 continue 关键字的使用

1. break 和 continue 关键字的使用

| 比较项   | 使用范围               | 在循环结构中的作用         | 相同点                             |
| -------- | ---------------------- | -------------------------- | ---------------------------------- |
| break    | switch-case/循环结构中 | 结束（或跳出）当前循环结构 | 在此关键字的后面不能声明执行语句。 |
| continue | 循环结构中             | 结束（或跳出）当次循环     | 在此关键字的后面不能声明执行语句。 |

2. 了解带标签的 break 和 continue 的使用

3. 开发中，break 的使用频率要远高于 continue。

## 补充：Scanner 类的使用

如何从键盘获取不同类型（基本数据类型、String 类型）的变量：使用 Scanner 类。

1. 使用 Scanner 获取不同类型数据的步骤

   - 步骤 1：导包 import java.util.Scanner;
   - 步骤 2：提供（或创建）一个 Scanner 类的实例
   - 步骤 3：调用 Scanner 类中的方法，获取指定类型的变量 (nextXxx())
   - 步骤 4：关闭资源，调用 Scanner 类的 close()

2. 案例：小明注册某交友网站，要求录入个人相关信息。如下：

   请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。

3. Scanner 类中提供了获取 byte \ short \ int \ long \float \double \boolean \ String 类型变量的方法。

   注意，没有提供获取 char 类型变量的方法。需要使用 `next().charAt(0)`

## 补充：随机数的生成

如何获取一个随机数?

1. 可以使用 Java 提供的 API:Math 类的 `random()`
2. `random()`调用以后，会返回一个 $[0.0,1.0)$ 范围的 double 型的随机数。
