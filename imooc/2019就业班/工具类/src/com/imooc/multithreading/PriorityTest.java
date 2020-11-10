package com.imooc.multithreading;

/**
 * @author hjy
 * @create 2020/11/10 2:49 下午
 */

class MyThreadPriority extends Thread {
    private String name;

    public MyThreadPriority(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(name + "正在运行" + i);
        }
    }
}

public class PriorityTest {
    public static void main(String[] args) {
        // 获取主线程优先级
//        int mainPriority = Thread.currentThread().getPriority();
//        System.out.println("主线程的优先级为：" + mainPriority);

        MyThreadPriority mt1 = new MyThreadPriority("线程1");
        MyThreadPriority mt2 = new MyThreadPriority("线程2");
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt2.start();
//        System.out.println("线程1的优先级为：" + mt.getPriority());
    }
}
