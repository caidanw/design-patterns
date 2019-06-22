package com.mildmelon.design_patterns.structural.bridge.color_shape.colors;

import com.mildmelon.design_patterns.structural.bridge.color_shape.Color;

public class Red implements Color {

    @Override
    public String applyColor() {
        return "Applying red color";
    }

}
