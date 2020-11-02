package com.imooc.Wrap;

import java.sql.SQLOutput;

/**
 * @author hjy
 * @create 2020/11/2 11:27 上午
 */
public class WrapTestOne {
    public static void main(String[] args) {
        // 装箱：把基本数据类型转换成包装类

//        1、自动装箱
        int  t1 = 10;
        Integer t2 = t1;

//        2、手动装箱
        Integer t3 = new Integer(t1);


        // 测试
        System.out.println("int类型变量t1= " + t1);
        System.out.println("Integer类型对象t2= " + t2);
        System.out.println("Integer类型对象t3= " + t3);
        System.out.println("=============================");

//        拆箱
//        1、自动拆箱
        int t4 = t2;

//        2、手动拆箱
        int t5 = t2.intValue();


//        测试
        System.out.println("Integer类型对象t2= " + t2);
        System.out.println("自动拆箱之后，int类型变量t4= " + t4);
        System.out.println("自动拆箱之后，int类型变量t5= " + t5);

        double d1 = t2.doubleValue();
        System.out.println("double类型d1= " + d1);
    }
}
