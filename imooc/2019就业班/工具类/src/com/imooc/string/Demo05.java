package com.imooc.string;

public class Demo05 {
    public static void main(String[] args) {
        // String不可变性
        // String对象一旦被创建，则不能被修改
        // 修改：创建新对象之后，指向的内存空间不变
        String s1 = "imooc";
        String s2 = "hello," + s1;
        // s1 不在指向imooc所在内存空间，而是指向了"hello,imooc"；
        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);

        String s3 = new String("hello,imooc");
        System.out.println("子串：" + s3.substring(0, 5));
        System.out.println("s3 = " + s3);
    }
}
