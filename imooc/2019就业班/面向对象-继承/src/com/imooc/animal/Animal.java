package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/15 4:36 下午
 */
public class Animal {
    private String name; // 昵称
    private int month; // 月份
    private String species; // 品种
    public int temp = 15;

    // 静态成员
    private static int st1 = 22;
    public static int st2 = 23;

    // 父类静态代码块，执行顺序高于子类静态代码代码块
    static {
//        System.out.println(Animal.st1);
        System.out.println("Animal静态代码块");
    }
    // 父类构造代码块，执行顺序低于本身静态和子类静态代码块
    {
        System.out.println("Animal构造代码块");
    }

    // 昵称获取方法 name-get
    public String getName() {
        return name;
    }

    // 昵称设置方法 name-set
    public void setName(String name) {
        this.name = name;
    }

    // 月份获取方法 month-get
    public int getMonth() {
        return month;
    }

    // 月份设置方法 month-set
    public void setMonth(int month) {
        this.month = month;
    }

    // 品种获取方法 species-get
    public String getSpecies() {
        return species;
    }

    // 品种设置方法 species-set
    public void setSpecies(String species) {
        this.species = species;
    }

    // 父类无参构造方法，执行顺序低于父类、子类静态，构造代码块
    public Animal() {
        System.out.println("Animal无参构造");
    }

    public Animal(String name, int month){
        System.out.println("Animal带参构造");
    }

    public static void main(String[] args) {
        System.out.println("主函数");
    }

    // 吃的方法
    public void eat() {
        System.out.println(this.getName() + "在吃饭鸭");
    }

    public void eat(String name) {
        System.out.println(name + "在吃饭鸭");
    }
}
