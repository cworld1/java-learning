package c_flow_control;

/*
分支结构之switch-case的使用

1. 语法格式

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

2.执行过程：
根据表达式中的值，依次匹配case语句。一旦与某一个case中的常量相等，那么就执行此case中的执行语句。
执行完此执行语句之后，
        情况1：遇到break，则执行break后，跳出当前的switch-case结构
        情况2：没有遇到break，则继续执行其后的case中的执行语句。 ---> case 穿透
                ...
               直到遇到break或者执行完所有的case及default中的语句，退出当前的switch-case结构

3. 说明：
① switch中的表达式只能是特定的数据类型。如下：byte \ short \ char \ int \ 枚举(JDK5.0新增) \ String(JDK7.0新增)
② case 后都是跟的常量，使用表达式与这些常量做相等的判断，不能进行范围的判断。
③ 开发中，使用switch-case时，通常case匹配的情况都有限。
④ break:可以使用在switch-case中。一旦执行此break关键字，就跳出当前的switch-case结构
⑤ default：类似于if-else中的else结构。
           default是可选的，而且位置是灵活的。

4. switch-case 与if-else之间的转换
① 开发中凡是可以使用switch-case结构的场景，都可以改写为if-else。反之，不成立
② 开发中，如果一个具体问题既可以使用switch-case，又可以使用if-else的时候，推荐使用switch-case。
  为什么？switch-case相较于if-else效率稍高。

*/

import java.util.Scanner;

class SwitchCaseTest {
    public static void main(String[] args) {
        System.out.println("**********Test0**********");
        test0();
        System.out.println("**********Test1**********");
        test1();
        System.out.println("**********Test2**********");
        test2();
    }

    public static void test0() {

        int num = 1;
        switch (num) {

            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break; // 结束当前的switch-case结构
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                // break;
        }

        // 另例：
        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            /*
             * default:
             * System.out.println("季节输入有误");
             * break;
             */
        }

        // 错误的例子：编译不通过
        /*
         * int number = 20;
         * switch(number){
         * case number > 0:
         * System.out.println("正数");
         * break;
         * case number < 0:
         * System.out.println("负数");
         * break;
         * default:
         * System.out.println("零");
         * break;
         * }
         */
    }

    /*
     * 案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
     * 
     */
    public static void test1() {
        // 定义一个学生成绩的变量
        int score = 78;

        // 根据需求，进行分支
        // 方式1：
        /*
         * switch(score){
         * case 0:
         * System.out.println("不及格");
         * break;
         * case 1:
         * System.out.println("不及格");
         * break;
         * //...
         * 
         * case 100:
         * System.out.println("及格");
         * break;
         * default:
         * System.out.println("成绩输入有误");
         * break;
         * 
         * }
         */
        // 方式2：体会case穿透
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入有误");
                break;
        }

        // 方式3：
        switch (score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入有误");
                break;
        }
    }

    /*
     * 案例：编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
     */
    public static void test2() {
        // 1.使用Scanner，从键盘获取2023年的month、day
        Scanner input = new Scanner(System.in);

        System.out.println("请输入2023年的月份：");
        int month = input.nextInt();// 阻塞式方法

        System.out.println("请输入2023年的天：");
        int day = input.nextInt();

        // 假设用户输入的数据是合法的。后期我们在开发中，使用正则表达式进行校验。

        // 2. 使用switch-case实现分支结构
        int sumDays = 0;// 记录总天数
        // 方式1：不推荐。存在数据的冗余
        /*
         * switch(month){
         * case 1:
         * sumDays = day;
         * break;
         * case 2:
         * sumDays = 31 + day;
         * break;
         * case 3:
         * sumDays = 31 + 28 + day;
         * break;
         * case 4:
         * sumDays = 31 + 28 + 31 + day;
         * break;
         * //...
         * case 12:
         * sumDays = 31 + 28 + ... + 30 + day;
         * break;
         * 
         * }
         */
        // 方式2：
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28; // 28:2月份的总天数
            case 2:
                sumDays += 31; // 31:1月份的总天数
            case 1:
                sumDays += day;
                // break;
        }

        System.out.println("2023年" + month + "月" + day + "日是当前的第" + sumDays + "天");

        input.close();// 为了防止内存泄漏
    }
}