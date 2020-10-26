package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

/**
 * @author hjy
 * @create 2020/10/20 4:48 下午
 */
public class demo01 {
    public static void main(String[] args) {
        /*
         * 向上转型, 父类引用指向子类对象
         * */
//        Animal a1 = new Animal(); // 1
        Animal c1 = new Cat();    // 2
        Animal d1 = new Dog(); // 3
//        a1.eat();
        c1.eat();
        d1.eat();
        System.out.println("============================");

        /*
         * 向下转型，子类引用指向父类对象，要满足转换条件才能强转
         * instanceof 判断某一个对象是否满足强制转换成一个类的，返回true/false
         * */
        if (c1 instanceof Cat) {
            Cat c2 = (Cat) c1;
            c2.setName("花花");
            c2.run();
            c2.eat();
        }

        if (c1 instanceof Dog) {
            Dog d2 = (Dog) c1;
            d2.eat();
            d2.sleep();
        }
        if(c1 instanceof Animal){
            System.out.println("c1 instanceof Animal");
        }
        if(c1 instanceof Object){
            System.out.println("c1 instanceof Object");
        }
    }
}
