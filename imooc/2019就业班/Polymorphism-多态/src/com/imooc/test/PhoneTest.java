package com.imooc.test;
import com.imooc.tel.*;

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
        System.out.println("===========================");
        IPhoto c1 = new Camera();
        c1.photo();
        System.out.println("======================");
        System.out.println(INet.TEMP);

        System.out.println("=======================");

        INet net = new SmartWatches();
        System.out.println(net.TEMP);

        System.out.println("=======================");
        INet net2 = new SmartWatches();
        net2.connection();

        System.out.println("=======================");

        INet net3 = new FourthPhone();
        net3.connection();
        IPhoto ip1 = new FourthPhone();
        ip1.connection();
    }
}

