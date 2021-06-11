package com.o9uzdev.javaChartBallAnimation;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallPane extends Pane {
    public final double radius = 20;
    private double x = radius, y = radius;
    private Circle circle = new Circle(x, y, radius);

    public BallPane() {
        circle.setFill(Color.BLUE); // Set ball color
        getChildren().add(circle); // Place a ball into this pane
    }
}
