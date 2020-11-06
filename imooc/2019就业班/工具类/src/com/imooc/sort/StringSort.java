package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hjy
 * @create 2020/11/6 5:01 下午
 */
public class StringSort {
    public static void main(String[] args) {
        // 对存放在List中的字符串进行排序
        List<String> str = new ArrayList<String>();
        str.add("orange");
        str.add("blue");
        str.add("yellow");
        str.add("gray");

        // 排序前的数据
        System.out.println("排序前的数据");
        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 排序
        Collections.sort(str);

        // 排序后的数据
        System.out.println("排序后的顺序");
        for (String s : str) {
            System.out.println(s + " ");
        }
    }
}
