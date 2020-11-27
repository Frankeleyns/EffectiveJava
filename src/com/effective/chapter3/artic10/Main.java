package com.effective.chapter3.artic10;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
/*        //Broken - violates symmetry
        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp));   //输出结果： true
        System.out.println(cp.equals(p));   //输出结果： false*/

        //Broken - violates transitivity
        ColorsPoint p1 = new ColorsPoint(1,2,Color.RED);
        Point p2 = new Point(1, 2);
        ColorsPoint p3 = new ColorsPoint(1, 2, Color.BLUE);
        System.out.println(p1.equals(p2));  //输出结果： false
        System.out.println(p2.equals(p3));  //输出结果： false
        System.out.println(p1.equals(p3));  //输出结果： false


    }

}
