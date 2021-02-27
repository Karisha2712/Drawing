package com.draft.figures;

import java.awt.Graphics;
import java.awt.Point;

public class Line extends Figure {

    /**
     * This creates Line object.
     */
    public Line() {
        super();
    }

    /**
     * This draws a line on the <code>graphics</code> object.
     *
     * @param graphics field for drawing
     */
    @Override
    public void draw(final Graphics graphics) {
        graphics.drawLine(getStartPoint().x, getStartPoint().y,
                getEndPoint().x, getEndPoint().y);
    }
}
