package com.imooc.tel;

/**
 * @author hjy
 * @create 2020/10/26 4:26 下午
 */
public class FourthPhone extends ThirdPhone implements INet,IPhoto {
//    public void photo() {
//        System.out.println("手机可以自拍");
//    }

//    public void connection(){
//        System.out.println("四代手机connection");
//    }

    public void network() {
        System.out.println("手机可以上网");
    }

    public void game() {
        System.out.println("手机可以玩游戏");
    }

    @Override
    public void photo() {
        INet.super.connection();
        INet.stop();
        System.out.println("手机可以自拍");
    }
}
