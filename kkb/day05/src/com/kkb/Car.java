package com.kkb;

/**
 * @author hjy
 * @create 2020/10/15 10:42 上午
 */
//    构造方法 作用：1、初始化对象 2、初始化变量
//    构造方法 修饰符 类名(){} 方法名和类名一致，没有void，没有返回值类型，可以使用权限修饰符，private
//    当类中没有写构造方法，虚拟机会自动加上无参构造方法
//    如果类中定义了构造方法，会优先使用定义的构造方法
public class Car {
    char sex;
    int age;
    // 无参构造方法
    public Car() {
        System.out.println("无参构造");
    }

    public Car(String name) {
        System.out.println("name = " + name);
    }

    public Car(int age, char sex) {
        this.age = age; // 初始化变量
        this.sex = sex; // 初始化变量
        System.out.println(this.sex);
        System.out.println(this.age);
        System.out.println("构造方法重载，age = " + age + " sex = " + sex);
    }
}
