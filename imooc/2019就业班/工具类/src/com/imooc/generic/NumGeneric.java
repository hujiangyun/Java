package com.imooc.generic;

/**
 * @author hjy
 * @create 2020/11/9 3:51 下午
 */
// 自定义泛型
public class NumGeneric<T> {
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    // 测试代码
    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println("Integer：" + intNum.getNum());

        NumGeneric<Float> floatNum = new NumGeneric<>();
        floatNum.setNum(5.0f);
        System.out.println("Float：" + floatNum.getNum());

    }
}
