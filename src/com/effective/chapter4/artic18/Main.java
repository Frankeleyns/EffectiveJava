package com.effective.chapter4.artic18;

import org.omg.CORBA.INITIALIZE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //InstrumentedHashSet();
        InstrumentedSet();

    }

    public static void InstrumentedHashSet(){
        List<String> list = Arrays.asList("Snap", "Crackle", "Pop");
        InstrumentedHashSet<String> ihashSert = new InstrumentedHashSet<String>();
        ihashSert.addAll(list);
        System.out.println(ihashSert.getCount());

    }

    public static void InstrumentedSet(){
        List<String> list = Arrays.asList("Snap", "Crackle", "Pop");
        InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>());
        s.addAll(list);
        System.out.println(s.getAddCount());
    }


}
