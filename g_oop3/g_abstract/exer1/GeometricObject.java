package g_oop3.g_abstract.exer1;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:47
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 计算面积的方法无法固定，需要子类重写，所以我们采用抽象方法
    public abstract double findArea();
}
