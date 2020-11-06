package com.imooc.set;

import java.util.*;

/**
 * @author hjy
 * @create 2020/11/6 3:39 下午
 */
public class GoodsTest {
    public static void main(String[] args) {
        // 定义商品类
        Goods apple = new Goods("1", "苹果", 4.5);
        Goods banana = new Goods("2", "香蕉", 2.8);
        Goods orange = new Goods("3", "橘子", 5.2);
        Goods papaya = new Goods("4", "木瓜", 14.8);
        Goods tomatoes = new Goods("5", "西红柿", 3.3);

        // 定义HashMap
        Map<String, Goods> goodsMap = new HashMap<String, Goods>();
        // 通过containsKey方法判断商品列表中是否存在该编号，防止商品编号重复
        goodsMap.put(apple.getId(), apple);
        goodsMap.put(banana.getId(), banana);
        goodsMap.put(orange.getId(), orange);
        goodsMap.put(papaya.getId(), papaya);
        goodsMap.put(tomatoes.getId(), tomatoes);

        Set<Map.Entry<String, Goods>> goodsSet = goodsMap.entrySet();
        System.out.println("所有的商品信息为：");
        // 遍历所有与商品集合
        for (Map.Entry<String, Goods> good : goodsSet) {
            Goods _good = good.getValue();
            System.out.println(_good);
//            System.out.println("商品名称：" + _good.getName() + " " + "商品的价格：" + _good.getPrice());
        }


    }
}
