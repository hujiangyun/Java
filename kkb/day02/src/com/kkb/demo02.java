package com.kkb;

/**
 * @author hjy
 * @date 2020/9/30 3:17 下午
 */
//运算符
public class demo02 {
    public static void main(String[] args) {
//        1、算数运算符
        // + - * / % 整数(除了float double之外的数字类型数据)使用算数运算符势，无论怎么计算，都不会出现小数
        int i = 100;
        byte b = 11;
//        double d = i/b;
        System.out.println(i / b);
        System.out.println(3 + 2);
        System.out.println(3 - 2);
        System.out.println(3 / 2);
        System.out.println(3 * 2);
        System.out.println(5 % 2);

//        2、赋值运算符
        int a = 100;
        int c = 109;
        a += c; // 相加之后赋值
        System.out.println(a);

        short s = 1;
        s += 1; // s += 1 => s = s+1 => s = (short)(s+1)；
        System.out.println(s);

//        3、自增、自减运算符
        short v = 1;
        int i1 = ++v;
//        short v2 = 1;
//        int i2 = v2++;
        System.out.println("++v= " + i1);
//        System.out.println("v2++= " + i2);
    }
}
