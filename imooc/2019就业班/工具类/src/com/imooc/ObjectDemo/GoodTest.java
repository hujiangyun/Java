package com.imooc.ObjectDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author ：hjy
 * @description  goods测试类
 * @date ：Created in 2020-12-11
 */
public class GoodTest {
    public static void main(String[] args) {
        // 实例goods对象
        Goods goods01 = new Goods("jd001", "电脑", 3555);
        try {
            FileOutputStream fos = new FileOutputStream("imooc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
