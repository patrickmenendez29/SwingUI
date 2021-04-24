package com.company.Components;

import javax.swing.*;
import java.awt.*;

public class VStack extends View {

    private JPanel frame = new JPanel();

    public VStack(View ... views){


        for(View view: views){
            frame.add(view.getComponent());
        }

        frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));


    }

    @Override
    public Component getComponent() {
        return this.frame;
    }
}
