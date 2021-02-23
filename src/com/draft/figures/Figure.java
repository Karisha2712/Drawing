package com.draft.figures;

import java.awt.Point;

public abstract class Figure {

    private Point startPoint;
    private Point endPoint;

    public Figure(){
        startPoint = new Point();
        endPoint = new Point();
    }

    public Figure(final Point startPoint, final Point endPoint){
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    public void setStartPoint(final Point startPoint){
        this.startPoint = startPoint;
    }

    public Point getStartPoint(){
        return startPoint;
    }

    public void setEndPoint(final Point endPoint){
        this.endPoint = endPoint;
    }

    public Point getEndPoint(){
        return endPoint;
    }

    public abstract void draw();

}
