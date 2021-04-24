package com.company.Components;

import javax.swing.*;

public class Body {
    private JFrame frame = new JFrame();
    int width = 400, height = 500;

    public Body(View view){

        view.setDimensions(width, height);
        frame.add(view.getComponent());
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
