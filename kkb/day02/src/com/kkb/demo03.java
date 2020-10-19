package com.kkb;

/**
 * @author hjy
 * @date 2020/9/30 4:54 下午
 */
// 逻辑运算符
public class demo03 {
    public static void main(String[] args) {
        // & 与, |或,  ! 非（相反）, ^ 异或 a^b  a和b结果相同为true, 否则为false

        // 逻辑与 &
        boolean a = true;
        boolean b = false;
        System.out.println(a ^ b);

        // 逻辑或 |
        boolean a1 = true;
        boolean b1 = false;
        System.out.println(a1 ^ b1);

        // 逻辑异或 ^
        System.out.println("异或值不相同");
        System.out.println(true ^ true);
        System.out.println(true ^ false);

        // 逻辑非 !
        boolean a2 = false;
        System.out.println("非取反");
        System.out.println(!a2);

        // && 短路与 和 &(会把&左右两边的表达式执行完) 执行结果一样

        // || 短路或 和 | 执行结果一样

        System.out.println("逻辑与");
        int i = 1;
        System.out.println(i+1 > 2 & i++ > 4);
        System.out.println("i=" + i);
        System.out.println("短路与");
        System.out.println(i+1 > 3 && i++ > 4);
        System.out.println("i=" + i);
    }
}
