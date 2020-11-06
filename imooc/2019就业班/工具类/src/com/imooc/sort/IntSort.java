package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author hjy
 * @create 2020/11/6 4:54 下午
 */
public class IntSort {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(1);
        System.out.println("排序前的数据：");
        for (int num:arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 对list数据进行排序
        Collections.sort(arr);

        // 排序后的数据
        System.out.println("排序后的数据：");
        for (int num:arr) {
            System.out.print(num + " ");
        }
    }
}
