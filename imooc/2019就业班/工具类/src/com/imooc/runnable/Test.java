package com.imooc.runnable;

class PrintRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
//        Thread.currentThread().getName() 获取当前线程的线程名
            System.out.println(Thread.currentThread().getName() + "正在运行！" + (i++));
        }
    }
}

public class Test {
    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread t1 = new Thread(pr);
        t1.start();
        Thread t2 = new Thread(pr);
        t2.start();
    }
}
