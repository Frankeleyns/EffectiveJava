package com.effective.chapter3.artic10;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }


/*    //Broken - violates symmetry!
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof  ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }*/

    //Broken - violates transitivity!
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof  Point))
            return false;
        //if o is a normal Point,do a color-blind comparison
        if(!(o instanceof ColorPoint))
            return o.equals(this);
        return super.equals(o) && ((ColorPoint) o).color == color;
    }



}
