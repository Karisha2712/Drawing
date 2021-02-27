package com.draft.figures;

import java.awt.Graphics;
import java.awt.Point;

public class Ellipse extends Figure {

    /**
     * This creates Ellipse object.
     */
    public Ellipse() {
        super();
    }

    /**
     * This returns ellipse width.
     *
     * @return ellipse width
     */
    private int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns ellipse height.
     *
     * @return ellips height
     */
    private int getHeight() {
        return Math.abs(getStartPoint().y
                - getEndPoint().y);
    }

    /**
     * This draws an ellipse on the <code>graphics</code> object.
     *
     * @param graphics field for drawing
     */
    @Override
    public void draw(final Graphics graphics) {
        graphics.drawOval(Math.min(getStartPoint().x, getEndPoint().x),
                Math.min(getStartPoint().y, getEndPoint().y),
                getWidth(), getHeight());
    }
}
