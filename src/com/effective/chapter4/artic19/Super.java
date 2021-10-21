package com.effective.chapter4.artic19;

public class Super {

    public Super() {
        System.out.println("父类构造器");
        overrideMe();
    }

    public void overrideMe() {
        System.out.println("父类 overrideMe()");
    }

}
