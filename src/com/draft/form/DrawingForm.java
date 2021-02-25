package com.draft.form;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;


public class DrawingForm extends JFrame {

    /**
     * Panel for all components.
     */
    private JPanel mainPanel;

    /**
     * Button for drawing rectangle.
     */
    private JButton rectangleButton;

    /**
     * Button for drawing line.
     */
    private JButton lineButton;

    /**
     * Panel for buttons.
     */
    private JPanel buttonsPanel;

    /**
     * Button for drawing ellipse.
     */
    private JButton ellipseButton;

    /**
     * Button for drawing triangle.
     */
    private JButton triangleButton;

    /**
     * Button for drawing rhombus.
     */
    private JButton rhombusButton;

    /**
     * Panel for drawing.
     */
    private final Artboard artboard;

    /**
     * This creates frame.
     */
    public DrawingForm() {
        setFormSize();
        artboard = new Artboard();
        AddButtonsListeners();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.add(artboard);
        this.add(buttonsPanel);
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

    /**
     * This adds listeners for buttons.
     */
    private void AddButtonsListeners() {
        rectangleButton.addActionListener(
                this.setButtonListener(figureType.RECTANGLE));
        ellipseButton.addActionListener(
                this.setButtonListener(figureType.ELLIPSE));
        lineButton.addActionListener(
                this.setButtonListener(figureType.LINE));
        triangleButton.addActionListener(
                this.setButtonListener(figureType.TRIANGLE));
        rhombusButton.addActionListener(
                this.setButtonListener(figureType.RHOMBUS));
    }

    /**
     * This sets listeners for buttons.
     */
    private ActionListener setButtonListener(final figureType type) {
        return e -> artboard.setFigureType(type);
    }
}
