package com.imooc.set;

import java.util.Objects;

/**
 * @author hjy
 * @create 2020/11/5 3:37 下午
 */
public class Cat {
    private String name; // 名字
    private int month; // 月份
    private String species; // 品种

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "姓名：\"" + name + "\", 月份：" + month +", 品种：\"" + species + "\"";
    }

    @Override
    public boolean equals(Object o) { // 重写equals方法，判断两个cat是否相等（引用地址、成员是否相等）
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return month == cat.month &&
                Objects.equals(name, cat.name) &&
                Objects.equals(species, cat.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, month, species);
    }
}
