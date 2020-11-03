package com.imooc.string;

/**
 * @author hjy
 * @create 2020/11/3 3:33 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        // 定义字符串 "Java 编程 基础"
        String str = "Java 编程 基础";
        // 输出字符串长度 length()
        System.out.println("字符串的长度：" + str.length());

        // 取出字符"程"并输出 charAt
        System.out.println(str.charAt(6));

        // 取出字符"编程"并输出substring()
        System.out.println(str.substring(5, 7));
    }
}
