package b_vars_operators;

/*
要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
*/
class StringExer {
    public static void main(String[] args) {

        // 练习 1
        System.out.println("******练习 1******");
        String name = "李进";
        int age = 24;
        char gender = 'F';
        double weight = 130.5;
        boolean isMarried = false;
        String phoneNumber = "13012341234";

        String info = "name = " + name + ",age = " + age + ",gender = " + gender + ",weight = " + 
            weight + ",isMarried = " + isMarried + ",phoneNumber = " + phoneNumber;

        System.out.println(info);

        // 练习 2
        System.out.println("******练习 2******");
        //String str1 = 4;                       //判断对错：no
        String str2 = 3.5f + "";               //判断str2对错：yes
        System.out.println(str2);              //输出：3.5
        System.out .println(3+4+"Hello!");     //输出：7Hello!
        System.out.println("Hello!"+3+4);      //输出：Hello!34
        System.out.println('a'+1+"Hello!");    //输出：98Hello!
        System.out.println("Hello"+'a'+1);     //输出：Helloa1

        //练习2：
        System.out.println("*    *");                //输出：*    *
        System.out.println("*\t*");                    //输出：*    *
        System.out.println("*" + "\t" + "*");        //输出：*    *
        System.out.println('*' + "\t" + "*");        //输出：*    *
        System.out.println('*' + '\t' + "*");        //输出：51*
        System.out.println('*' + "\t" + '*');        //输出：*    *
        System.out.println("*" + '\t' + '*');        //输出：*    *
        System.out.println('*' + '\t' + '*');        //输出：93
    }
}
