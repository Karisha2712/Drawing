package com.draft.figures;

import java.awt.*;

public class Line extends Figure{

    public Line(){
        super();
    }

    public Line(Point startPoint, Point endPoint){
        super(startPoint, endPoint);
    }

    public Line(int x0, int y0, int x1, int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(getStartPoint().x, getStartPoint().y,
                          getEndPoint().x, getEndPoint().y);
    }
}
