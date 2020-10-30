package com.imooc.test;

/**
 * @author hjy
 * @create 2020/10/30 5:05 下午
 */
public class TryDemo05 {
    public static void main(String[] args) {
        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOne () throws HotelAgeException{
        throw new HotelAgeException();
    }

    public static void testTwo () throws Exception{
        try {
            testOne();
        } catch (Exception e) {
            throw new Exception("我是异常1", e);
        }
    }

    public static void testThree () throws Exception{
        try {
            testTwo();
        } catch (Exception e) {
            throw new Exception("我是异常2", e);
//            throw new HotelAgeException("我是异常二");
        }
    }

}
