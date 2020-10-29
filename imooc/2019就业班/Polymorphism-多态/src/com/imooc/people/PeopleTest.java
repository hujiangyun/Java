package com.imooc.people;

/**
 * @author hjy
 * @create 2020/10/28 11:13 上午
 */
public class PeopleTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.age = 20;

        /*// 获取成员内部类的实例，方式一
        Person.Heart h1 = new Person().new Heart();
        System.out.println(h1.beat());

        System.out.println("==================");

        // 获取成员内部类的实例，方式二，通过外部类的方法获得内部类
        h1 = p1.getHeart();
        System.out.println(h1.beat());*/

        // 获取静态内部类实例，方式一
//        Person.Heart h1 = new Person.Heart();
//        System.out.println(h1.beat());
//        Person.Heart.say();

        // 获取静态内部类实例，方式二
//        h1 = p1.getHeart();
//        System.out.println(h1.beat());

        System.out.println(p1.getHeart());

    }
}
