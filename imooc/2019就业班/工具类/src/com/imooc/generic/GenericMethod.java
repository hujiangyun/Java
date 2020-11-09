package com.imooc.generic;

/**
 * @author hjy
 * @create 2020/11/9 4:06 下午
 */
public class GenericMethod {
    public <T> void printValue(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.printValue("110");
        method.printValue(10);
        method.printValue(5.123f);
        method.printValue(10.2);
        method.printValue('好');
    }
}
