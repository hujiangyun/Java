package com.imooc.bankSynchronized;

/**
 * @author hjy
 * @create 2020/11/10 3:17 下午
 */
// 同步、死锁
public class Bank {
    private String account; // 账号
    private int balance; // 账户余额

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" + "账号：'" + account + '\'' + ", 余额：" + balance + '}';
    }

    // 存款
    public synchronized void saveBalance() {
        // 获取当前账户余额
        int balance = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 修改余额
        balance += 100;
        //修改账户余额
        setBalance(balance);
        //输出存款后的余额
        System.out.println("存款后的账户余额为：" + getBalance());
    }

    // 取款
    public void drawBalance() {
        synchronized(this){
            // 在不同的位置添加sleep线程休眠方法
            // 获取当前的账户余额
            int balance = getBalance();
            // 修改余额
            balance -= 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 修改账户余额
            setBalance(balance);
            System.out.println("取款后的账户余额为：" + getBalance());
        }
    }
}
