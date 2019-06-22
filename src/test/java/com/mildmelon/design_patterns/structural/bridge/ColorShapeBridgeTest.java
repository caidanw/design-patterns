package com.mildmelon.design_patterns.structural.bridge;

import com.mildmelon.design_patterns.structural.bridge.color_shape.Color;
import com.mildmelon.design_patterns.structural.bridge.color_shape.Shape;
import com.mildmelon.design_patterns.structural.bridge.color_shape.colors.Blue;
import com.mildmelon.design_patterns.structural.bridge.color_shape.colors.Green;
import com.mildmelon.design_patterns.structural.bridge.color_shape.colors.Red;
import com.mildmelon.design_patterns.structural.bridge.color_shape.shapes.Circle;
import com.mildmelon.design_patterns.structural.bridge.color_shape.shapes.Square;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ColorShapeBridgeTest {

    @Test
    public void colorShapeBridgeTest() {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape square = new Square(blue);
        Shape circle = new Circle(red);

        log.info(square.applyColor());
        log.info(circle.applyColor());

        Shape greenCircle = new Circle(green);
        Shape greenSquare = new Square(green);

        log.info(greenCircle.applyColor());
        log.info(greenSquare.applyColor());
    }

}
