/*
测试运算符的使用1：算术运算符的使用
1. +  -  +  -  *  /  %  (前)++  (后)++  (前)--  (后)--  +
*/
class AriTest {
    public static void main(String[] args) {
        // *******************************
        // 除法： /
        int m1 = 12;
        int n1 = 5;
        int k1 = m1 / n1;
        System.out.println(k1);// 2

        System.out.println(m1 / n1 * n1);// 10

        // *******************************
        // 取模（或取余）： %
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1); // 2
        // 开发中，经常用来判断某个数num1能整除另外一个数num2。 num1 % num2 == 0
        // 比如：判断num1是否是偶数： num1 % 2 == 0

        // 结论：取模以后，结果与被模数的符号相同
        int i2 = -12;
        int j2 = 5;
        System.out.println(i2 % j2); // -2
        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3); // 2
        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4); // -2

        // *******************************
        // (前)++ :先自增1，再运算
        // (后)++ :先运算，后自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " + b1); // a1 = 11,b1 = 11
        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " + b2); // a2 = 11,b2 = 10

        // 练习1：
        int i = 10;
        // i++;
        ++i;
        System.out.println("i = " + i);// 11

        // 练习2：
        short s1 = 10;
        // 方式1：
        // 编译不通过
        // s1 = s1 + 1;
        // s1 = (short)(s1 + 1);
        // System.out.println(s1);
        // 方式2：
        s1++;
        System.out.println(s1);

        // *******************************
        // (前)-- :先自减1，再运算
        // (后)-- :先运算，再自减1
        // 略

        // 结论：++ 或 -- 运算，不会改变变量的数据类型！

        // + :连接符，只适用于String与其他类型的变量间的运算，而且运算的结果也是String类型。

        // 练习3：
        /*
         * 随意给出一个三位的整数，打印显示它的个位数，十位数，百位数的值。
         * 格式如下：
         * 数字xxx的情况如下：
         * 个位数：
         * 十位数：
         * 百位数：
         * 
         * 例如：
         * 数字153的情况如下：
         * 个位数：3
         * 十位数：5
         * 百位数：1
         */
        int num = 153;
        int ge = num % 10; // 个位
        int shi = num / 10 % 10; // 十位. 或者 int shi = num % 100 / 10
        int bai = num / 100;

        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);

        // 练习4：
        /*
         * 案例2：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
         */
        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;
        System.out.println("共奋战了" + day + "天零" + hour + "小时");

        // 额外的练习1：
        System.out.println("5+5=" + 5 + 5); // 5+5=55
        System.out.println("5+5=" + (5 + 5)); // 5+5=10

        // 额外的练习2：
        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1); // -128

        // 额外的练习3：
        i = 1;
        int j = i++ + ++i * i++; // 1 + 3 * 3
        System.out.println("j = " + j); // 10

        // 额外的练习4：
        i = 2;
        j = i++;
        System.out.println(j); // 2

        int k = 2;
        int z = ++k;
        System.out.println(z);// 3

        int m = 2;
        m = m++;
        System.out.println(m); // 2
    }
}
