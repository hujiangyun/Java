package com.imooc.generic;

/**
 * @author hjy
 * @create 2020/11/9 4:00 下午
 */
public class TwoNumGeneric<T, X> {
    private T num1;
    private X num2;

    public void genNum(T num1, X num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public X getNum2() {
        return num2;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        TwoNumGeneric<Integer, Float> numObj = new TwoNumGeneric<>();
        numObj.genNum(25, 5.1f);
        System.out.println("num1 = " + numObj.getNum1() + " num2 = " + numObj.getNum2());
    }
}
