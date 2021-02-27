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
     * This returns rectangle width.
     *
     * @return rectangle width
     */
    private int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns rectangle height.
     *
     * @return rectangle height
     */
    private int getHeight() {
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
