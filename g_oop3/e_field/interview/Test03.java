package g_oop3.e_field.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 16:03
 */
public class Test03 {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.method(10);
    }
}

class Base {
    {
        System.out.println("base");
    }

    Base() {
        method(100); // 调用的是子类重写的方法（带 this 也没用）
    }

    // 该方法被子类重写了，无法再被父类调用
    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    {
        System.out.println("sub");
    }

    Sub() {
        super.method(70); // 调用的是父类的原始方法
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}
