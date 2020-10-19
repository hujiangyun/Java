package com.kkb;

import java.util.Arrays;

/**
 * @author hjy
 * @date 2020/10/12 9:38 上午
 */
//数组
public class demo01 {
    public static void main(String[] args) {
//        int[] arr = new int[1]; // 方式一
//        int[] arr = new int[]{1, 2, 3}; // 方式二
        int[] arr = {22, 23, 24, 1, 3, 2, 5, 9, 1}; // 方式三
        // foreach
//        for (int i : arr) {
//            System.out.println(i);
//        }
        // for循环
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            System.out.println("i = " + i);
//        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

