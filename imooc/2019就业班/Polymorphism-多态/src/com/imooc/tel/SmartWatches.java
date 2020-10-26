package com.imooc.tel;

/**
 * @author hjy
 * @create 2020/10/26 4:50 下午
 */
public class SmartWatches implements INet,IPhoto {
    public static final int TEMP = 30;
    public void call() {
        System.out.println("智能手表可以打电话");
    }

    public void sendMessage() {
        System.out.println("智能手表可以发短信");
    }

    public void network() {
        System.out.println("智能手表可以上网");
    }

    @Override
    public void connection() {
        INet.super.connection(); // 调用接口中默认方法
//        INet.stop(); // 调用接口中的静态方法
    }

    @Override
    public void photo() {

    }
}
