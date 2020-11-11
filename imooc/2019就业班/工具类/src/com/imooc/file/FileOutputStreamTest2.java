package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hjy
 * @create 2020/11/11 4:34 下午
 */
public class FileOutputStreamTest2 {
    public static void main(String[] args) {
        // 文件拷贝
        try {
            FileInputStream fis = new FileInputStream("happy.jpg");
            FileOutputStream fos = new FileOutputStream("happyCopy.jpg");
            int n = 0;
            byte[] b = new byte[1024];
            while ((n = fis.read(b)) != -1) {
                fos.write(b, 0, n);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
