package com.effective.chapter2.artic7;


import java.util.Arrays;
import java.util.EmptyStackException;


public class Stack {
    private Object[] elements;
    private int top = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 3;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[top++] = e;
    }

    public Object pop(){
        if(top == 0)
            throw new EmptyStackException();
        Object result = elements[--top];
        elements[top] = null; /* to let gc do its work */
        return result;
    }

    /**
     *  保证每次新增元素都有足够空间
     */
    private void ensureCapacity(){
        if(elements.length == top)
            elements = Arrays.copyOf(elements,2 * top + 1);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", top=" + top +
                '}';
    }
}
