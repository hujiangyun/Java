package com.imooc.test;
import com.imooc.tel.Camera;
import com.imooc.tel.FourthPhone;
import com.imooc.tel.IPhoto;

/**
 * @author hjy
 * @create 2020/10/26 4:28 下午
 */
public class PhoneTest {
    public static void main(String[] args) {
//        FourthPhone p1 = new FourthPhone();
//        p1.call();
//        p1.sendMessage();
//        p1.music();
//        p1.video();
//        p1.network();
//        p1.game();
//        p1.photo();

        IPhoto p2 = new FourthPhone();
        p2.photo();

        IPhoto c1 = new Camera();
        c1.photo();
    }
}

