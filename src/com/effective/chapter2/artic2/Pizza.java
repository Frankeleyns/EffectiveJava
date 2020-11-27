package com.effective.chapter2.artic2;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    //HAM:火腿，MUSHROOM: 蘑菇，ONION:洋葱，PEPPER:胡椒，SAUSAGE:香肠
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        /**
         * 创建一个枚举Set集合里面元素为Topping
         * EnumSet.noneOf(Topping.class)输出:[]
         * EnumSet.allOf(Topping.class)输出：[HAM, MUSHROOM, ONION, PEPPER, SAUSAGE]
         */
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();

    }

    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }
}
