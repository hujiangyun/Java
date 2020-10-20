package com.imooc.test;

import com.imooc.animal.Animal;

/**
 * @author hjy
 * @create 2020/10/20 10:18 上午
 */
public class demo03 {
    public static void main(String[] args) {
//        Animal a1 = new Animal("花花", 2);
//        Animal a2 = new Animal("花花", 2);
//        Animal a2 = null;
        // equals
//        boolean bol1 = a1.equals(a2);
//        System.out.println("a1 和 a2的引用比较" + bol1);
//        System.out.println("a1 和 a2的引用比较" + (a1 == a2));
//        System.out.println("--------------------------------------");
        String s1 = new String("hello");
        String s2 = new String("hello");
        boolean bol2 = s1.equals(s2);
        System.out.println("s1 和 s2的引用比较" + bol2);
        System.out.println("s1 和 s2的引用比较" + (s1 == s2));
        System.out.println("--------------------------------------");

        /*
        * toString
        * */
        Animal a1 = new Animal("花花", 2);
        Animal a2 = new Animal("花花", 2);
        System.out.println(a1.toString());
        System.out.println(a1); // 默认会调用toString方法
        System.out.println("--------------------------------------");
        System.out.println(s1);
    }
}
