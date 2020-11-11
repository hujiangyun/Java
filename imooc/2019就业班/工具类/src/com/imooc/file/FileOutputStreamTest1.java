package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hjy
 * @create 2020/11/11 4:34 下午
 */
public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("imooc.txt",true);
            fis = new FileInputStream("imooc.txt");
            fos.write(50);
            fos.write(20);
            fos.write('a');
            int n = 0;
            while ((n = fis.read()) != -1) {
                System.out.println((char) n);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
