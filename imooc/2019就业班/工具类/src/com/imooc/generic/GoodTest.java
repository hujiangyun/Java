package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hjy
 * @create 2020/11/9 3:37 下午
 */
public class GoodTest {
    public static void main(String[] args) {
        // 定义book相关的LIst
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());

        // 定义clothes相关的list
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());

        // 定义shoes的list
        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller seller = new GoodsSeller();
        seller.sellGoods(books);
        seller.sellGoods(clothes);
        seller.sellGoods(shoes);
    }
}
