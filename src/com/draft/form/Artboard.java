package com.draft.form;

import com.draft.figures.Figure;
import com.draft.figures.Rectangle;
import com.draft.figures.Line;
import com.draft.figures.Ellipse;
import com.draft.figures.Rhombus;
import com.draft.figures.Triangle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.List;
import java.util.LinkedList;

public class Artboard extends JPanel {

    /**
     * Value of current figure type.
     */
    private FigureType currentFigureType = FigureType.DEFAULT;

    /**
     * Value fot current figure.
     */
    private Figure figure = null;

    /**
     * List for storing figures.
     */
    private final List<Figure> figures;

    /**
     * This creates Artboard object.
     */
    public Artboard() {
        this.figures = new LinkedList<>();
        this.addMouseListener(new DrawingMouseAdapter());
        this.addMouseMotionListener(new DrawingMouseDrag());
    }

    /**
     * This sets current type of figure.
     *
     * @param type type of figure
     */
    public void setFigureType(final FigureType type) {
        this.currentFigureType = type;
    }

    /**
     * This creates figure object.
     *
     * @param type type of figure
     * @return figure object
     */
    private Figure setFigure(final FigureType type) {
        switch (type) {
            case RECTANGLE -> {
                return new Rectangle();
            }
            case ELLIPSE -> {
                return new Ellipse();
            }
            case LINE -> {
                return new Line();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
            case RHOMBUS -> {
                return new Rhombus();
            }
            default -> {
                return null;
            }
        }
    }

    /**
     * This repaint drawing field.
     *
     * @param g field for drawing
     */
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        if (figure != null) {
            figure.draw(g);
        }
        for (Figure f : figures) {
            f.draw(g);
        }

    }

    /**
     * Class for tracking mouse clicks.
     */
    private class DrawingMouseAdapter extends MouseAdapter {

        /**
         * This what happens when the mouse is pressed.
         *
         * @param e mouse event object
         */
        @Override
        public void mousePressed(final MouseEvent e) {
            figure = setFigure(currentFigureType);
            if (figure != null) {
                figure.setStartPoint(e.getPoint());
                figure.setEndPoint(e.getPoint());
            }
        }

        /**
         * This what happens when the mouse is released.
         *
         * @param e mouse event object
         */
        @Override
        public void mouseReleased(final MouseEvent e) {
            super.mouseReleased(e);
            if ((figure != null)
                    && (!figure.getStartPoint().equals(figure.getEndPoint()))) {
                figure.setEndPoint(e.getPoint());
                figures.add(figure);
                repaint();
            }
        }

    }

    /**
     * Class for tracking mouse movements.
     */
    private class DrawingMouseDrag extends MouseMotionAdapter {

        /**
         * This what happens when the mouse is dragged.
         *
         * @param e mouse event object
         */
        @Override
        public void mouseDragged(final MouseEvent e) {
            super.mouseDragged(e);
            if (figure != null) {
                figure.setEndPoint(e.getPoint());
                repaint();
            }
        }
    }
}
