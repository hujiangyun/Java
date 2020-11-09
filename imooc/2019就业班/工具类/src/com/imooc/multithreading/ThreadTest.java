package com.imooc.multithreading;

/**
 * @author hjy
 * @create 2020/11/9 4:55 下午
 */

// Thread子类创建线程
class MyThread extends Thread{
    public void run(){
        System.out.println(getName() + "该线程正在进行！");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1：");
        MyThread mt = new MyThread();
        mt.start(); // 启动线程
        mt.start(); // 启动线程
        System.out.println("主线程2：");
    }
}
