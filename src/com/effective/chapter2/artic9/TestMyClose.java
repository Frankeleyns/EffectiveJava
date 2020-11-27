package com.effective.chapter2.artic9;

public class TestMyClose {

    public static void myAutoClose() throws Exception {
        try(MyClose myClose = new MyClose()){
            myClose.doSomething();
        }
    }
}
