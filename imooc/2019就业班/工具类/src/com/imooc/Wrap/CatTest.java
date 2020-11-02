package com.imooc.Wrap;

/**
 * @author hjy
 * @create 2020/11/2 3:33 下午
 */
public class CatTest {
    public static void main(String[] args) {
//        实例化对象
        Cat c1 = new Cat();
//        测试
        System.out.println("小猫的昵称：" + c1.name);
        System.out.println("小猫的年龄：" + c1.age);
        System.out.println("小猫的体重：" + c1.weight);
        System.out.println("******************************");


        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println("i1 == i2的结果：" + (i1 == i2));

        Integer i3 = 100;
        System.out.println("i3 == 100的结果：" + (i3 == 100));

        Integer i4 = 100;
        System.out.println("i3 == i4的结果：" + (i3 == i4));

        Integer i5 = 200;
        Integer i6 = 200;
        System.out.println("i5 == i6的结果：" + (i5 == i6));


    }
}
