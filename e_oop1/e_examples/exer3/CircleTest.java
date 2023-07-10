package e_oop1.e_examples.exer3;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:07
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius = 2.3;

        // 方法一：
        c1.findArea();

        // 方法二：
        System.out.println("面积为：" + c1.findArea2());

    }
}
