package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/20 4:10 下午
 */
public class Cat extends Animal {
    // 属性：体重
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat() {
    }

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.setWeight(weight);
    }

    // 方法：跑动
    public void run() {
        System.out.println(this.getName() + "跑起来了");
    }

    // 方法：重写父类方法
    @Override
    public void eat() {
        System.out.println("猫猫爱吃鱼");
    }

    public void playBall(){
        System.out.println("猫玩毛线球了");
    }
}
