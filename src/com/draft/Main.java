package com.draft;

import com.draft.form.DrawingForm;


public class Main {

    /**
     * Method for avoiding instantiation.
     */
    private Main() {
    }

    /**
     * For starting program.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        var frame = new DrawingForm();
    }
}
