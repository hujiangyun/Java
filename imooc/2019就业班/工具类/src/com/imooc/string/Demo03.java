package com.imooc.string;

/**
 * @author hjy
 * @create 2020/11/3 4:41 下午
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        // 字符串和byte数组之间的互相转换
        // 定义字符串
        String str = new String("JAVA 编程 基础");
        // 将字符串转换成byte数组，并输出 getBytes();
        byte[] arrs = str.getBytes("GBK");
        for (byte arr : arrs) {
            System.out.print(arr + " ");
        }

        System.out.println();
        // 将byte数组转换为字符串 new String(args) args => 字符串、字符、byte数组
        String str1 = new String(arrs, "GBK"); // 保持和getBytes编码格式(字符集)一致
        System.out.println(str1);
    }
}
