package b_vars_operators;

/*
测试运算符的使用5：位运算符

1. <<   >>   >>>   &  |  ^  ~

2. 说明：

① <<   >>   >>>   &  |  ^  ~ ：针对数值类型的变量或常量进行运算，运算的结果也是数值
② 
<< = 在一定范围内，每向左移动一位，结果就在原有的基础上 * 2。（对于正数、负数都适用）
>> = 在一定范围内，每向右移动一位，结果就在原有的基础上 / 2。（对于正数、负数都适用）

3. 面试题：高效的方式计算2 * 8 ？ 

2 << 3 或 8 << 1

*/
class BitTest {
    public static void main(String[] args) {
        int num1 = 7;
        System.out.println("num1 << 1 = " + (num1 << 1));
        System.out.println("num1 << 2 = " + (num1 << 2));
        System.out.println("num1 << 3 = " + (num1 << 3));
        System.out.println("num1 << 28 = " + (num1 << 28));
        System.out.println("num1 << 29 = " + (num1 << 29));// 过犹不及

        int num2 = -7;
        System.out.println("num2 << 1 = " + (num2 << 1));
        System.out.println("num2 << 2 = " + (num2 << 2));
        System.out.println("num2 << 3 = " + (num2 << 3));

        System.out.println(~9);
        System.out.println(~-10);

        // 练习：交换两个变量的值
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ",n = " + n);

        // 交换两个变量的值
        // 方式1：声明一个临时变量。（推荐）
        // int temp = m;
        // m = n;
        // n = temp;

        // 方式2：优点：不需要定义临时变量。 缺点：难、适用性差（不适用于非数值类型）、可能超出int的范围
        // 原理：m + n = n + m
        // m = m + n; //30 = 10 + 20;
        // n = m - n; //10 = 30 - 20;
        // m = m - n; //20 = 30 - 10;

        // 方式3：优点：不需要定义临时变量。 缺点：真难、适用性差（不适用于非数值类型）
        m = m ^ n;
        n = m ^ n;// (m ^ n) ^ n ---> m
        m = m ^ n;

        System.out.println("m = " + m + ",n = " + n);
    }
}
