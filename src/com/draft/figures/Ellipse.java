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
     * This creates Ellipse object.
     *
     * @param startPoint left-top point of the ellipse bounding box
     * @param endPoint   right-bottom point of the ellipse bounding box
     */
    public Ellipse(final Point startPoint,
                   final Point endPoint) {
        super(startPoint, endPoint);
    }

    /**
     * This creates Ellipse object.
     *
     * @param x0 left-top point of the ellipse bounding box
     * @param y0 left-top point of the ellipse bounding box
     * @param x1 right-bottom point of the ellipse bounding box
     * @param y1 right-bottom point of the ellipse bounding box
     */
    public Ellipse(final int x0, final int y0,
                   final int x1, final int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    /**
     * This returns ellipse width.
     *
     * @return ellipse width
     */
    public int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns ellipse height.
     *
     * @return ellips height
     */
    public int getHeight() {
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
