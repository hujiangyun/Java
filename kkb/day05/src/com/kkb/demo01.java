package com.kkb;

/**
 * @author hjy
 * @create 2020/10/14 1:56 下午
 */
//面向对象
public class demo01{
    public static void main(String[] args) {
        Student hon = new Student();
        Student ming = new Student();
        Teacher t1 = new Teacher();
        t1.name = "溜溜";
        Phone _phone = new Phone();
        _phone.call("小明");
        _phone.sendMessage();
    }
}
