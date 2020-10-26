package com.imooc.tel;

/**
 * @author hjy
 * @create 2020/10/26 4:18 下午
 */
public class Telphone {
    private String brand;
    private int price;

    public Telphone() {
    }

    public void call() {
        System.out.println("手机可以打电话了");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
