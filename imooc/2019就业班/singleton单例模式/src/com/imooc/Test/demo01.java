package com.imooc.Test;

import com.imooc.Singleton.Singleton;
import com.imooc.Singleton.SingletonTwo;

/**
 * @author hjy
 * @create 2020/10/20 3:08 下午
 */
public class demo01 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("=================================================");
        SingletonTwo ss1 = SingletonTwo.getInstance();
        SingletonTwo ss2 = SingletonTwo.getInstance();
        System.out.println(ss1 == ss2);
        System.out.println(ss1);
        System.out.println(ss2);
    }
}
