package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/15 5:01 下午
 */
public class Dog extends Animal {
    private String sex; // 性别

    // 睡觉方法
    public void sleep() {
//        super.eat(); // 通过super（父类对象的引用）调用父类的方法（如果子类中有重写方法）
        eat(); // 调用自己重写父类的方法；
        System.out.println(this.getName() + "现在" + this.getMonth() + "个月大，它在睡觉");
    }

    // 子类重写父类方法
    public void eat() {
        System.out.println(this.getName() + "最近没有食欲，不想吃东西~~");
    }

    public void eat(String name2) {
        System.out.println(name2 + "最近没有食欲，不想吃东西~~");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog() {
    }
}
