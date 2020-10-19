package com.kkb;
import java.util.Random;

/**
 * @author hjy
 * @create 2020/10/15 10:45 上午
 */
public class demo03 {
    int temp = 12;
    public static void run (){
        {
            int temp = 10;
            System.out.println(temp);
        }
        {
            int temp = 12;
            System.out.println(temp);
        }
        int temp = 12;
        System.out.println(temp);
    }
    public static void main(String[] args) {
        // 无参构造创建对象
        Car car1 = new Car();

        // 有参构造创建对象
        Car car2 = new Car("car");

        // 有参构造创建对象
        Car car3 = new Car(18, '男');
        run();
    }
}
