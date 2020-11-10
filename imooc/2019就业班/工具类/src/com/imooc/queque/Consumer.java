package com.imooc.queque;

/**
 * @author hjy
 * @create 2020/11/10 4:20 下午
 */
// 消费者
public class Consumer implements Runnable {
    Queque queque;

    public Consumer(Queque queque) {
        this.queque = queque;
    }

    @Override
    public void run() {
        while (true) {
            int n = queque.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
