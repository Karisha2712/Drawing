package com.draft.figures;

import java.awt.Graphics;
import java.awt.Point;

public class Triangle extends Figure {

    /**
     * This creates Triangle object.
     */
    public Triangle() {
        super();
    }

    /**
     * This creates Triangle object.
     *
     * @param startPoint left-top point of the triangle boundingbox
     * @param endPoint   right-bottom point of the triangle boundingbox
     */
    public Triangle(final Point startPoint,
                    final Point endPoint) {
        super(startPoint, endPoint);
    }

    /**
     * This creates Triangle object.
     *
     * @param x0 left-top point of the triangle boundingbox
     * @param y0 left-top point of the triangle boundingbox
     * @param x1 right-bottom point of the triangle boundingbox
     * @param y1 right-bottom point of the triangle boundingbox
     */
    public Triangle(final int x0, final int y0,
                    final int x1, final int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    /**
     * This returns triangle boundingbox width.
     *
     * @return triangle boundingbox width
     */
    public int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns triangle height.
     *
     * @return triangle height
     */
    public int getHeight() {
        return Math.abs(getStartPoint().y
                - getEndPoint().y);
    }

    /**
     * This draws a triangle on the <code>graphics</code> object.
     *
     * @param graphics field for drawing
     */
    @Override
    public void draw(final Graphics graphics) {

        Point point1 = new Point();      // left-bottom point
        Point point2 = new Point();      // center-top point
        Point point3 = new Point();      // right-bottom point

        point1.x = Math.min(getStartPoint().x,
                getEndPoint().x);
        point1.y = Math.max(getStartPoint().y,
                getEndPoint().y);

        point2.x = point1.x + this.getWidth() / 2;
        point2.y = point1.y - this.getHeight();

        point3.x = Math.max(getStartPoint().x,
                getEndPoint().x);
        point3.y = point1.y;

        graphics.drawLine(point1.x, point1.y,
                point2.x, point2.y);
        graphics.drawLine(point2.x, point2.y,
                point3.x, point3.y);
        graphics.drawLine(point3.x, point3.y,
                point1.x, point1.y);

    }
}
