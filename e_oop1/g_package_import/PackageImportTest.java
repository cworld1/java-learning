package e_oop1.g_package_import;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.lang.reflect.Field;
import java.util.*;

import static java.lang.System.out;
import static java.lang.Math.PI;

import e_oop1.g_package_import.test.Person;

/**
 * ClassName: PackageImportTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:13
 * @Version 1.0
 */
public class PackageImportTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.close();

        ArrayList<String> list = new ArrayList<>(2);
        out.println("list: " + list);

        HashMap<String, Integer> map = new HashMap<>();
        out.println("map: " + map);

        HashSet<String> set = new HashSet<>();
        out.println("set: " + set);

        String str = "hello";
        out.println("str: " + str);

        Person p = new Person();
        out.println("p: " + p);

        Field field = null;
        out.println("field: " + field);

        // Date可以使用import的方式指明
        Date date = new Date();
        out.println("date: " + date);

        // 使用全类名的方式
        java.sql.Date date1 = new java.sql.Date(121231231L);
        out.println("date1: " + date1);

        out.println("hello");

        out.println("PI: " + PI);

    }
}
