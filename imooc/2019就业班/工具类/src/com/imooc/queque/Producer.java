package com.imooc.queque;

/**
 * @author hjy
 * @create 2020/11/10 4:16 下午
 */
// 生产者
public class Producer implements Runnable {
    Queque queque;

    public Producer(Queque queque) {
        this.queque = queque;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queque.setN(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
