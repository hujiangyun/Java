package com.imooc.bankSynchronized;

/**
 * @author hjy
 * @create 2020/11/10 3:31 下午
 */
public class BankTest {
    public static void main(String[] args) {
        // 创建账户
        Bank bank = new Bank("10001", 1000);
        // 床架线程对象
        SaveBalance sa = new SaveBalance(bank);
        DrawBalance draw = new DrawBalance(bank);
        Thread save = new Thread(sa);
        save.start();
        draw.start();

        try {
            draw.join();
            save.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bank);
    }
}
