package com.draft.figures;

import java.awt.Point;
import java.awt.Graphics;

public abstract class Figure {

    /**
     * Top-left point of the figure.
     */
    private Point startPoint;

    /**
     * Bottom-right point of the figure.
     */
    private Point endPoint;

    /**
     * This creates Figure object.
     */
    public Figure() {
        startPoint = new Point();
        endPoint = new Point();
    }

    /**
     * This creates Figure object.
     *
     * @param sPoint start point value
     * @param ePoint end point value
     */
    public Figure(final Point sPoint,
                  final Point ePoint) {
        this.startPoint = new Point(sPoint);
        this.endPoint = new Point(ePoint);
    }

    /**
     * This sets start point value.
     *
     * @param point start point value
     */
    public void setStartPoint(final Point point) {
        this.startPoint = point;
    }

    /**
     * This returns start point value.
     *
     * @return start point value
     */
    public Point getStartPoint() {
        return startPoint;
    }

    /**
     * This sets end point value.
     *
     * @param point end point value
     */
    public void setEndPoint(final Point point) {
        this.endPoint = point;
    }

    /**
     * This returns end point value.
     *
     * @return end point value
     */
    public Point getEndPoint() {
        return endPoint;
    }

    /**
     * Abstract method for drawing figures.
     *
     * @param graphics field for drawing
     */
    public abstract void draw(Graphics graphics);

}
