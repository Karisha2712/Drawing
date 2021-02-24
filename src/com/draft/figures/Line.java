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
     * This creates Line object.
     */
    public Line(final Point startPoint,
                final Point endPoint) {
        super(startPoint, endPoint);
    }

    /**
     * This creates Line object.
     */
    public Line(final int x0, final int y0,
                final int x1, final int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
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
