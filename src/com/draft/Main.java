package com.draft;

import com.draft.form.DrawingForm;


public final class Main {

    /**
     * Method for avoiding creation objects.
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
