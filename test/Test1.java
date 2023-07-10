package test;

/**
 * Description: A simple project for test.
 * 
 * @Author: CWorld
 * @Version: V1.0
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(++arr[i]);
        }
    }

    int a;

    public Test1() {
    }

    public Test1(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Test1 [a=" + a + "]";
    }
    
}