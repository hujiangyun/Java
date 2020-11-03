package com.imooc.wrapper;

/**
 * @author hjy
 * @create 2020/11/2 4:10 下午
 */
public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println("i1 == i2 的结果：" + (i1 == i2));

        /*
         * 自动装箱 等价于 Integer i3 = Integer.valueOf(100);
         * 1、缓存区（对象池），当 -128 > 参数 > 127时，会直接从缓存中获取，否则会直接实例化Integer(工具类)
         *
         * */
        Integer i3 = 100;
        System.out.println("i3 == 100 的结果：" + (i3 == 100)); // 先将i3进行拆箱操作，再和100进行比较，所以结果为true

//        Integer i4 = 100;
        Integer i4 = Integer.valueOf(100);
        System.out.println("i3 == i4 的结果：" + (i3 == i4));

        Integer i5 = 200;
        /*
         * i5 == 200 先将i5进行拆箱操作
         * 1、i5 = Integer.parseInt(i5) (200)
         * 2、200 == 200 => true
         * */
        System.out.println("i5 == 200 的结果：" + (i5 == 200));


        Integer i6 = 200;
        /*
         * i5 == i6
         * 将200装箱操作
         * 1、Integer.valueOf()从缓存区（对象池）中寻找（-128 至 127） 200不在该区间（如果都在该区间，都会指向缓存区间的同一地址）
         * 2、实例化对象 new Integer(200);
         * 3、new Integer(200) == new Integer(200) => false
         * */
        System.out.println("i5 == i6 的结果：" + (i5 == i6));


        Double d1 = Double.valueOf(100);
        System.out.println("d1 == 100 的结果：" + (d1 == 100));

        Double d2 = Double.valueOf(100);
        /*
        *
        * d1 == d2 => false
        * 虽然100在对象池 -128至127之间
        * 但是Double和Folat不存在对象池（缓存区）的概念
        * */
        System.out.println("d1 == d2 的结果：" + (d1 == d2));

    }
}
