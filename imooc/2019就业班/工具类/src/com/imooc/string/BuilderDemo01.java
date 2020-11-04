package com.imooc.string;

/**
 * @author hjy
 * @create 2020/11/4 11:28 上午
 */
public class BuilderDemo01 {
    public static void main(String[] args) {
        // 定义一个字符串"你好"
        StringBuilder str = new StringBuilder("你好");
        // 在"你好"之后添加字符，变成"你好，imooc";
        str.append(",").append("imooc");
        System.out.println("str = " + str);

        // 将字符串变成"你好，IMOOC"
        // 两种方式
        // 方式一：先删除，后添加
//        str.delete(3,str.length()).insert(3,"IMOOC");
//        System.out.println(str);

        // 方式二：替换
        str.replace(3,str.length(),"IMOOC");
        System.out.println(str);
    }
}
