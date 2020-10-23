package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/23 10:43 上午
 */
// 主人类
public class Master {
    /* 喂宠物
    * 喂猫米：吃完东西之后，主人会带着去玩毛线球
    * 喂狗狗：吃完东西之后，主人会带着狗狗去睡觉
    * */

    /*
    * 方案1，通过方法重载实现不同动物的形态，传入不同种类动物类
    * */
//    public void feed (Cat cat){
//        cat.eat();
//        cat.playBall();
//    }
//    public void feed (Dog dog){
//        dog.eat();
//        dog.sleep();
//    }
    /*
    * 方案2 利用向上转型，类转换，传入动物的父类 Animal，调用子类方法
    * */
    public void feed (Animal obj){
        if(obj instanceof Cat){
            Cat temp = (Cat)obj;
            temp.eat();
            temp.playBall();
        } else if (obj instanceof Dog){
            Dog temp = (Dog)obj;
            temp.eat();
            temp.sleep();
        }
    }
}
