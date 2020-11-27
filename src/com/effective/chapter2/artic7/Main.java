package com.effective.chapter2.artic7;


public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.toString());
        stack.push("a");
        System.out.println(stack.toString());
        stack.push("b");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
    }
}
