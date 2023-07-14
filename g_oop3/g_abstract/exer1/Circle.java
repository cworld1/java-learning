package g_oop3.g_abstract.exer1;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:51
 * @Version 1.0
 */
public class Circle extends GeometricObject {

    private double radius;// 半径

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 重写了抽象方法 findArea
    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
