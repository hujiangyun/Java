package com.imooc.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;

/**
 * @author hjy
 * @create 2020/11/11 4:02 下午
 */
public class FileInputStreamTest2 {

    public static void main(String[] args) {
        // 创建FileInputStream对象
        try {
            FileInputStream inputStream = new FileInputStream("imooc.txt");
            byte[] b = new byte[100];
            int success = inputStream.read(b,0,5);
            System.out.println(new String(b));
            inputStream.close(); // 关闭资源
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
