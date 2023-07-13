package g_oop3.a_static.apply;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:40
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        Circle c4 = new Circle(2.3);
        System.out.println(c4);

        System.out.println("Total: " + Circle.total);

    }
}

class Circle {

    static int total;// 创建的Circle实例的个数
    private static int init = 1001; // 自动给id赋值的基数

    double radius;// 实例变量

    int id;// 编号

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
