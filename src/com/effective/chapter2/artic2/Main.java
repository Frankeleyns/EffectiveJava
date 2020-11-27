package com.effective.chapter2.artic2;

import static com.effective.chapter2.artic2.NyPizza.Size.LARGE;
import static com.effective.chapter2.artic2.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
        //userBuild();
        nyPizzaBuild();
        calzoneBuild();
    }

    public static void userBuild(){
        User user = new User.Builder().id("a1ds1a5dxxx").account("123456").password("123456")
                .sex("不男不女").name("轩辕狂傲").phone("111111").build();
        System.out.println(user.toString());
    }

    public static void nyPizzaBuild(){
        NyPizza nyPizza = new NyPizza.Builder(LARGE).addTopping(SAUSAGE).addTopping(HAM).build();
        System.out.println(nyPizza.toString());
    }

    public static void calzoneBuild(){
        Calzone calzone = new Calzone.Builder().addTopping(MUSHROOM).addTopping(ONION)
                .addTopping(PEPPER).sauceInside().build();
        System.out.println(calzone.toString());
    }
}
