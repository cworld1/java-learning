package g_oop3.d_block;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:01
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        // System.out.println(Person.info);

        Person p1 = new Person();
        System.out.println(p1.age);// 1       Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p2.age);// 1
        // p1.eat();
    }
}

class Person {

    static String info = "我是一个人";

    // 静态代码块
    static {
        System.out.println("静态代码块1");
        System.out.println("info = " + info);
        // System.out.println("age = " + age);
        // eat();
    }
    static {
        System.out.println("静态代码块2");
    }

    String name;
    int age;

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
        System.out.println("age = " + age);
        eat();
    }
    {
        System.out.println("非静态代码块2");
    }

    public Person() {
    }
    public void eat() {
        System.out.println("人吃饭");
    }
}
