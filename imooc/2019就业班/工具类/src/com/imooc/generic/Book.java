package com.imooc.generic;

/**
 * @author hjy
 * @create 2020/11/9 3:30 下午
 */
public class Book extends Goods {
    @Override
    public void sell() {
        System.out.println("sellBooks");
    }
}
