package com.company.Components;

import javax.swing.*;
import java.awt.*;

public class Button extends View {

    private final JButton button;

    public Button(String text){
        button = new JButton(text);
        button.setBounds(0,0,this.getWidth(),this.getHeight());

    }

    @Override
    public Component getComponent() {
        return button;
    }
}
