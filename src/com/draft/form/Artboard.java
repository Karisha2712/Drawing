package com.draft.form;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class Artboard extends JPanel {


    private static com.draft.figures.Rhombus line = null;

    /**
     * This creates Artboard object.
     */
    public Artboard() {
        this.addMouseListener(new DrawingMouseAdapter());
        this.addMouseMotionListener(new DrawingMouseDrag());
    }

    /**
     * This repaint drawing field.
     *
     * @param g field for drawing
     */
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        if (line != null) {
            line.draw(g);
        }
    }

    /**
     *
     */
    private class DrawingMouseAdapter extends MouseAdapter {

        /**
         * This what happens when the mouse is pressed.
         *
         * @param e mouse event object
         */
        @Override
        public void mousePressed(final MouseEvent e) {
            line = new com.draft.figures.Rhombus();
            line.setStartPoint(e.getPoint());
            line.setEndPoint(e.getPoint());
        }

        /**
         * This what happens when the mouse is released.
         *
         * @param e mouse event object
         */
        @Override
        public void mouseReleased(final MouseEvent e) {
            line.setEndPoint(e.getPoint());
            repaint();
        }

    }

    private class DrawingMouseDrag extends MouseMotionAdapter {

        /**
         * This what happens when the mouse is dragged.
         *
         * @param e mouse event object
         */
        @Override
        public void mouseDragged(final MouseEvent e) {
            line.setEndPoint(e.getPoint());
            repaint();
        }
    }
}
