package g_oop3.h_interface.exer3;

/**
 * ClassName: Car
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:17
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower {
    private String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    // 重写的抽象类的抽象方法
    @Override
    public void run() {
        System.out.println("汽车通过内燃机驱动行驶");
    }

    // 实现的接口的抽象方法
    @Override
    public void power() {
        System.out.println("汽车通过汽油提供动力");
    }
}
