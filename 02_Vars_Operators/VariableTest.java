class VariableTest {
  public static void main(String[] args) {
    System.out.println("*******Test0*******");
    test0();
    System.out.println("*******Test1*******");
    test1();
    System.out.println("*******Test2*******");
    test2();
    System.out.println("*******Test3*******");
    test3();
    System.out.println("*******Test4*******");
    test4();
    System.out.println("*******StringTest0*******");
    strTest0();
  }

  /*
   * 测试变量的基本使用
   * 
   * 1. 变量的理解：内存中的一个存储区域，该区域的数据可以在同一类型范围内不断变化
   * 
   * 2. 变量的构成包含三个要素：数据类型、变量名、存储的值
   * 
   * 3. Java中变量声明的格式：数据类型 变量名 = 变量值
   * 
   * 4. Java中的变量按照数据类型来分类：
   * 基本数据类型（8种）:
   * 整型：byte \ short \ int \ long
   * 浮点型：float \ double
   * 字符型：char
   * 布尔型：boolean
   * 
   * 引用数据类型：
   * 类(class)
   * 数组(array)
   * 接口(interface)
   * 
   * 枚举(enum)
   * 注解(annotation)
   * 记录(record)
   * 
   * 5. 定义变量时，变量名要遵循标识符命名的规则和规范。
   * 
   * 6. 说明：
   * - 变量都有其作用域。变量只在作用域内是有效的，出了作用域就失效了。
   * - 在同一个作用域内，不能声明两个同名的变量
   * - 定义好变量以后，就可以通过变量名的方式对变量进行调用和运算。
   * - 变量值在赋值时，必须满足变量的数据类型，并且在数据类型有效的范围内变化。
   * 
   */
  public static void test0() {
    // 定义变量的方式1：
    char gender; // 过程1：变量的声明
    gender = '男'; // 过程2：变量的赋值（或初始化）
    gender = '女';

    // 定义变量的方式2：声明与初始化合并
    int age = 10;
    System.out.println(age);
    System.out.println("age = " + age);
    System.out.println("gender = " + gender);
    // 在同一个作用域内，不能声明两个同名的变量
    // char gender = '女';
    // 由于number前没有声明类型，即当前number变量没有提前定义。所以编译不通过。
    // number = 10;
  }

  /*
   * 测试整型和浮点型变量的使用
   */
  public static void test1() {
    // 1.测试整型变量的使用
    // byte(1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
    byte b1 = 12;
    System.out.println("b1 = " + b1);
    byte b2 = 127;
    System.out.println("b2 = " + b2);
    // 编译不通过。因为超出了byte的存储范围
    // byte b3 = 128;
    short s1 = 1234;
    System.out.println("s1 = " + s1);
    int i1 = 123234123;
    System.out.println("i1 = " + i1);
    // ① 声明long类型变量时，需要提供后缀。后缀为'l'或'L'
    long l1 = 123123123L;
    System.out.println("l1 = " + l1);
    // ② 开发中，大家定义整型变量时，没有特殊情况的话，通常都声明为int类型。

    // 2.测试浮点类型变量的使用
    // float \ double
    double d1 = 12.3;
    System.out.println("d1 = " + d1);
    // ① 声明long类型变量时，需要提供后缀。后缀为'f'或'F'
    float f1 = 12.3f;
    System.out.println("f1 = " + f1);
    // ② 开发中，大家定义浮点型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高。
    // ③ float类型表数范围要大于long类型的表数范围。但是精度不高。

    // 测试浮点型变量的精度
    // 结论：通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。
    // 测试1
    System.out.println(0.1 + 0.2);
    // 测试2
    float ff1 = 123123123f;
    float ff2 = ff1 + 1;
    System.out.println(ff1);
    System.out.println(ff2);
    System.out.println(ff1 == ff2);
  }

  /*
   * 测试字符类型和布尔类型的使用
   */
  public static void test2() {
    // 1.字符类型：char(2字节)
    // 表示形式1：使用一对''表示，内部有且仅有一个字符
    char c1 = 'a';
    char c2 = '中';
    char c3 = '1';
    char c4 = '%';
    char c5 = 'γ';
    System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3 + ", c4 = " + c4 + ", c5 = " + c5);
    // 编译不通过
    // char c6 = '';
    // char c7 = 'ab';
    // 表示形式2：直接使用Unicode值来表示字符型常量。
    char c8 = '\u0036';
    System.out.println(c8); // 6
    // 表示形式3：使用转义字符
    char c9 = '\n';
    System.out.println("hello" + c9 + "world");
    char c10 = '\t';
    System.out.println("hello" + c10 + "world");
    // 表示形式4：使用具体字符对应的数值（比如ASCII码）
    char c11 = 97;
    System.out.println(c11); // a
    char c12 = '1';
    char c13 = 1;
    System.out.println(c12 == c13); // true

    // 2. 布尔类型：boolean
    // ① 只有两个取值：true、 false
    boolean bo1 = true;
    boolean bo2 = false;
    System.out.println("bo1 = " + bo1 + ", bo2 = " + bo2);

    // 编译不通过
    // boolean bo3 = 0;
    // ② 常使用在流程控制语句中。比如：条件判断、循环结构等
    boolean isMarried = true;
    if (isMarried) {
      System.out.println("很遗憾，不能参加单身派对了");
    } else {
      System.out.println("可以多谈几个女朋友或男朋友");
    }
    // ③ 了解：我们不谈boolean类型占用的空间大小。但是，真正在内存中分配的话，使用的是4个字节。
  }

  /*
   * 测试基本数据类型变量间的运算规则。
   * 
   * 1. 这里提到可以做运算的基本数据类型有7种，不包含boolean类型。
   * 2. 运算规则包括：
   * ① 自动类型提升
   * ② 强制类型转换
   * 
   * 3. 此VariableTest3.java用来测试自动类型提升
   * 
   * 规则：当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型。
   * byte 、short 、char ---> int ---> long ---> float ---> double
   * 特别的：byte、short、char类型的变量之间做运算，结果为int类型。
   * 
   * 说明：此时的容量小或大，并非指占用的内存空间的大小，而是指表示数据的范围的大小。
   * long(8字节) 、 float(4字节)
   */
  public static void test3() {
    int i1 = 10;
    int i2 = i1;
    System.out.println("i1 = " + i1 + ", i2 = " + i2);

    long l1 = i1; // int -> long
    float f1 = l1; // long -> float（尽管 float 4字节 long 8字节，但 float 带指针，范围更大）
    byte b1 = 12;
    int i3 = b1 + i1;
    System.out.println("f1 = " + f1 + ", i3 = " + i3);

    // 编译不通过
    // byte b2 = b1 + i1;

    // **********************************************
    // 特殊的情况1：byte、short之间做运算
    byte b3 = 12;
    short s1 = 10;
    // 编译不通过
    // short s2 = b3 + s1;
    i3 = b3 + s1;

    byte b4 = 10;
    System.out.println("b3 = " + b3 + ", b4 = " + b4);
    // 编译不通过
    // byte b5 = b3 + b4;

    // 特殊的情况2：char
    char c1 = 'a';
    // 编译不通过
    // char c2 = c1 + b3;
    int i4 = c1 + b3;
    System.out.println("i4 = " + i4);

    // **********************************************
    // 练习1：
    long l2 = 123L;
    long l3 = 123; // 理解为：自动类型提升 （int--->long）
    System.out.println("l2 = " + l2 + ", l3 = " + l3);

    // long l4 = 123123123123; //123123123123理解为int类型，因为超出了int范围，所以报错。
    long l5 = 123123123123L;// 此时的123123123123L就是使用8个字节存储的long类型的值
    System.out.println("l5 = " + l5);

    // 练习2：
    float f2 = 12.3F;
    // 编译不通过
    // float f3 = 12.3; //不满足自动类型提升的规则（double --> float）。所以报错
    System.out.println("f2 = " + f2);

    // 练习3：
    // 规定1：整型常量，规定是int类型。
    byte b5 = 10;
    // byte b6 = b5 + 1;
    int ii1 = b5 + 1;
    System.out.println("ii1 = " + ii1);
    // 规定2：浮点型常量，规定是double类型。
    double dd1 = b5 + 12.3;
    System.out.println("dd1 = " + dd1);

    // 练习4：说明为什么不允许变量名是数字开头的。为了“自洽”
    /*
     * int 123L = 12;
     * long l6 = 123L;
     */
  }

  /*
   * 测试强制类型转换
   * 
   * 规则：
   * 1. 如果需要将容量大的变量的类型转换为容量小的变量的类型，需要使用强制类型转换
   * 2. 强制类型转换需要使用强转符：()。在()内指明要转换为的数据类型。
   * 3. 强制类型转换过程中，可能导致精度损失。
   */
  public static void test4() {
    double d1 = 12;// 自动类型提升

    // 编译失败
    // int i1 = d1;
    int i2 = (int) d1;
    System.out.println(i2);

    long l1 = 123;
    // 编译失败
    // short s1 = l1;
    short s2 = (short) l1;
    System.out.println(s2);

    // 练习
    int i3 = 12;
    float f1 = i3;// 自动类型提升
    System.out.println(f1); // 12.0

    float f2 = (float) i3; // 编译可以通过。只不过可以省略()而已。
    System.out.println(f2); // 12.0

    // 精度损失的例子1：
    double d2 = 12.9;
    int i4 = (int) d2;
    System.out.println(i4);

    // 精度损失的例子2：
    int i5 = 128;
    byte b1 = (byte) i5;
    System.out.println(b1); // -128

    // 实际开发举例：
    byte b2 = 12;
    method(b2);

    long l2 = 12L;
    // 编译不通过
    // method(l2);
    method((int) l2);
  }

  public static void method(int num) { // int num = b2;自动类型提升
    System.out.println("num = " + num);
  }

  /*
   * 基本数据类型与String的运算
   * 
   * 一、关于String的理解
   * 1. String类，属于引用数据类型，俗称字符串。
   * 2. String类型的变量，可以使用一对""的方式进行赋值。
   * 3. String声明的字符串内部，可以包含0个，1个或多个字符。
   * 
   * 二、String与基本数据类型变量间的运算
   * 1. 这里的基本数据类型包括boolean在内的8种。
   * 2. String与基本数据类型变量间只能做连接运算，使用"+"表示。
   * 3. 运算的结果是String类型。
   */
  public static void strTest0() {
    String str1 = "Hello World!";
    System.out.println("str1");
    System.out.println(str1);

    String str2 = "";
    String str3 = "a";// char c1 = 'a';
    System.out.println("str2 = " + str2 + ", str3 = " + str3);

    // 测试连接运算
    int num1 = 10;
    boolean b1 = true;
    String str4 = "hello";

    System.out.println(str4 + b1);

    String str5 = str4 + b1;
    System.out.println(str5);// hellotrue
    String str6 = str4 + b1 + num1;
    System.out.println(str6);// hellotrue10

    // 思考：如下的声明编译能通过吗？不能
    // String str7 = b1 + num1 + str4;

    // 如何将String类型的变量转换为基本数据类型？
    int num2 = 10;
    String str9 = num2 + ""; // "10"
    // 编译不通过
    // int num3 = (int)str9;

    // 如何实现呢？使用Integer类。暂时大家了解。
    int num3 = Integer.parseInt(str9);
    System.out.println(num3 + 1);
  }
}
