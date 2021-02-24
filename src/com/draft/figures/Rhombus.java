package com.draft.figures;

import java.awt.*;

public class Rhombus extends Figure {

    /**
     * This creates Rhombus object.
     */
    public Rhombus() {
        super();
    }

    /**
     * This creates Rhombus object.
     *
     * @param startPoint left-top point of the rhombus boundingbox
     * @param endPoint   right-bottom point of the rhombus boundingbox
     */
    public Rhombus(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    /**
     * This creates Rhombus object.
     *
     * @param x0 coordinate of the left-top point of the rhombus boundingbox
     * @param y0 coordinate of the left-top point of the rhombus boundingbox
     * @param x1 coordinate of the right-bottom point of the rhombus boundingbox
     * @param y1 coordinate of the right-bottom point of the rhombus boundingbox
     */
    public Rhombus(int x0, int y0, int x1, int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    /**
     * This returns rhombus boundingbox width.
     *
     * @return rhombus boundingbox width
     */
    public int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns rhombus height.
     *
     * @return rhombus height
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

        Point point1 = new Point();                                 // bottom point
        Point point2 = new Point();                                 // left point
        Point point3 = new Point();                                 // top point
        Point point4 = new Point();                                 // right point

        point1.x = Math.min(getStartPoint().x, getEndPoint().x)
                + this.getWidth() / 2;
        point1.y = Math.max(getStartPoint().y, getEndPoint().y);

        point2.x = Math.min(getStartPoint().x, getEndPoint().x);
        point2.y = Math.max(getStartPoint().y, getEndPoint().y)
                - this.getHeight() / 2;

        point3.x = point1.x;
        point3.y = Math.min(getStartPoint().y, getEndPoint().y);

        point4.x = Math.max(getStartPoint().x, getEndPoint().x);
        point4.y = point2.y;

        graphics.drawLine(point1.x, point1.y, point2.x, point2.y);
        graphics.drawLine(point2.x, point2.y, point3.x, point3.y);
        graphics.drawLine(point3.x, point3.y, point4.x, point4.y);
        graphics.drawLine(point4.x, point4.y, point1.x, point1.y);

    }
}