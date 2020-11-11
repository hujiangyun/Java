package com.imooc.file;

import java.io.*;

public class BufferedFileDiff {
    public static void main(String[] args) {
        try {
            // 文件输入输出流操作文件
            // 创建文件输入流
//            FileInputStream fis = new FileInputStream("video.mp4");
//            // 创建文件输出流
//            FileOutputStream fos = new FileOutputStream("videoCopy.mp4");
//            int n = 0;
//            byte[] b = new byte[1024];
//            long startTime = System.currentTimeMillis();
//            while ((n = fis.read(b)) != -1) {
//                fos.write(b, 0, n);
//            }
//            long endTime = System.currentTimeMillis();
//            System.out.println(endTime - startTime);
//            fos.close();
//            fis.close();

            // 缓冲输入输出流操作文件

            // 创建文件输入流（读）
            FileInputStream fis = new FileInputStream("video.mp4");
            BufferedInputStream bis = new BufferedInputStream(fis);

            // 创建文件输出流（写）
            FileOutputStream fos = new FileOutputStream("videoCopy.mp4");
//            FileOutputStream fos1 = new FileOutputStream("videoCopy1.mp4");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // 普通流操作文件
//            int n = 0;
//            byte[] b = new byte[1024];
//            long startTime = System.currentTimeMillis();
//            while ((n = fis.read(b)) != -1) {
//                fos.write(b, 0, n);
//            }
//            long endTime = System.currentTimeMillis();
//            System.out.println("普通流操作文件时间：" +(endTime - startTime));

            // 缓冲流操作文件
            int bn = 0;
            byte[] byb = new byte[1024];
            long startTimeB = System.currentTimeMillis();
            while ((bn = bis.read(byb)) != -1) {
                bos.write(byb, 0, bn);
            }
            long endTimeB = System.currentTimeMillis();
            System.out.println("缓冲流操作文件时间：" + (endTimeB - startTimeB));
            fos.flush();
            bos.flush();
            fis.close();
            fos.close();
            bos.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
