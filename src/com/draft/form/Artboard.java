package com.draft.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Artboard extends JPanel {

    private static com.draft.figures.Rectangle rect;

    public Artboard(){
        super();
        this.addMouseListener(new DrawingMouseAdapter());
        this.addMouseMotionListener(new DrawingMouseDrag());
    }

    protected void paintComponent(final Graphics g) {
        if (rect!= null)  {
            rect.draw(g);
        }
    }

    private class DrawingMouseAdapter extends MouseAdapter {

        @Override
        public void mousePressed(final MouseEvent e) {
            rect = new com.draft.figures.Rectangle(e.getPoint(), e.getPoint());
        }

        @Override
        public void mouseReleased(final MouseEvent e){
            rect.setEndPoint(e.getPoint());
            repaint();
        }

    }

    private class DrawingMouseDrag extends MouseMotionAdapter{

        @Override
        public void mouseDragged(final MouseEvent e){
            rect.setEndPoint(e.getPoint());
            repaint();
        }
    }
}
