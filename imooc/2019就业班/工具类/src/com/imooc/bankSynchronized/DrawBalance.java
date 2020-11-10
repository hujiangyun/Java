package com.imooc.bankSynchronized;

/**
 * @author hjy
 * @create 2020/11/10 3:28 下午
 */
// 取款线程
public class DrawBalance extends Thread {
    Bank bank;

    public DrawBalance(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.drawBalance();
    }
}
