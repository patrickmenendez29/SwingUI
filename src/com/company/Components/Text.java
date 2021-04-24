package com.company.Components;

import javax.swing.*;
import java.awt.*;

public class Text extends View {

    private final JLabel text;

    public Text(String text){
        this.text = new JLabel(text);

    }

    @Override
    public Component getComponent() {
        return text;
    }
}
