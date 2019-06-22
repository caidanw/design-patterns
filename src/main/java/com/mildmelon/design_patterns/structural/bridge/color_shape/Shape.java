package com.mildmelon.design_patterns.structural.bridge.color_shape;

public abstract class Shape  {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String applyColor();

}
