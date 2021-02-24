package com.draft.form;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;


public class DrawingForm extends JFrame {
    private JPanel mainPanel;
    private JButton btnRect;
    private JButton button2;
    private JButton button3;
    private JPanel bPanel;

    /**
     * This creates frame.
     */
    public DrawingForm() {
        Artboard artboard;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        setFormSize();
        artboard = new Artboard();
        this.add(artboard);
        this.setVisible(true);
    }

    /**
     * This set size to the frame.
     */
    private void setFormSize() {
        int windowWidth = this.getToolkit().getScreenSize().width;
        int windowHeight = this.getToolkit().getScreenSize().height;
        this.setSize(windowWidth, windowHeight);
    }

}
