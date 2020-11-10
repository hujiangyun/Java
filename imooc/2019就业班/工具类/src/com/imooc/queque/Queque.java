package com.imooc.queque;

/**
 * @author hjy
 * @create 2020/11/10 4:15 下午
 */
public class Queque {
    private int n; // 记录存取产品的变量
    private boolean flag; // 控制有没有生产出产品

    public synchronized int getN() {
        System.out.println("消费：" + n);
        return n;
    }

    public synchronized void setN(int n) {
        System.out.println("生产：" + n);
        this.n = n;
    }
}
