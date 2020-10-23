package com.imooc.Singleton;

/**
 * @author hjy
 * @create 2020/10/20 3:41 下午
 */
//单例模式:懒汉式，在初始化类式不会创建实例对象，只有在调用get方法时才会创建实例对象  时间换空间
public class SingletonTwo {
//    1、创建私有构造
    private SingletonTwo(){

    }

//    2、创建静态的该类实例对象
    private static SingletonTwo instance = null;

//    3、创建开放静态方法提供实例对象
    public static SingletonTwo getInstance(){
        if(SingletonTwo.instance == null){
            instance = new SingletonTwo();
        }
        return instance;
    }
}
