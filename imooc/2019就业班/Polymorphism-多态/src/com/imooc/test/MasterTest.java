package com.imooc.test;

import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Master;

/**
 * @author hjy
 * @create 2020/10/23 10:51 上午
 */
public class MasterTest {
    public static void main(String[] args) {
        Master m1 = new Master();
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        m1.feed(c1);
        m1.feed(d1);
    }
}
