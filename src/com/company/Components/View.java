package com.company.Components;

import java.awt.*;

public class View {
    private Component component;
    private int width = 0, height = 0;

    public Component getComponent(){
        return component;
    }

    public void setDimensions(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
