package com.imooc.sleep;

class MyThread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
//        Thread.currentThread().getName() 获取当前线程的线程名
            System.out.println(Thread.currentThread().getName() + "正在运行！" + (i++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        MyThread pr = new MyThread();
        Thread t1 = new Thread(pr);
        t1.start();
        Thread t2 = new Thread(pr);
        t2.start();
    }
}
