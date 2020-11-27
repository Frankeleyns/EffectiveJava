package com.effective.chapter2.artic9;

public class MyClose implements AutoCloseable {

    public void doSomething(){
        System.out.println("MyClose Do Something！");
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyClose Closed!");
    }
}
