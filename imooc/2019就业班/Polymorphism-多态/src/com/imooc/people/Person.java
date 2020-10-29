package com.imooc.people;

/**
 * @author hjy
 * @create 2020/10/28 11:10 上午
 */
// 外部类
public class Person {
    public int age;

    public Object getHeart() {
//        return new Heart();
        // 方法内部类
        /*
        * 1、定义在方法内部，作用范围也在方法内部
        * 2、和方法内部成员使用规则一样，class前面不能添加public private protected static修饰符
        * 3、类中不能包含静态成员
        * 4、可以有final修饰的成员，abstract（抽象）成员（不推荐）
        * */
        class Heart {
            public static final int age = 20; // 常量

            public void say() {
                System.out.println("hello");
            }

            public String beat() {
                Person p1 = new Person();
                p1.eat();
                return p1.age + "岁的心脏在跳动";
            }
        }
        return new Heart().beat();
    }

    public void eat() {
        System.out.println(age + "岁的人是会吃东西的");
    }

    // 成员内部类
    /*public class Heart{
        int age = 30;
        public void eat(){
            System.out.println("内部类吃饭");
        }
        public String beat(){
            Person.this.eat();
            return age + "心脏在跳动";
        }
    }*/

    // 静态成员内部类
    /*
     * 1、静态内部类中只能直接访问外部类的静态成员，如果需要访问非静态成员，需要通过对象实例调用
     * 2、静态内部类实例时，可以不依赖于外部类
     * 3、可以通过 外部类.内部类.静态成员 的方式，访问静态内部类的静态成员
     * 4、当内部类的成员和外部类的成员同名时，优先访问内部类的成员，
     *    如果需要访问外部类的静态成员时，可以通过 外部类.属性 的方式访问
     *    如果需要访问外部类的非静态成员时，可以通过 实例外部类（new 外部类()）.属性 的方式访问
     * */
//    public static class Heart{
//        static int age = 20;
//        public static void say(){
//            System.out.println("hello");
//        }
//        public String beat(){
//            Person p1 = new Person();
//            p1.eat();
//            return p1.age + "岁的心脏在跳动";
//        }
//    }

}
