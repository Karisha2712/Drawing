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
     * This returns triangle boundingbox width.
     *
     * @return triangle boundingbox width
     */
    private int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns triangle height.
     *
     * @return triangle height
     */
    private int getHeight() {
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

        int leftXCoordinate = Math.min(getStartPoint().x,
                getEndPoint().x);
        int middleXCoordinate = leftXCoordinate
                + getWidth() / 2;
        int rightXCoordinate = Math.max(getStartPoint().x,
                getEndPoint().x);

        int bottomYCoordinate = Math.max(getStartPoint().y,
                getEndPoint().y);
        int topYCoordinate = bottomYCoordinate
                - getHeight();

        Point leftPoint = new Point(leftXCoordinate,
                bottomYCoordinate);
        Point topPoint = new Point(middleXCoordinate,
                topYCoordinate);
        Point rightPoint = new Point(rightXCoordinate,
                bottomYCoordinate);

        graphics.drawLine(leftPoint.x, leftPoint.y,
                topPoint.x, topPoint.y);
        graphics.drawLine(topPoint.x, topPoint.y,
                rightPoint.x, rightPoint.y);
        graphics.drawLine(rightPoint.x, rightPoint.y,
                leftPoint.x, leftPoint.y);

    }

}
