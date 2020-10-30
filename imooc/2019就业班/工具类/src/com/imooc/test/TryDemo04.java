package com.imooc.test;

import java.util.Scanner;

/**
 * @author hjy
 * @create 2020/10/30 4:00 下午
 */
public class TryDemo04 {
    public static void main(String[] args) {
        try {
            testAge();
        } catch (HotelAgeException e){
            System.out.println(e.getMessage());
            System.out.println("酒店前台工作人员不能办理入住登记手续");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // getMessage() 获取抛出异常的报错信息
            e.printStackTrace();
        }
    }

    /*
    * throw抛出异常对象的处理方案
    * 1、通过try-catch包含throw语句--自己抛出异常，自己处理
    * 2、通过throws在方法声明处抛出异常，谁调用谁处理
    * */

    // 描述酒店入住规则：限定年龄，18岁以下，80岁以上的住客必须由亲友陪同
    public static void testAge() throws Exception{  // throws Exception谁调用谁处理
        System.out.print("请输入年龄:");
        Scanner info = new Scanner(System.in);
        int age = info.nextInt();
        if (age < 18 || age > 80) {
//            throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同"); // 抛出异常
            throw new HotelAgeException();
        } else {
            System.out.println("欢迎入住本店");
        }
    }

    /*public void testAge(){
        System.out.println("请输入年龄");
        Scanner info = new Scanner(System.in);
        int age = info.nextInt();
        // 自己处理
        try {
            if (age < 18 || age > 80) {
                throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同"); // 抛出异常
            } else {
                System.out.println("欢迎入住本店");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
