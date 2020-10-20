package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/20 4:06 下午
 */
public class Animal {
    // 属性：年龄，昵称
    private String name;
    private int month;

    public Animal() {
    }

    public Animal(String name, int month) {
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // 方法：吃东西
    public void eat() {
        System.out.println("所有动物都有吃东西的能力");
    }
}
