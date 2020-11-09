package com.imooc.generic;

import java.util.List;

/**
 * @author hjy
 * @create 2020/11/9 3:33 下午
 */
public class GoodsSeller {
    public void sellGoods(List<? extends Goods> goods) {
        // 调用集合中的sell方法
        for (Goods g : goods) {
            g.sell();
        }
    }
}
