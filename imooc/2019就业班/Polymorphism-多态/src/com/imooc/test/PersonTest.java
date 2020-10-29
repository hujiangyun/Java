package com.imooc.test;

//import com.imooc.anonymous.Man;

import com.imooc.anonymous.Person;
//import com.imooc.anonymous.Woman;

/**
 * @author hjy
 * @create 2020/10/29 11:11 上午
 */
public class PersonTest {
    // 根据传入不同人的类型，调用对应的方法
    // 方案一：方法重载，写多个方法调用对应的阅读方法
//    public void getRead (Man man){
//        man.read();
//    }
//    public void getRead (Woman woman){
//        woman.read();
//    }

    // 方案二：多态，类型转换
    public void getRead(Person person) {
        person.read();
    }

    public static void main(String[] args) {
        PersonTest p1 = new PersonTest();
//        Man m1 = new Man();
//        Woman w1 = new Woman();
//        p1.getRead(m1);
//        p1.getRead(w1);

        // 方案三：匿名内部类
        /*
        * 1、没有类型名称，没有实例名称
        * 2、编译后的文件名：外部类$数字.class
        * 3、无法使用public private protected abstract static修饰
        * 4、无法编写构造方法，可以使用构造代码块（不推荐使用)
        * 5、不能出现静态成员
        * 6、可以继承父类，也可以实现接口，但是 不能兼得
        * */
        p1.getRead(new Person() {
            {
                // 构造代码块
            }
            public int a = 1;
//            public static int b = 2;
            @Override
            public void read() {
                System.out.println("男生喜欢看玄幻小说");
            }
        });
        p1.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生喜欢看言情小说");
            }
        });
    }
}
