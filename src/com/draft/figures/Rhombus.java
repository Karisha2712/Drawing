package com.draft.figures;

import java.awt.Graphics;
import java.awt.Point;

public class Rhombus extends Figure {

    /**
     * This creates Rhombus object.
     */
    public Rhombus() {
        super();
    }

    /**
     * This returns rhombus boundingbox width.
     *
     * @return rhombus boundingbox width
     */
    private int getWidth() {
        return Math.abs(getStartPoint().x
                - getEndPoint().x);
    }

    /**
     * This returns rhombus height.
     *
     * @return rhombus height
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
        int middleYCoordinate = bottomYCoordinate
                - getHeight() / 2;

        Point leftPoint = new Point(leftXCoordinate,
                middleYCoordinate);
        Point topPoint = new Point(middleXCoordinate,
                topYCoordinate);
        Point rightPoint = new Point(rightXCoordinate,
                middleYCoordinate);
        Point bottomPoint = new Point(middleXCoordinate,
                bottomYCoordinate);

        graphics.drawLine(leftPoint.x, leftPoint.y,
                topPoint.x, topPoint.y);
        graphics.drawLine(topPoint.x, topPoint.y,
                rightPoint.x, rightPoint.y);
        graphics.drawLine(rightPoint.x, rightPoint.y,
                bottomPoint.x, bottomPoint.y);
        graphics.drawLine(bottomPoint.x, bottomPoint.y,
                leftPoint.x, leftPoint.y);

    }
}
