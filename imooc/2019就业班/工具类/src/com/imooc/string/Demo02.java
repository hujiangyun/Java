package com.imooc.string;

/**
 * @author hjy
 * @create 2020/11/3 4:10 下午
 */
public class Demo02 {
    public static void main(String[] args) {
        // 定义字符串： "JAVA编程基础，我喜欢JAVA编程"
        String str = new String("JAVA编程基础，我喜欢java编程");

        // 查找字符A第一次出现的位置
        System.out.println("字符A第一次出现的位置：" +str.indexOf("A"));

        // 查找子字符串"编程"在字符串第一次出现的位置 双引号内出现双引号，使用转义字符 \\
        System.out.println("字符串\"编程\"在字符串第一次出现的位置：" +str.indexOf("编程"));

        // 查找字符A最后一次出现的位置
        System.out.println("查找字符A最后一次出现的位置：" +str.lastIndexOf("A"));

        // 查找子字符串"编程"在字符串最后一次出现的位置 双引号内出现双引号，使用转义字符 \\
        System.out.println("字符串\"编程\"在字符串最后一次出现的位置：" +str.lastIndexOf("编程"));
    }
}
