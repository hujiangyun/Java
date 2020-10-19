package com.kkb;

/**
 * @author hjy
 * @date 2020/9/30 10:27 上午
 */
// 基本数据类型转换
public class demo01 {
    public static void main(String[] args) {
        // 自动类型转换，小范围类型转换为大范围数据类型(只能从小范围转换为大范围)
        // byte short char计算时先转换为int
        int i1 = 100;
        byte b1 = 10;
        int i2 = i1 + b1;
        short s1 = 20;
        int i3 = b1 + s1;
        int i4 = 100;
        double d1 = 10;
        double i5 = d1 + i4;
//        byte b2 = i1 + b1; // 大范围int i1转换为小范围byte b2报错
//        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

//        2.强制类型转换 大范围数据类型转换为小范围数据类型
        int i = (int) 1.5; // 强制类型转换
        byte b2 = (byte) i1; // 强制类型转换
        long l = 100L;
        int i6 = (int) l;
        char c = '你';
        int i7 = c + 10;
        System.out.println(i7);
    }
}
