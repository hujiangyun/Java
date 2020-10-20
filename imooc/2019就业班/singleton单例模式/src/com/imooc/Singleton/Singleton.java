package com.imooc.Singleton;

/**
 * @author hjy
 * @create 2020/10/20 3:09 下午
 */
// 单例模式 -- 恶汉式：创建对象实例时，直接初始化  空间换时间
public class Singleton {
//    1、私有构造
    private Singleton(){

    }

//    2、创建该类型的私有静态实例
    private static Singleton instance = new Singleton();

//    3、创建公有静态方法返回静态实例对象
    public static Singleton getInstance(){
        return Singleton.instance;
    }
}
