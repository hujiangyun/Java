package com.imooc.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author hjy
 * @create 2020/11/11 4:02 下午
 */
public class FileInputStreamTest1 {

    public static void main(String[] args) {
        File file = new File("imooc.txt");
        if (!file.exists()) {
            System.out.println("开始创建imooc.txt");
            try {
                boolean success = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 创建FileInputStream对象
        try {
            FileInputStream inputStream = new FileInputStream("imooc.txt");
            int n = 0;
            // 赋值n并判断n的值
            while ((n = inputStream.read()) != -1) {
                System.out.print((char) n);
            }
            inputStream.close(); // 关闭资源
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
