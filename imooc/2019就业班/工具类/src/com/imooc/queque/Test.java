package com.imooc.queque;

/**
 * @author hjy
 * @create 2020/11/10 4:23 下午
 */
public class Test {
    public static void main(String[] args) {
        Queque queque= new Queque();
        // 生产者
        Thread producer = new Thread(new Producer(queque));
        producer.start();

        // 消费者
        Thread consumer = new Thread(new Consumer(queque));
        consumer.start();
    }
}
