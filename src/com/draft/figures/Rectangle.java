package com.draft.figures;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Figure {

    /**
     * This creates Rectangle object.
     */
    public Rectangle() {
        super();
    }

    /**
     * This creates Rectangle object.
     *
     * @param startPoint left-top point of the rectangle
     * @param endPoint   right-bottom point of the rectangle
     */
    public Rectangle(final Point startPoint,
                     final Point endPoint) {
        super(startPoint, endPoint);
    }

    /**
     * This creates Rectangle object.
     *
     * @param x0 left-top point of the rectangle
     * @param y0 left-top point of the rectangle
     * @param x1 right-bottom point of the rectangle
     * @param y1 right-bottom point of the rectangle
     */
    public Rectangle(final int x0, final int y0,
                     final int x1, final int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    /**
     * This returns rectangle width.
     *
     * @return rectangle width
     */
    public int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns rectangle height.
     *
     * @return rectangle height
     */
    public int getHeight() {
        return Math.abs(getStartPoint().y
                - getEndPoint().y);
    }

    /**
     * This draws a rectangle on the <code>graphics</code> object.
     *
     * @param graphics field for drawing
     */
    @Override
    public void draw(final Graphics graphics) {
        graphics.drawRect(Math.min(getStartPoint().x, getEndPoint().x),
                Math.min(getStartPoint().y, getEndPoint().y),
                getWidth(), getHeight());
    }
}
