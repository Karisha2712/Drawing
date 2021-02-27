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
        addButtonsListeners();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        add(artboard);
        setVisible(true);

    }

    /**
     * This set size to the frame.
     */
    private void setFormSize() {
        int windowWidth = getToolkit().getScreenSize().width;
        int windowHeight = getToolkit().getScreenSize().height;
        setSize(windowWidth, windowHeight);
    }

    /**
     * This adds listeners for buttons.
     */
    private void addButtonsListeners() {
        rectangleButton.addActionListener(
                setButtonListener(FigureType.RECTANGLE));
        ellipseButton.addActionListener(
                setButtonListener(FigureType.ELLIPSE));
        lineButton.addActionListener(
                setButtonListener(FigureType.LINE));
        triangleButton.addActionListener(
                setButtonListener(FigureType.TRIANGLE));
        rhombusButton.addActionListener(
                setButtonListener(FigureType.RHOMBUS));
    }

    /**
     * This sets listeners for buttons.
     *
     * @param type type of chosen figure
     * @return action
     */
    private ActionListener setButtonListener(final FigureType type) {
        return e -> artboard.setFigureType(type);
    }
}
