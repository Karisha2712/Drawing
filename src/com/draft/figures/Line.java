package com.draft.figures;

import java.awt.Graphics;
import java.awt.Point;


public class Line extends Figure {

    public Line() {
        super();
    }

    public Line(final Point startPoint,
                final Point endPoint) {
        super(startPoint, endPoint);
    }

    public Line(final int x0, final int y0,
                final int x1, final int y1) {
        super(new Point(x0, y0), new Point(x1, y1));
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(getStartPoint().x, getStartPoint().y,
                getEndPoint().x, getEndPoint().y);
    }
}
