package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author hjy
 * @create 2020/11/5 2:39 下午
 */
public class WordDemoHashSet {
    public static void main(String[] args) {
        // 将英文单词添加到HashSet中
        Set set = new HashSet();
        // 向集合中添加元素
        set.add("blue");
        set.add("black");
        set.add("red");
        set.add("yellow");
        set.add("white");
        //显示集合的内容
        System.out.println("集合中的元素为：");
        Iterator it = set.iterator(); // 迭代器

        // 遍历迭代器并输出元素
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        // 在集合中插入新的单词
//        set.add("green");
        set.add("red"); // 重复数据，插入失败，不会报错
        it = set.iterator(); // 重新赋值迭代器
        System.out.println();
        System.out.println("***********************");

        // 遍历新的迭代器并输出元素
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }


    }
}
