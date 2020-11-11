package com.imooc.file;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("imooc.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("imooc1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            BufferedInputStream isr = new BufferedInputStream(fis);
            int n = 0;
            char[] cbuf = new char[10];
//            while ((n = isr.read()) != -1) {
//                System.out.print((char) n);
//            }

//            while ((n = isr.read(cbuf)) != -1) {
//                String str = new String(cbuf, 0, n);
//                System.out.print(str);
//            }

            while ((n = isr.read(cbuf)) != -1) {
//                String str = new String(cbuf, 0, n);
                osw.write(cbuf, 0, n);
            }
            osw.flush();
            fis.close();
            fos.close();
            osw.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
