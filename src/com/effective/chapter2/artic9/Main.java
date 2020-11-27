package com.effective.chapter2.artic9;


public class Main {

    private static  final String TEST = "F:/test.txt";
    private static final String DST = "F:/copy.txt";

    public static void main(String[] args) throws Exception {
        String tf = TryFinally.firstLineOfFile(TEST);
        //System.out.println(tf);
        String tr = TryResources.firstLineOfFile(TEST);
        //System.out.println(tr);
        TestMyClose.myAutoClose();
    }
}
