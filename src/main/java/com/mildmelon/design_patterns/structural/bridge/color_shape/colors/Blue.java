package com.mildmelon.design_patterns.structural.bridge.color_shape.colors;

import com.mildmelon.design_patterns.structural.bridge.color_shape.Color;

public class Blue implements Color {

    @Override
    public String applyColor() {
        return "Applying blue color";
    }

}
