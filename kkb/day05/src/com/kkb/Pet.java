package com.kkb;

/**
 * @author hjy
 * @create 2020/10/15 10:16 上午
 */
public class Pet {
    private String type = "宠物";
    String name;

    // 设置private修饰的内部变量
    public void setName(String n) {
        name = n;
    }

    // 访问private修饰的内部变量
    public String getName() {
        return name;
    }
}
