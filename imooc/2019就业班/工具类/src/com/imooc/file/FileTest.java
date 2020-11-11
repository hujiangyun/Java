package com.imooc.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author hjy
 * @create 2020/11/11 11:20 上午
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        // 创建File对象
//        File file = new File("/Users/hjy/Desktop/workspace/myself/java-video/OS/imooc/io/score.txt");
//        File file = new File("/Users/hjy/Desktop/workspace/myself/java-video/OS/imooc", "/io/score.txt");
        File file1 = new File("/Users/hjy/Desktop/workspace/myself/java-video/OS/imooc");
        File file = new File(file1, "/io/score.txt");

        // 判断是文件还是文件夹
        boolean flag = file.isFile();
        System.out.println(flag);

        // 创建文件
        File fileSet = new File("/Users/hjy/Desktop/workspace/myself/java-video/OS/imooc/set/HashSet");
        if(!fileSet.exists()){
            System.out.println("不存在");
            boolean success = fileSet.mkdirs();
        }



        // 创建文件
        if(!file.exists()){
            try {
                boolean success = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }
}
