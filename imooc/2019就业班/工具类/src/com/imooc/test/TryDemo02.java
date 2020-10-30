package com.imooc.test;

import java.util.Scanner;

/**
 * @author hjy
 * @create 2020/10/30 2:34 下午
 */
public class TryDemo02 {
    public static void main(String[] args) {
        int result = test();
        System.out.println("两数之商为：" + result);
    }

    public static int test() {
        // 要求：定义两个整数，接收用户输入，并求商
        Scanner info = new Scanner(System.in);
        System.out.println("============运算开始============");
        try {
            System.out.print("请输入第一个整数：");
            int n1 = info.nextInt();
            System.out.print("请输入第二个整数：");
            int n2 = info.nextInt();
            return n1 / n2;
        } catch (ArithmeticException e) { // ArithmeticException算数异常
            System.out.println("除数不能为0");
//            e.printStackTrace(); // 输出异常信息
            return 0;
        } finally {
            System.out.println("============运算结束============");
//            return -100000;
        }
    }
}
