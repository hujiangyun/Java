package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/15 4:45 下午
 */
public class Cat extends Animal {
    private double weight; // 体重
    public static int st3 = 44;
//    public int temp = 300;

    // 子类静态代码块，低于父类静态代码块，高于父类构造代码块
    static {
//        System.out.println(Cat.st3);
        System.out.println("Cat静态代码块");
    }

    // 子类构造代码块，执行顺序低于本身静态代码块、父类静态代码块和构造代码块、构造参数
    {
        System.out.println("Cat构造代码块");
    }

    // 奔跑的方法
    public void run() {
        eat();
        System.out.println(this.getName() + "是一只" + this.getSpecies() + "，它在快乐的奔跑");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat() {
        System.out.println("Cat无参构造");
    }

    public Cat(String name, int month){
//        super(name, month);
        this(); // 调用当前无参构造函数
        // 子类构造默认调用的是父类的无参构造
        System.out.println("Cat带参构造");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println("Cat主函数");
    }
}
