package com.company.Components;

import javax.swing.*;
import java.awt.*;

public class TextField extends View {

    private final JTextField textField;

    public TextField(){
        textField = new JTextField(16);
        textField.setBounds(0,0,this.getWidth(),this.getHeight());

    }

    @Override
    public Component getComponent() {
        return textField;
    }
}
