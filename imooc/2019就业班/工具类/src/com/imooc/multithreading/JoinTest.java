package com.imooc.multithreading;

/**
 * @author hjy
 * @create 2020/11/10 2:24 下午
 */

class MyThreadJoin extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 200; i++)
            System.out.println(getName() + "正在执行" + i + "次");
    }
}

public class JoinTest {
    public static void main(String[] args) {
        MyThreadJoin mt = new MyThreadJoin();
        mt.start();
        try {
            mt.join(10); // 10 等待10秒之后会执行其他线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println("主线程运行第" + i + "次");
        }
        System.out.println("主线程执行完毕！");
    }
}
