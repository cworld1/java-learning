/**
 * Description: A simple project for test.
 * 
 * @Author: CWorld
 * @Version: V1.0
 */
public class Test1 {
    public static void main(String[] args) {
        // int a;
        // System.out.println(a); // 报错：变量a未初始化
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(++arr[i]);
        }
    }
}