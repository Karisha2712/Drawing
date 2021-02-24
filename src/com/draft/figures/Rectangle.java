package com.draft.figures;

import java.awt.Point;

public class Rectangle extends Figure {

    public Rectangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Rectangle(int x0, int y0, int x1, int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    public int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    public int getHeight() {
        return Math.abs(getStartPoint().y
                - getEndPoint().y);
    }

    @Override
    public void draw() {
    }
}
