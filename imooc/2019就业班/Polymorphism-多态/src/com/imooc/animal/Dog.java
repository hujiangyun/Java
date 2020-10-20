package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/20 4:42 下午
 */
public class Dog extends Animal {
    // 属性：性别
    private int sex;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Dog() {
    }

    public Dog(String name, int month, int sex) {
        super(name,month);
        this.setSex(sex);
    }

    // 方法：睡觉
    public void sleep() {
        System.out.println("狗狗要睡觉");
    }


    // 方法: 重写父类方法
    @Override
    public void eat() {
        System.out.println("狗狗爱吃肉");
    }
}
