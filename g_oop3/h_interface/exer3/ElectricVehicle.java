package g_oop3.h_interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:15
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower {

    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    // 重写的抽象类的抽象方法
    @Override
    public void run() {
        System.out.println("电动车通过电机驱动行驶");
    }

    // 实现的接口的抽象方法
    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}
