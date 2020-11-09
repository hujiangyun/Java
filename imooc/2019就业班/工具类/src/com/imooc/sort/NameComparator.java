package com.imooc.sort;

import java.util.Comparator;

/**
 * @author hjy
 * @create 2020/11/9 10:36 上午
 */

public class NameComparator implements Comparator <Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        // 按名字升序排序
        String n1 = o1.getName();
        String n2 = o2.getName();
        // 如果o1<o2 返回负整数，如果相等返回0，如果o1大于o2返回正整数
        return n1.compareTo(n2);
    }
}
