package com.effective.chapter2.artic3;

import java.lang.reflect.Constructor;


public class Main {

    public static void main(String[] args) throws Exception {
        realInstance();
        fakeInstance();
    }

    public static void fakeInstance() throws Exception {
        Class<FakeInstance> clazz = FakeInstance.class;
        Constructor<FakeInstance> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        FakeInstance fakeInstance = constructor.newInstance();
        FakeInstance instance = FakeInstance.INSTANCE;
        System.out.println(fakeInstance.equals(instance) && fakeInstance == instance);  //输出：false
    }

    /**
     * 枚举类没法反射，线程安全，防止序列化生成新的类
     * @throws Exception
     */
    public static void realInstance(){
        RealInstance instance = RealInstance.INSTANCE;
        RealInstance instance1 = RealInstance.INSTANCE;
        System.out.println(instance.equals(instance1) && instance == instance1);    //输出：true
        RealInstance.INSTANCE.become();  //输出：成为单例


    }

}
