package com.imooc.tel;

/**
 * @author hjy
 * @create 2020/10/26 5:22 下午
 */
// 接口访问修饰符：public 默认
public interface INet {
    //抽象方法： 抽象方法可以不写abstract关键字
    public void network();
    // 接口中可以定义常量，默认为public static final
    int TEMP = 20;

    // default：默认方法，可以带方法体。
    // 可以在实现类中重写，并通过接口的引用调用
    default public void connection(){
        System.out.println("我是接口中的默认链接-INet");
    }

    // static：静态方法，可以带方法体
    // 不可以在实现类中重写，可以通过接口名调用
    static void stop (){
        System.out.println("我是接口中的静态方法");
    }
}
