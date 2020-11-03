package com.imooc.string;

/**
 * @author hjy
 * @create 2020/11/3 5:04 下午
 */
public class Demo04 {
    public static void main(String[] args) {
        // equals和==的区别
        // 定义三个字符串，内容都是imooc
        /*
        *  内存空间
        *  栈：存放类的引用(变量名) str
        *  堆：存放new String()对象
        *  常量池：存放字符串常量（变量值） "a", "b"
        * */
        String str1 = "imooc"; // 在栈中生成引用str1，常量池中生成"imooc"；
        String str2 = "imooc"; // 在栈中生成str2，发现常量池中有imooc，不会生成新的imooc，将直接指向常量池中的imool，所以str1 == str2为true
        String str3 = new String("imooc");
        System.out.println("str1和str2内容是否相同？" + str1.equals(str2));
        System.out.println("str1和str3内容是否相同？" + str1.equals(str3));
        System.out.println("==============================");
        System.out.println("str1和str2地址是否相同？" + (str1 == str2));
        System.out.println("str1和str3地址是否相同？" + (str1 == str3));
    }
}
