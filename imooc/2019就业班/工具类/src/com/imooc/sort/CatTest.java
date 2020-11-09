package com.imooc.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hjy
 * @create 2020/11/9 10:52 上午
 */
public class CatTest {
    public static void main(String[] args) {
        // 按名字升序排序
        Cat c1 = new Cat("花花", 12, "田园猫");
        Cat c2 = new Cat("凡凡", 2, "短腿猫");
        Cat c3 = new Cat("毛毛", 3, "田园猫");
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(c1);
        catList.add(c2);
        catList.add(c3);

        // 排序前
        System.out.println("按名称排序前：");
        for (Cat c : catList) {
            System.out.println(c);
        }

        // 按名字升序排序
        catList.sort(new NameComparator());

        // 排序后
        System.out.println("按名称排序后：");
        for (Cat c : catList) {
            System.out.println(c);
        }

    }
}
