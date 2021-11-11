package com.effective.chapter4.artic22;

/**
 * @packge: com.effective.chapter4.artic22
 * @author: Frankeleyn
 * @date: 2021/11/11 15:43
 *
 *
 * 使用用下划线(_)加强数值的可读性
 */
public class SomeContants {
    public static void main(String[] args) {
        System.out.println(Contant.LONG_VALUE);     // 输出：12395971290
        System.out.println(Contant.PI);     // 输出：3.14159262571823719
    }
}


class Contant{
    private Contant(){}

    public static final long LONG_VALUE = 123_9597_1290L;

    public static final double PI = 3.1415_9262_5718_23719;
}