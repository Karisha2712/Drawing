package com.draft.figures;

import java.awt.*;

public class Ellipse extends Figure{

    public Ellipse(){
        super();
    }

    /**
     * This creates Ellipse object.
     *
     * @param startPoint left-top point of the ellipse bounding box
     * @param endPoint right-bottom point of the ellipse bounding box
     */
    public Ellipse(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    /**
     * This creates Ellipse object.
     *
     * @param x0 coordinate of the left-top point of the ellipse bounding box
     * @param y0 coordinate of the left-top point of the ellipse bounding box
     * @param x1 coordinate of the right-bottom point of the ellipse bounding box
     * @param y1 coordinate of the right-bottom point of the ellipse bounding box
     */
    public Ellipse(int x0, int y0, int x1, int y1) {
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
     * This draws an ellipse on the <code>graphics</code> object
     *
     * @param graphics field for drawing
     */
    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(Math.min(getStartPoint().x, getEndPoint().x),
                Math.min(getStartPoint().y, getEndPoint().y),
                getWidth(), getHeight());
    }
}
