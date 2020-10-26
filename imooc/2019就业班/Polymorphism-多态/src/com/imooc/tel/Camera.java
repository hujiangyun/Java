package com.imooc.tel;

/**
 * @author hjy
 * @create 2020/10/26 4:57 下午
 */
public class Camera implements IPhoto {
    @Override
    public void photo() {
        System.out.println("相机也可以拍照");
    }
//    public void photo(){
//        System.out.println("相机可以拍照");
//    }

}
