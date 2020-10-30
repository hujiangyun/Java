package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author hjy
 * @create 2020/10/30 2:56 下午
 */
public class TryDemo03 {
    public static void main(String[] args) {
        try {
            int result = test();
            System.out.println("两数之商为：" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        }
    }

    /**
     *
     * @return 两个整数的商
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException, InputMismatchException {
        // 要求：定义两个整数，接收用户输入，并求商
        Scanner info = new Scanner(System.in);
        System.out.println("============运算开始============");
        System.out.print("请输入第一个整数：");
        int n1 = info.nextInt();
        System.out.print("请输入第二个整数：");
        int n2 = info.nextInt();
        System.out.println("============运算结束============");
        return n1 / n2;
    }
}
