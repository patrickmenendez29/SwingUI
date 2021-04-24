package com.company.Components;

import javax.swing.*;
import java.awt.*;

public class HStack extends View {

    private JPanel frame = new JPanel();

    public HStack(View ... views){


        for(View view: views){
            frame.add(view.getComponent());
        }

        frame.setLayout(new BoxLayout(frame, BoxLayout.X_AXIS));


    }

    @Override
    public Component getComponent() {
        return this.frame;
    }
}
