package com.draft.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DrawingForm extends JFrame{
    private JPanel mainPanel;
    private JButton btnRect;
    private JButton button2;
    private JButton button3;
    private JPanel bPanel;
    private Artboard artboard;

    public DrawingForm() {
        this.setTitle("Artboard");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 500);
        artboard = new Artboard();
        this.add(artboard);
        this.setVisible(true);
    }

}
