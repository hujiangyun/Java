package com.imooc.anonymous;

/**
 * @author hjy
 * @create 2020/10/29 11:07 上午
 */
public abstract class Person {
    private String name;

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();
}
