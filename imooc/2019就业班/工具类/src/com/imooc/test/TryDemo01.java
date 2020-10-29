package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author hjy
 * @create 2020/10/29 4:47 下午
 */
public class TryDemo01 {


    public static void main(String[] args) {
        // 要求1：定义两个整数，输出两数之商

        /*int n1 = 12;
        int n2 = 2;
        System.out.println("n1和n2的商是： " + (n1 / n2));
        */

        // 要求2：定义两个整数，接收用户输入，并求商
        Scanner info = new Scanner(System.in);
        System.out.println("============运算开始============");
        try {
            System.out.print("请输入第一个整数：");
            int n1 = info.nextInt();
            System.out.print("请输入第二个整数：");
            int n2 = info.nextInt();
            System.out.println("两数之商为：" + (n1 / n2));
        } catch (ArithmeticException e) { // ArithmeticException算数异常
            System.out.println("除数不能为0");
            e.printStackTrace(); // 输出异常信息
        } catch (InputMismatchException e) { // InputMismatchException 输入异常（输入不匹配）
            System.out.println("请输入整数");
            e.printStackTrace(); // 输出异常信息
        } finally {
            System.out.println("============运算结束============");
        }
    }
}
