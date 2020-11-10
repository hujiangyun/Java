package com.imooc.bankSynchronized;

/**
 * @author hjy
 * @create 2020/11/10 3:28 下午
 */
// 存款线程
public class SaveBalance implements Runnable {
    Bank bank;

    public SaveBalance(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.saveBalance();
    }
}
