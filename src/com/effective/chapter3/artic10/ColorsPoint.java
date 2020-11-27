package com.effective.chapter3.artic10;

import java.awt.*;
import java.util.Objects;

public class ColorsPoint {
    private final Point point;
    private final Color color;

    public ColorsPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * Returns the point-view of this color point.
     * @return
     */
    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ColorPoint))
            return false;
        ColorsPoint cp = (ColorsPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }


}
