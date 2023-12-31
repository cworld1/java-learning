package f_oop2.c_override.test1;
/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:11
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        // 通过对象调用Order类中声明的属性、方法
        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        // 受封装性的影响，不能调用
        // order.orderPrivate = 1;
        // order.methodPrivate();

    }
}
