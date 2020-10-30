package com.imooc.test;

import java.util.Scanner;

/**
 * @author hjy
 * @create 2020/10/30 4:37 下午
 */

/*
 * 自定义异常
 *
 */
public class HotelAgeException extends Exception {
    public HotelAgeException(){
        super("18岁以下，80岁以上，必须由亲友陪同才能办理入住登记");
    }
    public HotelAgeException(String s){
        super(s);
    }
}
