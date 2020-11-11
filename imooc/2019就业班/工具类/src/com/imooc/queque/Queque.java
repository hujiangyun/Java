package com.imooc.queque;

/**
 * @author hjy
 * @create 2020/11/10 4:15 下午
 */
public class Queque {
    private int n; // 记录存取产品的变量
    private boolean flag = false; // 控制有没有生产出产品(如果flag==false消费者不能消费，flag=true 生产者不能生产)

    public synchronized int getN() {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费：" + n);
        flag = false; // 生产完毕，容器中没有数据
        return n;
    }

    public synchronized void setN(int n) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产：" + n);
        this.n = n;
        flag = true; // 生产完毕，容器中有数据
        notifyAll(); // 唤醒所有线程
    }
}
