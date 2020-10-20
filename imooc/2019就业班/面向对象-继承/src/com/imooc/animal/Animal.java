package com.imooc.animal;

/**
 * @author hjy
 * @create 2020/10/15 4:36 下午
 */
// final 不允许有子类
public class Animal {
    private String name; // 昵称
    private int month; // 月份
    private String species; // 品种
    public final static int temp = 123;

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

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
        System.out.println("Animal带参构造");
    }

    public static void main(String[] args) {
        System.out.println("主函数");
    }

    // 吃的方法
    public void eat() {
        final Animal animal = new Animal("凡凡", 1);
        animal.month = 12;
        animal.name = "豆豆";
        System.out.println(this.getName() + "在吃饭鸭");
    }

    public void eat(String name) {
//        final int temp = 123;
//        temp = 10;
        System.out.println(name + "在吃饭鸭");
    }

    // 重写Object类中的equals方法
    public boolean equals(Object obj) {
        boolean bol;
        if (obj == null) {
            bol = false;
        } else {
            Animal temp = (Animal) obj;
            bol = this.getName().equals(temp.getName()) && this.getMonth() == temp.getMonth();
        }
        return bol;
    }

    // 重载本类中的equals方法，入参必须为Animal实例
    public boolean equals(Animal obj) {
        boolean bol;
        if (obj == null) {
            bol = false;
        } else {
            bol = this.getName().equals(obj.getName()) && this.getMonth() == obj.getMonth();
        }
        return bol;
//        return this.getName().equals(obj.getName()) && this.getMonth() == obj.getMonth();
    }

    // 重写Object中的toString方法
    public String toString() {
        return "昵称：" + this.getName() + "年龄: " + this.getMonth();
    }


    public Animal create(){
        return new Animal();
    }
}
