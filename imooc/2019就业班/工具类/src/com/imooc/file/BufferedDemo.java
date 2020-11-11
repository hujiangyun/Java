package com.imooc.file;

import java.io.*;

/**
 * @author hjy
 * @create 2020/11/11 5:27 下午
 */
public class BufferedDemo {
    public static void main(String[] args) {
        try {
            //输出流 （写）
            FileOutputStream fos = new FileOutputStream("imooc.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            // 输入流 (读)
            FileInputStream fis = new FileInputStream("imooc.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            bos.write(50);
            bos.write('a'); // 只写入了缓冲区中，并没有写入实际文件(缓冲区未满，没有自动触发write方法写入文件)
            bos.flush(); // 手动强制清空缓冲区，进行写操作


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
