package com.mildmelon.design_patterns.structural.bridge.color_shape.shapes;

import com.mildmelon.design_patterns.structural.bridge.color_shape.Color;
import com.mildmelon.design_patterns.structural.bridge.color_shape.Shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String applyColor() {
        return this.color.applyColor();
    }

}
