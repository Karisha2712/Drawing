package com.draft.form;

import javax.swing.*;

public class Form extends JFrame{
    private JPanel mainPanel;
    private JButton btnRect;
    private JButton button2;
    private JButton button3;
    private JPanel bPanel;
    public Form(){
        this.setTitle("Artboard");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 500);
        this.setVisible(true);
    }
}
