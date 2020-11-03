package com.imooc.wrapper;

/**
 * @author hjy
 * @create 2020/11/2 2:53 下午
 */
public class WrapTestTwo {
    public static void main(String[] args) {
//        将基本数据类型转换成字符创
        int t1 = 2;
        String t2 = Integer.toString(t1);
//        测试
        System.out.println("转换后字符串对象值t2= " + t2);

//        字符串转换成基本数据类型

//        1、包装类的parseInt方法
        int t3 = Integer.parseInt(t2);
        int t4 =  Integer.valueOf(t2);
//        测试
        System.out.println("String类型转换成int类型t3= " + t3);
        System.out.println("String类型转换成int类型t4= " + t4);
    }
}
