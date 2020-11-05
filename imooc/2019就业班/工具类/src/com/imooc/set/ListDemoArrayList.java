package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hjy
 * @create 2020/11/4 5:02 下午
 */
public class ListDemoArrayList {
    public static void main(String[] args) {
        // 用ArrayList存储编程语言的名称，并输出
        List list = new ArrayList();
        list.add("Java");
        list.add("Go");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");
        list.add("swift");
        System.out.println(list.size());

        // 遍历输出所有语言
        System.out.println("===============");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println("****************");

        // 删除列表中的C++
//        list.remove("C++"); // 具体的对象或者基本数据
        list.remove(3); // 下标
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
